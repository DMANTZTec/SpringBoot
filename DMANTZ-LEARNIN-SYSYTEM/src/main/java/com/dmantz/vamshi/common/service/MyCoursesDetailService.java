package com.dmantz.vamshi.common.service;

import java.util.List;

import com.dmantz.vamshi.common.entity.TraineeCoursesDetail;

public interface MyCoursesDetailService {
  public List<TraineeCoursesDetail> findByTraineeId(int traineeId);
}
