package com.ohgiraffers.admin.lectureManager.view;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.admin.lectureManager.controller.LectureController;
import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;
import com.ohgiraffers.admin.professorManager.model.dto.ProfessorDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LectureMenu {
    public void adminLectureDisplayMenu() {
        Scanner sc = new Scanner(System.in);
        LectureController lectureController = new LectureController();

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
                case 1 : lectureController.selectAllLectureList();break;
                case 2 : lectureController.selectLectureByCondition(inputSearchCondition()); break;
                case 3 : lectureController.addNewLecture(inputNewLectureInfo());break;
                case 4 : lectureController.modifyLecture(inputModifyLectureInfo()); break;
                case 5 : lectureController.deleteLecture(inputDeleteLectureInfo()); break;
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
        System.out.println("1.교수이름으로 조회");
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

        SearchCondition searchCondition = new SearchCondition();
        searchCondition.setOption(option);
        searchCondition.setValue(value);

        return searchCondition;
    }
    /* 조건 선택 end */

    /* 수업 등록 start */
    private LectureDTO inputNewLectureInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("등록할 교수를 입력해주세요");
        LectureDTO lectureDTO = new LectureDTO();
        getLectureInfo(lectureDTO);
        System.out.println("===================================");

        return lectureDTO;
    }

    private static LectureDTO getLectureInfo(LectureDTO lectureDTO) {
        Scanner sc = new Scanner(System.in);

        System.out.println("등록할 수업 정원을 입력해주세요");
        System.out.print("=> ");
        int lectureLimit = sc.nextInt();
        System.out.println("등록할 수업장소를 입력해주세요");
        System.out.print("=> ");
        String lecturePlace = sc.nextLine();
        System.out.println("등록할 교수 코드를 입력해주세요");
        System.out.print("=> ");
        int professorCode = sc.nextInt();
        System.out.println("등록할 수업 코드를 입력해주세요");
        System.out.print("=> ");
        int classCode = sc.nextInt();
        System.out.println("등록할 개설학기를 입력해주세요");
        System.out.print("=> ");
        String semester = sc.nextLine();

        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setProfessorCode(professorCode);
        ClassDTO classDTO = new ClassDTO();
        classDTO.setClassCode(classCode);

        lectureDTO.setLectureLimit(lectureLimit);
        lectureDTO.setLecturePlace(lecturePlace);
        lectureDTO.setProfessorCode(professorDTO);
        lectureDTO.setClassCode(classDTO);
        lectureDTO.setSemester(semester);

        return lectureDTO;
    }
    /* 수업 등록 end */

    /* 수업 수정 start */
    private static LectureDTO inputModifyLectureInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("수정할 강의코드를 입력해주세요");
        System.out.print("=> ");
        int lectureCode = sc.nextInt();
        System.out.println("등록할 수업 정원을 입력해주세요");
        System.out.print("=> ");
        int lectureLimit = sc.nextInt();
        System.out.println("등록할 수업장소를 입력해주세요");
        System.out.print("=> ");
        String lecturePlace = sc.nextLine();
        System.out.println("등록할 교수 코드를 입력해주세요");
        System.out.print("=> ");
        int professorCode = sc.nextInt();
        System.out.println("등록할 수업 코드를 입력해주세요");
        System.out.print("=> ");
        int classCode = sc.nextInt();
        System.out.println("등록할 개설학기를 입력해주세요");
        System.out.print("=> ");
        String semester = sc.nextLine();

        LectureDTO lectureDTO = new LectureDTO();

        lectureDTO.setLectureCode(lectureCode);
        lectureDTO.setLectureLimit(lectureLimit);
        lectureDTO.setLecturePlace(lecturePlace);
        lectureDTO.setProfessorCode(professorCode);
        lectureDTO.setClassCode(classCode);
        lectureDTO.setSemester(semester);


        return lectureDTO;
    }
    /* 수업 수정 end */

    /* 수업 삭제 start */
    private static Map<String, String> inputDeleteLectureInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("삭제할 강의코드를 입력해주세요");
        System.out.print("=> ");
        String lectureCode = sc.nextLine();
        System.out.println();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("lectureCode", lectureCode);

        return parameter;
    }
    /* 수업 삭제 end */
}
