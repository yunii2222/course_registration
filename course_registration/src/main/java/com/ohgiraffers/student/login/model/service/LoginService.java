package com.ohgiraffers.student.login.model.service;

import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.student.login.model.dao.LoginDAO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class LoginService {
    private LoginDAO loginDAO;
    public AdminStudentDTO studentlogIn(Map<String, Object> parameter) {
        SqlSession sqlSession = getSqlSession();

        loginDAO = sqlSession.getMapper(LoginDAO.class);

        AdminStudentDTO student = loginDAO.selectStudentByIdAndPassword(parameter);

        sqlSession.close();
        return student;
    }
}
