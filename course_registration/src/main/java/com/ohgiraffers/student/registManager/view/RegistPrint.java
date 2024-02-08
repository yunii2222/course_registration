package com.ohgiraffers.student.registManager.view;

import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;

import java.util.List;

public class RegistPrint {
    public void printAllLectureList(List<LectureDTO> lectureList) {
        System.out.println("==== 강의 전체 조회 ====");
        for (LectureDTO lectureDTO : lectureList) {
            System.out.println(lectureDTO);
        }
    }

    public void printErrorMessage(String errorCode) {
        System.out.println("==== ERROR ====");
        String errorMessage = "";
        switch (errorCode) {
            case "lectureList":
                errorMessage = "강의 조회 실패"; break;
            case "insert" :
                errorMessage = "신규 수업 등록이 실패했습니다"; break;
            case "update" :
                errorMessage = "수업 수정이 실패했습니다"; break;
            case "delete" :
                errorMessage = "수업 삭제가 실패했습니다."; break;

        }
    }
}
