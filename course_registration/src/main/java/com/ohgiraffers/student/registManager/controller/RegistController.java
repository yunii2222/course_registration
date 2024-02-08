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
        List<LectureDTO> lectureList = registService.selectLectureByCondition(parameter);

        if ( lectureList != null) {
            registPrint.printAllLectureList(lectureList);
        }else {
            registPrint.printErrorMessage("lectureList");
        }
    }


    public void addNewRegist(int parameter, AdminStudentDTO student) {
        boolean registrationSuccess = registService.addNewRegist(parameter, student);
        registPrint.printMessage(registrationSuccess);

    }

    public void selectLectureByStudent(AdminStudentDTO student) {
        int studentCode = student.getStudentCode();

        List<LectureDTO> lectureList = registService.selectLectureByStudent(studentCode);

        if(lectureList != null) {
            registPrint.printLectureListByStudent(lectureList);
        }else {
            registPrint.printErrorMessage("selectOne");
        }
    }

    public void deleteRegist(int lectureCode, AdminStudentDTO student) {

        int studentCode = student.getStudentCode();

        List<LectureDTO> lectureList = registService.deleteRegist(lectureCode, studentCode);

        if(lectureList != null){
            registPrint.printSuccessMessage("deleteOne");
        }else {
            registPrint.printErrorMessage("deleteOne");
        }
    }
}
