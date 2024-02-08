package com.ohgiraffers.student.registManager.model.service;

import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;
import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;

import java.util.List;
import java.util.Map;

public class RegistService {
    public List<LectureDTO> selectLectureByCondition(Map<String, String> parameter) {
        return null;
    }

    public boolean addNewRegist(int parameter, AdminStudentDTO student) {
        return false;
    }

    public List<LectureDTO> selectLectureByStudent(int studentCode) {
        return null;
    }


    public List<LectureDTO> deleteRegist(int lectureCode, int studentCode) {
        return null;
    }


}
