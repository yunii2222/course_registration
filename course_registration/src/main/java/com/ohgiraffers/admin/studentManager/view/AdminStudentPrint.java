package com.ohgiraffers.admin.studentManager.view;

import com.ohgiraffers.admin.professorManager.model.dto.ProfessorDTO;
import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;

public class AdminStudentPrint {
    public void printAllStudentList(List<AdminStudentDTO> studentList) {
        System.out.println("==== 교수목록 ====");
        for (AdminStudentDTO adminStudentDTO : studentList) {
            System.out.println(adminStudentDTO);
        }
    }

    public void printErrorMessage(String errorCode) {
        System.out.println("==== ERROR ====");
        String errorMessage = "";
        switch (errorCode) {
            case "studentList":
                errorMessage = "전체 학생 조회 실패";
                break;
            case "insert" :
                errorMessage = "신규 학생 등록에 실패했습니다."; break;
            case "update" :
                errorMessage = "학생 수정이 실패했습니다"; break;
            case "delete" :
                errorMessage = "학생 삭제를 실패했습니다."; break;

        }
        System.out.println(errorMessage);

    }

    public void printStudentList(List<AdminStudentDTO> studentList, SearchCondition searchCondition) {
        String searchOption = "";
        switch (searchCondition.getOption()) {
            case "studentCode":
                searchOption = "학번 검색 결과";
                break;
            case "studentName":
                searchOption = "학생명으로 검색결과";
                break;
            case "subjectName":
                searchOption = "전공명으로 검색";
                break;
            case "studentStatus":
                searchOption = "학번으로 검색";
                break;
        }

        System.out.println("==========" + searchOption + " 목록=============");
        for (AdminStudentDTO adminStudentDTO :studentList){
            System.out.println(adminStudentDTO);
        }

        System.out.println("============================");

    }

    public void printSuccessMessage(String successCode) {
        System.out.println("===== Success =====");

        String successMessage = "";
        switch (successCode) {
            case "insert" :
                successMessage = "신규 학생 등록이 완료 되었습니다."; break;
            case "update" :
                successMessage = "학생 수정이 완료되었습니다"; break;
            case "delete" :
                successMessage = "학생 삭제가 완료되었습니다."; break;
        }
        System.out.println(successMessage);
    }
}
