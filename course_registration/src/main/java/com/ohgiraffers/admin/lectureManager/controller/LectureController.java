package com.ohgiraffers.admin.lectureManager.controller;

import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;
import com.ohgiraffers.admin.lectureManager.model.service.LectureService;
import com.ohgiraffers.admin.lectureManager.view.LecturePrint;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;
import java.util.Map;

public class LectureController {
    private LectureService lectureService = new LectureService();

    private LecturePrint LecturePrint = new LecturePrint();

    public List<LectureDTO> selectAllLectureList(){
        List<LectureDTO> lectureList = lectureService.selectAllLectureList();

        if ( lectureList != null) {
            LecturePrint.printAllLectureList(lectureList);
        }else {
            LecturePrint.printErrorMessage("selectOne");
        }

        return lectureList;
    }

    public void selectLectureByCondition(SearchCondition searchCondition){

        List<LectureDTO> lectureList = lectureService.selectLectureByCondition(searchCondition);

        if(lectureList != null && !lectureList.isEmpty()){
            LecturePrint.printLectureList(lectureList, searchCondition);
        }else {
            LecturePrint.printErrorMessage("selectLectureList");
        }

    }

    public void addNewLecture(LectureDTO lectureDTO) {

        if(lectureService.addNewLecture(lectureDTO)){
            LecturePrint.printSuccessMessage("insert");
        }else {
            LecturePrint.printErrorMessage("insert");
        }
    }

    public void modifyLecture(LectureDTO lectureDTO) {

        if(lectureService.modifyLecture(lectureDTO)){
            LecturePrint.printSuccessMessage("update");
        }else {
            LecturePrint.printErrorMessage("update");
        }
    }

    public void deleteLecture(Map<String, String> parameter) {

        int lectureCode = Integer.parseInt(parameter.get("lectureCode"));

        if (lectureService.deleteLecture(lectureCode)) {
            LecturePrint.printSuccessMessage("delete");
        }else {
            LecturePrint.printErrorMessage("delete");
        }
    }
}
