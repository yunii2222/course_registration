package com.ohgiraffers.admin.lectureManager.model.dao;

import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;

public interface LectureDAO {
    List<LectureDTO> selectAllLectureList();

    List<LectureDTO> selectLectureByCondition(SearchCondition searchCondition);

    int insertLecture(LectureDTO lectureDTO);

    int updateLecture(LectureDTO lectureDTO);

    int deleteLecture(int lectureCode);
}
