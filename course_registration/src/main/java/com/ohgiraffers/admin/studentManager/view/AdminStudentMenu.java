package com.ohgiraffers.admin.studentManager.view;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.admin.studentManager.controller.StudentController;
import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdminStudentMenu {
    public void adminStudentDisplayMenu() {
        Scanner sc = new Scanner(System.in);
        StudentController studentController = new StudentController();

        do {
            System.out.println("========== 학생 관리 메뉴 =========");
            System.out.println("1.전체 학생 조회");
            System.out.println("2.조건으로 학생 조회");
            System.out.println("3.학생 추가");
            System.out.println("4.학생 수정");
            System.out.println("5.학생 삭제");
            System.out.println("6.이전 메뉴로");
            System.out.println("원하시는 관리 메뉴 번호를 선택해주세요");
            System.out.print("=> ");

            int selectMenu = sc.nextInt();

            switch (selectMenu){
                case 1 : studentController.selectAllStudentList();break;
                case 2 : studentController.selectStudentByCondition(inputSearchCondition()); break;
                case 3 : studentController.addNewStudent(inputNewStudentInfo());break;
                case 4 : studentController.modifyStudent(inputModifyStudentInfo()); break;
                case 5 : studentController.deleteStudent(inputDeleteStudentInfo()); break;
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
        System.out.println("3.학적으로 조회");
        System.out.println("4.전공으로 조회");
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
                option = "studentStatus";
                System.out.println("조회할 학적을 입력해주세요");
                System.out.println("( E-재학중, T-휴학, G-졸업, O-퇴학 )");
                System.out.print("=> ");
                value = sc.nextLine();
                break;
            case 4 :
                sc.nextLine();
                option = "majorSubject";
                System.out.println("조회할 전공을 입력해주세요");
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
    private AdminStudentDTO inputNewStudentInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("등록할 수업을 입력해주세요");
        AdminStudentDTO adminStudentDTO = new AdminStudentDTO();
        getAdminStudentInfo(adminStudentDTO);
        System.out.println("===================================");

        return adminStudentDTO;
    }

    private static AdminStudentDTO getAdminStudentInfo(AdminStudentDTO adminStudentDTO) {
        Scanner sc = new Scanner(System.in);

        System.out.println("학생의 이름을 입력해주세요");
        System.out.print("=> ");
        String studentName = sc.nextLine();
        System.out.println("학생의 연락처를 입력해주세요");
        System.out.print("=> ");
        String studentPhone = sc.nextLine();
        System.out.println("학생의 학년을 입력해주세요");
        System.out.print("=> ");
        int studentGrade = sc.nextInt();
        System.out.println("학생의 비밀번호를 입력해주세요");
        System.out.print("=> ");
        sc.nextLine();
        String password = sc.nextLine();
        System.out.println("학생의 학적을 입력해주세요");
        System.out.println("( E-재학중, T-휴학, G-졸업, O-퇴학 )");
        System.out.print("=> ");
        String studentStatus = sc.nextLine();
        System.out.println("학생의 전공 코드를 입력해주세요");
        System.out.print("=> ");
        int majorSubject = sc.nextInt();
        System.out.println("학생의 교수 코드를 입력해주세요");
        System.out.print("=> ");
        int tutorProfessor = sc.nextInt();

        adminStudentDTO.setStudentName(studentName);
        adminStudentDTO.setStudentPhone(studentPhone);
        adminStudentDTO.setStudentGrade(studentGrade);
        adminStudentDTO.setPassword(password);
        adminStudentDTO.setStudentStatus(studentStatus);
        adminStudentDTO.setMajorSubject(majorSubject);
        adminStudentDTO.setTutorProfessor(tutorProfessor);

        return adminStudentDTO;
    }
    /* 수업 등록 end */

    /* 수업 수정 start */
    private static AdminStudentDTO inputModifyStudentInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("학생의 코드를 입력해주세요");
        System.out.print("=> ");
        int studentCode = sc.nextInt();
        System.out.println("학생의 이름을 입력해주세요");
        System.out.print("=> ");
        sc.nextLine();
        String studentName = sc.nextLine();
        System.out.println("학생의 연락처를 입력해주세요");
        System.out.print("=> ");
        String studentPhone = sc.nextLine();
        System.out.println("학생의 학년을 입력해주세요");
        System.out.print("=> ");
        int studentGrade = sc.nextInt();
        System.out.println("학생의 비밀번호를 입력해주세요");
        System.out.print("=> ");
        sc.nextLine();
        String password = sc.nextLine();
        System.out.println("학생의 학적을 입력해주세요");
        System.out.println("( E-재학중, T-휴학, G-졸업, O-퇴학 )");
        System.out.print("=> ");
        String studentStatus = sc.nextLine();
        System.out.println("학생의 전공 코드를 입력해주세요");
        System.out.print("=> ");
        int majorSubject = sc.nextInt();
        System.out.println("학생의 교수 코드를 입력해주세요");
        System.out.print("=> ");
        int tutorProfessor = sc.nextInt();

        AdminStudentDTO adminStudentDTO = new AdminStudentDTO();

        adminStudentDTO.setStudentCode(studentCode);
        adminStudentDTO.setStudentName(studentName);
        adminStudentDTO.setStudentPhone(studentPhone);
        adminStudentDTO.setStudentGrade(studentGrade);
        adminStudentDTO.setPassword(password);
        adminStudentDTO.setStudentStatus(studentStatus);
        adminStudentDTO.setMajorSubject(majorSubject);
        adminStudentDTO.setTutorProfessor(tutorProfessor);

        return adminStudentDTO;
    }
    /* 수업 수정 end */

    /* 수업 삭제 start */
    private static Map<String, String> inputDeleteStudentInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("삭제할 학생의 코드를 입력해주세요");
        System.out.println("=> ");
        String studentCode = sc.nextLine();
        System.out.println();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("studentCode", studentCode);

        return parameter;
    }
    /* 수업 삭제 end */
}
