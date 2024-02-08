package com.ohgiraffers.student.registManager.view;

import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.common.SearchCondition;
import com.ohgiraffers.student.registManager.controller.RegistController;

import java.util.HashMap;
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
                System.out.println("========== 수강신청 메뉴 =========");
                System.out.println("1.수강신청하기");
                System.out.println("2.신청한 강의 목록 조회");
                System.out.println("3.이전 메뉴로");
                System.out.println("원하시는 메뉴 번호를 선택해주세요");
                System.out.print("=> ");

                int selectMenu = sc.nextInt();

                switch (selectMenu){

                    case 1 : registController.selectLectureByCondition(registSubMenu());
                             registController.addNewRegist(addSubMenu(), student); break;
                    case 2 : registController.selectLectureByStudent(student);
                             registController.deleteRegist(deleteSubMenu(), student); break;
                    case 3: System.out.println("========상위 메뉴로 이동합니다.========"); return;
                    default : System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요."); break;
                }
            } while (true);
        }
    }

    private int deleteSubMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("신청 취소할 강의 코드를 입력해주세요(취소는 0 입력) : ");
        return sc.nextInt();
    }

    private int addSubMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수강신청할 강의 코드를 입력해주세요(취소는 0 입력) : ");
        return sc.nextInt();
    }

    private Map<String, String> registSubMenu() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("========== 수강신청 =========");
            System.out.println("1.전체강의 조회");
            System.out.println("2.강의 세부검색");
            System.out.println("원하시는 메뉴 번호를 선택해주세요");
            System.out.print("=> ");
            int selectMenu = sc.nextInt();

            Map<String, String> parameter = new HashMap<>();

            /* 1 or 2로 조회를 해
            *    ㄴ네.. */
            switch (selectMenu){
                case 1 : parameter.put("option", "all"); parameter.put("value", ""); break;
                case 2 : inputSearchCondition(parameter); break;
                default : System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요."); break;
            }

            return parameter;

        } while (true);
    }


    private Map<String, String> inputSearchCondition(Map<String, String> parameter) {
        Scanner sc = new Scanner(System.in);
        String option = "";
        String value = "";

        System.out.println("============================");
        System.out.println("검색 조건을 선택해주세요");
        System.out.println("============================");
        System.out.println("1.교수 이름으로 조회");
        System.out.println("2.수업명으로 조회");
        System.out.println("3.개설학기로 조회");
        System.out.println("4.수업장소로 조회");
        System.out.println("===================================");
        System.out.println("원하는 조건의 번호를 입력해 주세요");
        System.out.print("=> ");
        int selectMenu = sc.nextInt();

        switch (selectMenu){
            case 1 :
                sc.nextLine();
                option = "professorName";
                System.out.println("조회할 교수이름을 입력해주세요");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 2 :
                sc.nextLine();
                option = "className";
                System.out.println("조회할 수업명을 입력해주세요");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 3 :
                sc.nextLine();
                option = "semester";
                System.out.println("조회할 개설학기를 입력해주세요");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 4 :
                sc.nextLine();
                option = "lecturePlace";
                System.out.println("조회할 수업장소를 입력해주세요");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            default : System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요."); break;

        }
        parameter.put("option", option);
        parameter.put("value", value);

        return parameter;
    }

}
