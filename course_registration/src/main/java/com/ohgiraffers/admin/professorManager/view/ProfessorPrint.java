package com.ohgiraffers.admin.professorManager.view;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.admin.professorManager.model.dto.ProfessorDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;

public class ProfessorPrint {
    public void printAllProfessorList(List<ProfessorDTO> professorList) {
        System.out.println("==== 교수목록 ====");
        for (ProfessorDTO professorDTO : professorList) {
            System.out.println(professorDTO);
        }
    }

    public void printErrorMessage(String errorCode) {
        System.out.println("==== ERROR ====");
        String errorMessage = "";
        switch (errorCode) {
            case "professorList":
                errorMessage = "교수 조회 실패";
                break;
            case "insert" :
                errorMessage = "신규 교수 등록에 실패했습니다."; break;
            case "update" :
                errorMessage = "교수 수정이 실패했습니다"; break;
            case "delete" :
                errorMessage = "교수 삭제가 실패했습니다."; break;

        }
    }

    public void printProfessorList(List<ProfessorDTO> professorList, SearchCondition searchCondition) {
        String searchOption = "";
        switch (searchCondition.getOption()) {
            case "professorCode":
                searchOption = "교수코드 검색 결과";
                break;
            case "professorName":
                searchOption = "교수명으로 검색결과";
                break;
            case "subjectName":
                searchOption = "학과명으로 검색";
                break;
        }

        System.out.println("==========" + searchOption + " 목록=============");
        for (ProfessorDTO professorDTO :professorList){
            System.out.println(professorDTO);
        }

        System.out.println("============================");

    }

    public void printSuccessMessage(String successCode) {
        System.out.println("===== Success =====");

        String successMessage = "";
        switch (successCode) {
            case "insert" :
                successMessage = "신규 교수 등록이 완료 되었습니다."; break;
            case "update" :
                successMessage = "교수 수정이 완료되었습니다"; break;
            case "delete" :
                successMessage = "교수 삭제가 완료되었습니다."; break;
        }
        System.out.println(successMessage);
    }
}
