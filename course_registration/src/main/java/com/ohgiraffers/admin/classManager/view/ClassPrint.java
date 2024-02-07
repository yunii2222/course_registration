package com.ohgiraffers.admin.classManager.view;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;

public class ClassPrint {
    public void printAllClassList(List<ClassDTO> allClassList) {
        System.out.println("==== 수업목록 ====");
        for (ClassDTO classDTO : allClassList) {
            System.out.println(classDTO);
        }

    }

    public void printErrorMessage(String errorCode) {
        System.out.println("==== ERROR ====");
        String errorMessage = "";
        switch (errorCode) {
            case "classList":
                errorMessage = "수업 조회 실패";
                break;

        }
    }

    public void printClassList(List<ClassDTO> classList, SearchCondition searchCondition) {

        String searchOption = "";
        switch (searchCondition.getOption()) {
            case "classCode":
                searchOption = "수업코드 검색 결과";
                break;
            case "className":
                searchOption = "수업명으로 검색결과";
                break;
            case "classStatus":
                searchOption = "수업형태로 검색결과";
                break;
            case "category":
                searchOption = "교과구분으로 검색";
                break;
            case "classCredit":
                searchOption = "학점으로 검색";
                break;
            case "classGrade":
                searchOption = "학년으로 검색";
                break;
        }

        System.out.println("==========" + searchOption + " 목록=============");
        for (ClassDTO classDTO :classList){
            System.out.println(classDTO);
        }

        System.out.println("============================");

    }

    public void printSuccessMessage(String successCode) {
        System.out.println("===== Success =====");

        String successMessage = "";
        switch (successCode) {
            case "insert" :
                successMessage = "신규 수업 등록이 완료 되었습니다."; break;
            case "update" :
                successMessage = "수업 수정이 완료되었습니다"; break;
            case "delete" :
                successMessage = "수업 삭제가 완료되었습니다."; break;
        }
        System.out.println(successMessage);

    }
}
