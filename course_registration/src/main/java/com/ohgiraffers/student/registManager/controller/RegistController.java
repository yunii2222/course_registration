package com.ohgiraffers.student.registManager.controller;


import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;
import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.common.SearchCondition;
import com.ohgiraffers.student.registManager.model.service.RegistService;
import com.ohgiraffers.student.registManager.view.RegistPrint;

import java.util.List;
import java.util.Map;

public class RegistController {

    private RegistService registService = new RegistService();

    private RegistPrint registPrint = new RegistPrint();

    public void selectLectureByCondition(Map<String, String> parameter){
        SearchCondition searchCondition = new SearchCondition();
        searchCondition.setOption(parameter.get("option"));
        searchCondition.setValue(parameter.get("value"));

        List<LectureDTO> lectureList = registService.selectLectureByCondition(searchCondition);

        if ( lectureList != null) {
            registPrint.printAllLectureList(lectureList);
        }else {
            registPrint.printErrorMessage("lectureList");
        }
    }


    public void addNewRegist(int lectureCode, AdminStudentDTO student) {
        if(lectureCode == 0) {
            registPrint.canclePrint("regist");
            return;
        }
        int studentCode = student.getStudentCode();

        boolean registrationSuccess = registService.addNewRegist(lectureCode, studentCode);
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
        if(lectureCode == 0) {
            registPrint.canclePrint("delete");
            return;
        }

        int studentCode = student.getStudentCode();

        if(registService.deleteRegist(lectureCode, studentCode)){
            registPrint.printSuccessMessage("deleteOne");
        }else {
            registPrint.printErrorMessage("deleteOne");
        }
    }
}
