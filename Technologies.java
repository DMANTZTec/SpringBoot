package src.main.java.com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private int Techid;
	private String Techname;
	
	public int getTechid() {
		return Techid;
	}
	public void setTechid(int techid) {
		Techid = techid;
	}
	public String getTechname() {
		return Techname;
	}
	public void setTechname(String techname) {
		Techname = techname;
	}
	public void tech()
	{
		System.out.println("Successfull");
	}
	

}
