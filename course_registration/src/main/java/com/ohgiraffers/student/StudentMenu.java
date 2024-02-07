package com.ohgiraffers.student;

import com.ohgiraffers.student.registManager.view.RegistMenu;

import java.util.Scanner;

public class StudentMenu {
    public void studentDisplayMenu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("========== 학생 메뉴 =========");
            System.out.println("1.수강신청하기");
            System.out.println("0.이전 메뉴로");
            System.out.println("원하시는 프로그램의 번호를 선택해주세요");
            System.out.print("=> ");
            int selectMenu = sc.nextInt();

            switch (selectMenu) {
                case 1 : // new RegistMenu().registDisplayMenu();break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }while (true);
    }
}
