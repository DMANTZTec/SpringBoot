package com.dmantz.project.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dmantz.project.model.Course;
import com.dmantz.project.model.CourseModule;
import com.dmantz.project.model.Courses;
import com.dmantz.project.model.Topic;

@Repository
public  class CourseImplDao implements CourseDao {
	
	
	@Autowired
	private NamedParameterJdbcTemplate namedparameterjdbcTemplate;
    
	@Autowired
	public  CourseImplDao(NamedParameterJdbcTemplate namedparameterjdbcTemplate) {
		this.namedparameterjdbcTemplate = namedparameterjdbcTemplate;
	}
	
	@Override
	public Course fetchCourseById(int CourseId) {
		
		return this.namedparameterjdbcTemplate.queryForObject("SELECT * FROM WHERE course_id= :id", new MapSqlParameterSource("course_id",CourseId), new CourseMapper()); 
		
	}
	
	@Override
	public List<Course> fetchAllCourses() {
		 return this.namedparameterjdbcTemplate.query("SELECT * FROM Course", new CourseMapper());
	}
	
	 private static final class CourseMapper implements RowMapper<Course> {
		 
		 public Course mapRow(ResultSet rs,int rowNum)  throws SQLException{
			 
			 Course course = new Course();
			 course.setCourseId(rs.getInt("course_id"));
			 course.setCourseName(rs.getString("course_name"));
			 course.setCreatedBy(rs.getString("created_by"));
			 course.setCreatedDate(rs.getString("created_dt"));
			 course.setCourseProvider(rs.getString("course_provider"));
			 course.setRecommendedDuration(rs.getString("recommended_duration"));
	
		 return course;
	 }
	 }


@Override
	public List<Courses> getCourseList(int courseId) {
		String SQL="select\r\n"
				+ "course.*,module.*,topic.*\r\n"
				+ "from\r\n"
				+ "course,module,topic\r\n"
				+ "where\r\n"
				+ "course.course_id=module.course_id\r\n"
				+ "AND\r\n"
				+ "module.module_id = topic.module_id\r\n"
				+ "AND course.course_id= :courseId";
		MapSqlParameterSource map = new  MapSqlParameterSource().addValue("courseId", courseId);
		return namedparameterjdbcTemplate.query(SQL,map, new ResultSetExtractor<List<Courses> >(){
			
			public List<Courses> extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				List<Courses> list = new ArrayList<Courses>();
				Map<Integer, Courses> courseMap = new HashMap<Integer, Courses>();
				Map<Integer, CourseModule> moduleMap = new HashMap<Integer, CourseModule>();
				Map<Integer, Topic> topicMap = new HashMap<Integer, Topic>();
				while (rs.next()) {
					 
					Integer courseId = rs.getInt("course_id");
					Courses course = courseMap.get(courseId);
					if(course == null) {
						course = new Courses();
						courseMap.put(courseId,course);
						list.add(course);
						course.setCourseId(courseId);
						course.setCourseName(rs.getString("course_name"));
						
						course.setCreatedDate(rs.getString("created_dt"));
						course.setCourseProvider(rs.getString("course_provider"));
						course.setCreatedBy(rs.getString("created_by"));
						course.setRecommendedDuration(rs.getString("recommended_duration"));
					}
					Integer moduleId = rs.getInt("module_id");
					CourseModule module = moduleMap.get(moduleId);
					if(module == null) {
						module = new CourseModule();
						    moduleMap.put(moduleId,module);
						    module.setModuleId(moduleId);
						    module.setModuleName(rs.getString("module_name"));
						    module.setModuleDescription(rs.getString("module_description"));
						    module.setModuleHours(rs.getInt("module_hours"));
						    if(course.getModuleList()==null) {
						    	course.setModuleList(new ArrayList<CourseModule>());
						    	
						    }
						    Integer topicId = rs.getInt("topic_id");
						    Topic topic = topicMap.get(topicId);
						    if(topic==null) {
						    	topic = new Topic();
						    	topicMap.put(topicId,topic);
						    	topic.setTopicId(topicId);
						    	topic.setTopicName(rs.getString("topic_name"));
						    	topic.setTopicDescription(rs.getString("topic_description"));
						    	topic.setTopicHours(rs.getInt("topic_hours"));
						    	if(module.getTopicList()==null) {
						    		module.setTopicList(new ArrayList<Topic>());
						    	}
						    	
						    }
						    List<CourseModule> coursemodule= course.getModuleList();
						    coursemodule.add(module);
						    List<Topic> coursetopic= module.getTopicList();
						    coursetopic.add(topic);
					}
					 
			
				
			}
				return list;
			
		}
			
	});
 }

}
	 
	
	
	
	

		 
