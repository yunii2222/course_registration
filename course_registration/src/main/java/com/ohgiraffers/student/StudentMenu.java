package com.ohgiraffers.student;

import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.student.login.controller.LoginController;
import com.ohgiraffers.student.registManager.view.RegistMenu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMenu {

    public void studentDisplayMenu() {
        Scanner sc = new Scanner(System.in);
        AdminStudentDTO student = new LoginController().studentLogIn(getIdAndPassword());
        boolean isLogin = student != null;

        if(isLogin) {
            do {
                System.out.println("========== 학생 메뉴 =========");
                System.out.println("1.수강신청하기");
                System.out.println("0.이전 메뉴로");
                System.out.println("원하시는 프로그램의 번호를 선택해주세요");
                System.out.print("=> ");
                int selectMenu = sc.nextInt();

                switch (selectMenu) {
                    case 1 : new RegistMenu().registDisplayMenu(student); break;
                    case 0 :
                        System.out.println("이전 메뉴로 돌아갑니다."); return;
                    default:
                        System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
                }
            }while (true);
        }

    }

    public Map<String, Object> getIdAndPassword() {
        Scanner sc = new Scanner(System.in);

        System.out.println("========= 학생 로그인 =========");
        System.out.print("학번 입력 : ");
        int id = sc.nextInt();
        System.out.print("비밀번호 입력 : ");
        sc.nextLine();
        String password = sc.nextLine();

        Map<String, Object> parameter = new HashMap<>();
        parameter.put("studentCode", id);
        parameter.put("password", password);

        return parameter;
    }

}
