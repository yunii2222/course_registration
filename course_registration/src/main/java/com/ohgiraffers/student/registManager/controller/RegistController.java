package com.ohgiraffers.student.registManager.controller;


import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;
import com.ohgiraffers.student.registManager.model.service.RegistService;
import com.ohgiraffers.student.registManager.view.RegistPrint;

import java.util.List;

public class RegistController {

    private RegistService registService = new RegistService();

    private RegistPrint registPrint = new RegistPrint();

    public void selectLectureByCondition(){
        List<LectureDTO> lectureList = registService.selectLectureByCondition();

        if ( lectureList != null) {
            registPrint.printAllLectureList(lectureList);
        }else {
            registPrint.printErrorMessage("selectOne");
        }
    }





}
