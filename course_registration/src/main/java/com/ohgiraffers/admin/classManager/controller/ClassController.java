package com.ohgiraffers.admin.classManager.controller;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.admin.classManager.model.service.ClassService;
import com.ohgiraffers.admin.classManager.view.ClassPrint;

import java.util.List;

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




}
