package com.ohgiraffers.student.login.view;

import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;

import java.util.Map;

public class LoginPrint {

    public void printSuccessMessage(AdminStudentDTO student) {
        System.out.println("로그인에 성공하였습니다.");
        System.out.println(student.getStudentName() + "님, 환영합니다.");
    }

    public void printErrorMessage() {
        System.out.println("로그인에 실패하였습니다.");
        System.out.println("비밀번호를 한 번 더 확인하시기 바랍니다.");
    }
}
