package com.ohgiraffers.student.registManager.model.dao;

import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;
import com.ohgiraffers.common.SearchCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RegistDAO {
    List<LectureDTO> selectLectureByCondition(SearchCondition searchCondition);

    int insertRegist(@Param("lectureCode")int lectureCode, @Param("studentCode")int studentCode);

    List<LectureDTO> selectLectureByStudent(int studentCode);

    int deleteRegist(@Param("lectureCode")int lectureCode, @Param("studentCode")int studentCode);
}
