package com.ohgiraffers.admin.professorManager.controller;

import com.ohgiraffers.admin.professorManager.model.dto.ProfessorDTO;
import com.ohgiraffers.admin.professorManager.model.service.ProfessorService;
import com.ohgiraffers.admin.professorManager.view.ProfessorPrint;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;
import java.util.Map;

public class ProfessorController {
    private ProfessorService professorService = new ProfessorService();

    private ProfessorPrint professorPrint = new ProfessorPrint();

    public List<ProfessorDTO> selectAllProfessorList(){
        List<ProfessorDTO> professorList = professorService.selectAllProfessorList();

        if ( professorList != null) {
            professorPrint.printAllProfessorList(professorList);
        }else {
            professorPrint.printErrorMessage("selectOne");
        }

        return professorList;
    }

    public void selectProfessorByCondition(SearchCondition searchCondition){

        List<ProfessorDTO> professorList = professorService.selectProfessorByCondition(searchCondition);

        if ( professorList != null && !professorList.isEmpty()) {
            professorPrint.printProfessorList(professorList,searchCondition);
        }else {
            professorPrint.printErrorMessage("selectClassList");
        }
    }

    public void addNewProfessor(ProfessorDTO professorDTO) {

        if(professorService.addNewProfessor(professorDTO)){
            professorPrint.printSuccessMessage("insert");
        }else {
            professorPrint.printErrorMessage("insert");
        }
    }

    public void modifyProfessor(ProfessorDTO professorDTO) {

        if(professorService.modifyProfessor(professorDTO)){
            professorPrint.printSuccessMessage("update");
        }else {
            professorPrint.printErrorMessage("update");
        }
    }

    public void deleteProfessor(Map<String, String> parameter) {

        int professorCode = Integer.parseInt(parameter.get("professorCode"));

        if (professorService.deleteProfessor(professorCode)) {
            professorPrint.printSuccessMessage("delete");
        }else {
            professorPrint.printErrorMessage("delete");
        }
    }
}
