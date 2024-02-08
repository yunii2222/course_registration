package com.ohgiraffers.admin.professorManager.view;

import com.ohgiraffers.admin.professorManager.controller.ProfessorController;
import com.ohgiraffers.admin.professorManager.model.dto.ProfessorDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class ProfessorMenu {
        public void adminProfessorDisplayMenu() {
            Scanner sc = new Scanner(System.in);
            ProfessorController professorController = new ProfessorController();

            do {
                System.out.println("========== 교수 관리 메뉴 =========");
                System.out.println("1.전체 교수 조회");
                System.out.println("2.조건으로 교수 조회");
                System.out.println("3.교수 추가");
                System.out.println("4.교수 수정");
                System.out.println("5.교수 삭제");
                System.out.println("6.이전 메뉴로");
                System.out.println("원하시는 관리 메뉴 번호를 선택해주세요");
                System.out.print("=> ");

                int selectMenu = sc.nextInt();

                switch (selectMenu){
                    case 1 : professorController.selectAllProfessorList();break;
                    case 2 : professorController.selectProfessorByCondition(inputSearchCondition()); break;
                    case 3 : professorController.addNewProfessor(inputNewProfessorInfo());break;
                    case 4 : professorController.modifyProfessor(inputModifyProfessorInfo()); break;
                    case 5 : professorController.deleteProfessor(inputDeleteProfessorInfo()); break;
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
            System.out.println("1.교수 이름으로 조회");
            System.out.println("2.교수 연락처로 조회");
            System.out.println("3.교수 전공 코드로 조회");
            System.out.println("===================================");
            System.out.println("원하는 조건의 번호를 입력해 주세요");
            System.out.print("=> ");
            int selectMenu = sc.nextInt();

            switch (selectMenu){
                case 1 :
                    sc.nextLine();
                    option = "professorName";
                    System.out.println("조회할 교수 이름을 입력해주세요");
                    System.out.print("=> ");
                    value = sc.nextLine();
                    break;
                case 2 :
                    sc.nextLine();
                    option = "professorPhone";
                    System.out.println("조회할 교수 연락처를 입력해주세요");
                    System.out.print("=> ");
                    value = sc.nextLine();
                    break;
                case 3 :
                    sc.nextLine();
                    option = "subjectCode";
                    System.out.println("조회할 교수 전공 코드를 입력해주세요");
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
        private ProfessorDTO inputNewProfessorInfo() {
            Scanner sc = new Scanner(System.in);

            System.out.println("===================================");
            System.out.println("등록할 교수를 입력해주세요");
            ProfessorDTO professorDTO = new ProfessorDTO();
            getProfessorInfo(professorDTO);
            System.out.println("===================================");

            return professorDTO;
        }

        private static ProfessorDTO getProfessorInfo(ProfessorDTO professorDTO) {
            Scanner sc = new Scanner(System.in);

            System.out.println("등록할 교수의 이름을 입력해주세요");
            System.out.print("=> ");
            String professorName = sc.nextLine();
            System.out.println("등록할 교수의 전화번호를 입력해주세요");
            System.out.print("=> ");
            String professorPhone = sc.nextLine();
            System.out.println("등록할 전공 코드를 입력해주세요");
            System.out.print("=> ");
            int subjectCode = sc.nextInt();

            professorDTO.setProfessorName(professorName);
            professorDTO.setProfessorPhone(professorPhone);
            professorDTO.setSubjectCode(subjectCode);

            return professorDTO;
        }
        /* 수업 등록 end */

        /* 수업 수정 start */
        private static ProfessorDTO inputModifyProfessorInfo() {
            Scanner sc = new Scanner(System.in);

            System.out.println("===================================");
            System.out.println("수정할 교수 코드를 입력해주세요");
            System.out.print("=> ");
            int professorCode = sc.nextInt();
            System.out.println("등록할 교수의 이름을 입력해주세요");
            System.out.print("=> ");
            sc.nextLine();
            String professorName = sc.nextLine();
            System.out.println("등록할 교수의 전화번호를 입력해주세요");
            System.out.print("=> ");
            String professorPhone = sc.nextLine();
            System.out.println("등록할 전공 코드를 입력해주세요");
            System.out.print("=> ");
            int subjectCode = sc.nextInt();

            ProfessorDTO professorDTO = new ProfessorDTO();

            professorDTO.setProfessorCode(professorCode);
            professorDTO.setProfessorName(professorName);
            professorDTO.setProfessorPhone(professorPhone);
            professorDTO.setSubjectCode(subjectCode);

            return professorDTO;
        }
        /* 수업 수정 end */

        /* 수업 삭제 start */
        private static Map<String, String> inputDeleteProfessorInfo() {
            Scanner sc = new Scanner(System.in);

            System.out.println("===================================");
            System.out.println("삭제할 교수 코드를 입력해주세요");
            System.out.print("=> ");
            String professorCode = sc.nextLine();
            System.out.println();

            Map<String, String> parameter = new HashMap<>();
            parameter.put("professorCode", professorCode);

            return parameter;
        }
        /* 수업 삭제 end */
    }
