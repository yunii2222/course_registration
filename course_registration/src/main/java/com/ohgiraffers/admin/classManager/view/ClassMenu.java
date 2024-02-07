package com.ohgiraffers.admin.classManager.view;

import com.ohgiraffers.admin.classManager.controller.ClassController;
import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassMenu {
    public void adminClassDisplayMenu() {
        Scanner sc = new Scanner(System.in);
        ClassController classController = new ClassController();

        do {
            System.out.println("========== 수업 관리 메뉴 =========");
            System.out.println("1.전체 수업 조회");
            System.out.println("2.조건 수업 조회");
            System.out.println("3.수업 추가");
            System.out.println("4.수업 수정");
            System.out.println("5.수업 삭제");
            System.out.println("6.이전 메뉴로");
            System.out.println("원하시는 관리 메뉴 번호를 선택해주세요");
            System.out.print("=> ");

            int selectMenu = sc.nextInt();

            switch (selectMenu){
                case 1 : classController.selectAllClassList();break;
                case 2 : classController.selectClassByCondition(inputSearchCondition()); break;
                case 3 : classController.addNewClass(inputNewClassInfo());break;
                case 4 : classController.modifyClass(inputModifyClassInfo()); break;
                case 5 : classController.deleteClass(inputDeleteClassInfo()); break;
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
        System.out.println("1.수업코드로 조회");
        System.out.println("2.수업명으로 조회");
        System.out.println("3.수업형태로 조회");
        System.out.println("4.교과구분으로 조회");
        System.out.println("5.학점으로 조회");
        System.out.println("6.학년으로 조회");
        System.out.println("0.이전 메뉴로");
        System.out.println("===================================");
        System.out.println("원하는 조건의 번호를 입력해 주세요");
        System.out.print("=> ");
        int selectMenu = sc.nextInt();

        switch (selectMenu){
            case 1 :
                sc.nextLine();
                option = "classCode";
                System.out.println("조회할 수업 코드를 입력해주세요");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 2 :
                sc.nextLine();
                option = "className";
                System.out.println("조회할 수업 명을 입력해주세요.");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 3 :
                sc.nextLine();
                option = "classStatus";
                System.out.println("조회할 수업형태를 입력해주세요. (온라인 or 오프라인)");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 4 :
                sc.nextLine();
                option = "category";
                System.out.println("조회할 교과구분을 입력해주세요. (전공 or 교양)");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 5 :
                sc.nextLine();
                option = "classCredit";
                System.out.println("조회할 학점이 몇점짜리인지 입력해주세요. (1~3)");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 6 :
                sc.nextLine();
                option = "classGrade";
                System.out.println("조회할 학년을 입력해주세요.");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 0 : System.out.println("========상위 메뉴로 이동합니다.========"); return null;
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

        System.out.println("수업 명을 입력해주세요.");
        System.out.print("=> ");
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

        classDTO.setClassName(className);
        classDTO.setCategory(category);
        classDTO.setClassGrade(classGrade);
        classDTO.setClassCredit(classCredit);
        classDTO.setClassStatus(classStatus);

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

        classDTO.setClassCode(classCode);
        classDTO.setClassName(className);
        classDTO.setCategory(category);
        classDTO.setClassGrade(classGrade);
        classDTO.setClassCredit(classCredit);
        classDTO.setClassStatus(classStatus);

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
