package com.ohgiraffers.student.login.controller;

import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.student.login.model.service.LoginService;
import com.ohgiraffers.student.login.view.LoginPrint;

import java.util.Map;

public class LoginController {
    private LoginService loginService;
    private LoginPrint loginPrint;

    public AdminStudentDTO studentLogIn(Map<String, Object> parameter) {
        loginService = new LoginService();
        loginPrint = new LoginPrint();

        AdminStudentDTO student = loginService.studentlogIn(parameter);

        if(student != null) {
            loginPrint.printSuccessMessage(student);
            return student;
        } else {
            loginPrint.printErrorMessage();
            return null;
        }
    }
}
