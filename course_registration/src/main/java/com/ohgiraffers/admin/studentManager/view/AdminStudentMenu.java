package com.ohgiraffers.admin.studentManager.view;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.admin.studentManager.controller.StudentController;
import com.ohgiraffers.common.SearchCondition;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdminStudentMenu {
    public void adminStudentDisplayMenu() {
        Scanner sc = new Scanner(System.in);
        StudentController studentController = new StudentController();

        do {
            System.out.println("========== 교수 관리 메뉴 =========");
            System.out.println("1.전체 교수 조회");
            System.out.println("2.조건 교수 조회");
            System.out.println("3.교수 추가");
            System.out.println("4.교수 수정");
            System.out.println("5.교수 삭제");
            System.out.println("6.이전 메뉴로");
            System.out.println("원하시는 관리 메뉴 번호를 선택해주세요");
            System.out.print("=> ");

            int selectMenu = sc.nextInt();

            switch (selectMenu){
                case 1 : studentController.selectAllClassList();break;
                case 2 : studentController.selectClassByCondition(inputSearchCondition()); break;
                case 3 : studentController.addNewClass(inputNewClassInfo());break;
                case 4 : studentController.modifyClass(inputModifyClassInfo()); break;
                case 5 : studentController.deleteClass(inputDeleteClassInfo()); break;
                case 6 : System.out.println("========상위 메뉴로 이동합니다.========"); return;
                default : System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요."); break;
            }
        }while (true);
    }
    /* 조건 선택 start */
    private SearchCondition inputSearchCondition() {
        Scanner sc = new Scanner(System.in);
        String option = "";
        String value = "";

        System.out.println("============================");
        System.out.println("조회 하고 싶은 조건을 선택해주세요");
        System.out.println("============================");
        System.out.println("1.학번으로 조회");
        System.out.println("2.학생이름으로 조회");
        System.out.println("3.전공으로 조회");
        System.out.println("4.학적으로 조회");
        System.out.println("===================================");
        System.out.println("원하는 조건의 번호를 입력해 주세요");
        System.out.print("=> ");
        int selectMenu = sc.nextInt();

        switch (selectMenu){
            case 1 :
                sc.nextLine();
                option = "studentCode";
                System.out.println("조회할 학번을 입력해주세요");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 2 :
                sc.nextLine();
                option = "studentName";
                System.out.println("조회할 학생이름을 입력해주세요");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 3 :
                sc.nextLine();
                option = "Status";
                System.out.println("조회할 전공을 입력해주세요");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 4 :
                sc.nextLine();
                option = "category";
                System.out.println("조회할 학적을 입력해주세요");
                System.out.println("( E-재학중, T-휴학, G-졸업, O-퇴학 )");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            default : System.out.println("잘못된 번호입니다. 확인 후 다시 입력해 주세요."); break;

        }

        SearchCondition searchCondition = new SearchCondition();
        searchCondition.setOption(option);
        searchCondition.setValue(value);

        return searchCondition;
    }
    /* 조건 선택 end */

    /* 수업 등록 start */
    private ClassDTO inputNewClassInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("등록할 수업을 입력해주세요");
        ClassDTO classDTO = new ClassDTO();
        getClassInfo(classDTO);
        System.out.println("===================================");

        return classDTO;
    }

    private static ClassDTO getClassInfo(ClassDTO classDTO) {
        Scanner sc = new Scanner(System.in);

        System.out.println("학생이름을 입력해주세요.");
        System.out.print("=> ");
        String className = sc.nextLine();
        System.out.println("전공을 입력해주세요. (전공 or 교양)");
        System.out.print("=> ");
        String category = sc.nextLine();
        System.out.println("학적을 입력해주세요.");
        System.out.print("=> ");
        int classGrade = sc.nextInt();
        String classStatus = sc.nextLine();


        return classDTO;
    }
    /* 수업 등록 end */

    /* 수업 수정 start */
    private static ClassDTO inputModifyClassInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("수정할 수업의 코드를 입력해주세요");
        System.out.print("=> ");
        int classCode = sc.nextInt();
        System.out.println("수업 명을 입력해주세요.");
        System.out.print("=> ");
        sc.nextLine();
        String className = sc.nextLine();
        System.out.println("교과구분을 입력해주세요. (전공 or 교양)");
        System.out.print("=> ");
        String category = sc.nextLine();
        System.out.println("학년을 입력해주세요.");
        System.out.print("=> ");
        int classGrade = sc.nextInt();
        System.out.println("학점을 입력해주세요.(1~3)");
        System.out.print("=> ");
        sc.nextLine();
        String classCredit = sc.nextLine();
        System.out.println("수업형태를 입력해주세요. (온라인 or 오프라인)");
        System.out.print("=> ");
        String classStatus = sc.nextLine();

        ClassDTO classDTO = new ClassDTO();

        return classDTO;
    }
    /* 수업 수정 end */

    /* 수업 삭제 start */
    private static Map<String, String> inputDeleteClassInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("삭제할 수업의 코드를 입력해주세요");
        System.out.println("=> ");
        String classCode = sc.nextLine();
        System.out.println();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("classCode", classCode);

        return parameter;
    }
    /* 수업 삭제 end */
}
