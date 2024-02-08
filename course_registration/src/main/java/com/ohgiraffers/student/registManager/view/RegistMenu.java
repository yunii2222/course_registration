package com.ohgiraffers.student.registManager.view;

import com.ohgiraffers.admin.studentManager.model.dto.StudentDTO;

import java.util.Map;

public class RegistMenu {

    public void registDisplayMenu(StudentDTO student) {
        /* 1. 수강신청
             - 전체조회 혹은 조건조회해서 신청하면 RegistDTO가 insert된다
        * 2. 신청한 강의 목록 조회 (매개변수로 전달된 StudentDTO 객체를 통해 List<RegistDTO>를 받아오게 될 것)
        *    - 기본적으로 해당 학생 이름으로 등록된 RegistDTO를 조회한다
             - 사용자가 희망할 경우 수강신청을 취소할 수 있다 (취소할 수강신청코드를 입력받아 삭제)
         3. 휴학, 퇴학, 졸업한 학생은 수강신청 대상자가 아니다
        * */
    }
}
