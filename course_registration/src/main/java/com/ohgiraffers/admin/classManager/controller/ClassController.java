package com.ohgiraffers.admin.classManager.controller;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.admin.classManager.model.service.ClassService;
import com.ohgiraffers.admin.classManager.view.ClassPrint;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;
import java.util.Map;

public class ClassController {


    private ClassService classService = new ClassService();

    private ClassPrint classPrint = new ClassPrint();

    public List<ClassDTO> selectAllClassList(){
        List<ClassDTO> classList = classService.selectAllClassList();

        if ( classList != null) {
            classPrint.printAllClassList(classList);
        }else {
            classPrint.printErrorMessage("selectOne");
        }

        return classList;
    }

    public void selectClassByCondition(SearchCondition searchCondition){

        List<ClassDTO> classList = classService.selectClassByCondition(searchCondition);

        if(classList != null && !classList.isEmpty()){
            classPrint.printClassList(classList, searchCondition);
        }else {
            classPrint.printErrorMessage("selectClassList");
        }

    }

    public void addNewClass(ClassDTO classDTO) {

        if(classService.addNewClass(classDTO)){
            classPrint.printSuccessMessage("insert");
        }else {
            classPrint.printErrorMessage("insert");
        }
    }

    public void modifyClass(ClassDTO classDTO) {

        if(classService.modifyClass(classDTO)){
            classPrint.printSuccessMessage("update");
        }else {
            classPrint.printErrorMessage("update");
        }
    }

    public void deleteClass(Map<String, String> parameter) {

        int classCode = Integer.parseInt(parameter.get("classCode"));

        if (classService.deleteClass(classCode)) {
            classPrint.printSuccessMessage("delete");
        }else {
            classPrint.printErrorMessage("delete");
        }
    }




}
