package com.ohgiraffers.student.login.model.dao;

import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;

import java.util.Map;

public interface LoginDAO {

    AdminStudentDTO selectStudentByIdAndPassword(Map<String, Object> parameter);
}
