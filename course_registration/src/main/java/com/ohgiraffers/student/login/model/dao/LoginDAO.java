package com.ohgiraffers.student.login.model.dao;

import com.ohgiraffers.admin.studentManager.model.dto.StudentDTO;

import java.util.Map;

public interface LoginDAO {

    StudentDTO selectStudentByIdAndPassword(Map<String, Object> parameter);
}
