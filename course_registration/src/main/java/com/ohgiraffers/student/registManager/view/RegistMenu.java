package com.ohgiraffers.student.registManager.view;

import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.student.registManager.controller.RegistController;

import java.util.Map;
import java.util.Scanner;

public class RegistMenu {

    public void registDisplayMenu(AdminStudentDTO student) {
        /* 1. 수강신청
             - 전체조회 혹은 조건조회해서 신청하면 RegistDTO가 insert된다
        * 2. 신청한 강의 목록 조회 (매개변수로 전달된 StudentDTO 객체를 통해 List<RegistDTO>를 받아오게 될 것)
        *    - 기본적으로 해당 학생 이름으로 등록된 RegistDTO를 조회한다
             - 사용자가 희망할 경우 수강신청을 취소할 수 있다 (취소할 수강신청코드를 입력받아 삭제)
         3. 휴학, 퇴학, 졸업한 학생은 수강신청 대상자가 아니다
        * */
        if(!student.getStudentStatus().equals("E")) {
            String name = student.getStudentName();
            System.out.println(name + "학생은 수강신청 대상자가 아닙니다.");
        } else {
            Scanner sc = new Scanner(System.in);
            RegistController registController = new RegistController();

            do {
                System.out.println("========== 수업 관리 메뉴 =========");
                System.out.println("1.전체 수업 조회");
                System.out.println("2.조건 수업 조회");
                System.out.println("3.이전 메뉴로");
                System.out.println("원하시는 관리 메뉴 번호를 선택해주세요");
                System.out.print("=> ");

                int selectMenu = sc.nextInt();

                switch (selectMenu){
                    case 1 : break;
                    case 2 : break;
                    case 63: System.out.println("========상위 메뉴로 이동합니다.========"); return;
                    default : System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요."); break;
                }
            } while (true);
        }
    }
}
