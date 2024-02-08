package com.ohgiraffers.student.registManager.controller;


import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;
import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.student.registManager.model.service.RegistService;
import com.ohgiraffers.student.registManager.view.RegistPrint;

import java.util.List;
import java.util.Map;

public class RegistController {

    private RegistService registService = new RegistService();

    private RegistPrint registPrint = new RegistPrint();

    public void selectLectureByCondition(Map<String, String> parameter){
        List<LectureDTO> lectureList = registService.selectLectureByCondition();

        if ( lectureList != null) {
            registPrint.printAllLectureList(lectureList);
        }else {
            registPrint.printErrorMessage("selectOne");
        }
    }


    public void addNewRegist(int i, AdminStudentDTO student) {
    }

    public void selectRegistByStudent(AdminStudentDTO student) {
    }

    public void deleteRegist(int i, AdminStudentDTO student) {
    }
}
