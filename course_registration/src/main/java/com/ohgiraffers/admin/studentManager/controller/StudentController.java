package com.ohgiraffers.admin.studentManager.controller;

public class StudentController {
import com.ohgiraffers.admin.professorManager.model.dto.ProfessorDTO;
import com.ohgiraffers.admin.professorManager.model.service.ProfessorService;
import com.ohgiraffers.admin.professorManager.view.ProfessorPrint;
import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.admin.studentManager.model.service.AdminStudentService;
import com.ohgiraffers.admin.studentManager.view.AdminStudentPrint;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;
import java.util.Map;

public class StudentController {
    private AdminStudentService adminStudentService = new AdminStudentService();

    private AdminStudentPrint adminStudentPrint = new AdminStudentPrint();

    public List<AdminStudentDTO> selectAllStudentList(){
        List<AdminStudentDTO> studentList = adminStudentService.selectAllStudentList();

        if ( studentList != null) {
            adminStudentPrint.printAllStudentList(studentList);
        }else {
            adminStudentPrint.printErrorMessage("selectOne");
        }

        return studentList;
    }

    public void selectStudentByCondition(SearchCondition searchCondition){

        List<AdminStudentDTO> studentList = adminStudentService.selectStudentByCondition(searchCondition);

        if ( studentList != null && !studentList.isEmpty()) {
            adminStudentPrint.printStudentList(studentList,searchCondition);
        }else {
            adminStudentPrint.printErrorMessage("selectClassList");
        }
    }

    public void addNewStudent(AdminStudentDTO adminStudentDTO) {

        if(adminStudentService.addNewStudent(adminStudentDTO)){
            adminStudentPrint.printSuccessMessage("insert");
        }else {
            adminStudentPrint.printErrorMessage("insert");
        }
    }

    public void modifyStudent(AdminStudentDTO adminStudentDTO) {

        if(adminStudentService.modifyStudent(adminStudentDTO)){
            adminStudentPrint.printSuccessMessage("update");
        }else {
            adminStudentPrint.printErrorMessage("update");
        }
    }

    public void deleteStudent(Map<String, String> parameter) {

        int studentCode = Integer.parseInt(parameter.get("professorCode"));

        if (adminStudentService.deleteStudent(studentCode)) {
            adminStudentPrint.printSuccessMessage("delete");
        }else {
            adminStudentPrint.printErrorMessage("delete");
        }
    }

}
