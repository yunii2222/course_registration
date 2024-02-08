package com.ohgiraffers.admin.studentManager.model.service;

import com.ohgiraffers.admin.professorManager.model.dto.ProfessorDTO;
import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;

public class AdminStudentService {
    public List<AdminStudentDTO> selectAllStudentList() {
        return null;
    }

    public List<AdminStudentDTO> selectStudentByCondition(SearchCondition searchCondition) {
        return null;
    }

    public boolean addNewStudent(AdminStudentDTO adminStudentDTO) {
        return false;
    }

    public boolean modifyStudent(AdminStudentDTO adminStudentDTO) {
        return false;
    }

    public boolean deleteStudent(int studentCode) {
        return false;
    }
}
