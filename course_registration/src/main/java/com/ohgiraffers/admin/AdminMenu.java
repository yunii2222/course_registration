package com.ohgiraffers.admin;

import com.ohgiraffers.admin.classManager.view.ClassMenu;
import com.ohgiraffers.admin.lectureManager.view.LectureMenu;
import com.ohgiraffers.admin.professorManager.view.ProfessorMenu;
import com.ohgiraffers.admin.studentManager.view.AdminStudentMenu;

import java.util.Scanner;

public class AdminMenu {
    public void adminDisplayMenu() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("========== 관리자 메뉴 =========");
            System.out.println("1.수업 관리 메뉴");
            System.out.println("2.강의 관리 메뉴");
            System.out.println("3.학생 관리 메뉴");
            System.out.println("4.교수 관리 메뉴");
            System.out.println("0.이전 메뉴로");
            System.out.println("원하는 관리자 메뉴 번호를 선택해주세요");
            System.out.print("=> ");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1 : new ClassMenu().adminClassDisplayMenu();break;
                case 2 : new LectureMenu().adminLectureDisplayMenu();break;
                case 3 : new ProfessorMenu().adminProfessorDisplayMenu();break;
                case 4 : new AdminStudentMenu().adminStudentDisplayMenu();break;
                case 0 :
                    System.out.println("이전 메뉴로"); return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }while (true);
    }
}
