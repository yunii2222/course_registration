package com.ohgiraffers.admin.lectureManager.view;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;

public class LecturePrint {
    public void printAllLectureList(List<LectureDTO> lectureList) {
        System.out.println("==== 수업목록 ====");
        for (LectureDTO lectureDTO : lectureList) {
            System.out.println(lectureDTO);
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

    public void printLectureList(List<LectureDTO> lectureList, SearchCondition searchCondition) {
        String searchOption = "";
        switch (searchCondition.getOption()) {
            case "professorName":
                searchOption = "교수명으로 검색 결과";
                break;
            case "className":
                searchOption = "수업명으로 검색 결과";
                break;
            case "semester":
                searchOption = "개설학기로 검색결과";
                break;
            case "lecturePlace":
                searchOption = "수업장소로 검색결과";
                break;
        }

        System.out.println("==========" + searchOption + " 목록=============");
        for (LectureDTO LectureDTO :lectureList){
            System.out.println(LectureDTO);
        }

        System.out.println("============================");
    }

    public void printSuccessMessage(String successCode) {
        System.out.println("===== Success =====");

        String successMessage = "";
        switch (successCode) {
            case "insert" :
                successMessage = "신규 강의 등록이 완료 되었습니다."; break;
            case "update" :
                successMessage = "강의 수정이 완료되었습니다"; break;
            case "delete" :
                successMessage = "강의 삭제가 완료되었습니다."; break;
        }
        System.out.println(successMessage);
    }
}
