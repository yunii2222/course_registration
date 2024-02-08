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
                errorMessage = "전체 강의 조회 실패";
            case "selectOne" :
                errorMessage = "신청한 강의 조회 실패";

        }
        System.out.println(errorMessage);
    }
    public void printSuccessMessage(String successCode) {
        System.out.println("==== Success ====");
        String successMessage = "";
        switch (successCode) {
            case "deleteOne" :
                successMessage = "해당 강의를 취소했습니다.";
        }

    }

    public void printMessage(boolean isSuccess) {
        if (isSuccess) {
            System.out.println("수강신청이 완료되었습니다.");
        } else {
            System.out.println("수강신청에 실패하였습니다.");
        }
    }


    public void printLectureListByStudent(List<LectureDTO> lectureList) {
        for (LectureDTO lectureDTO : lectureList) {
            System.out.println(lectureDTO);
        }
    }




}
