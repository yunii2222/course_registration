package com.ohgiraffers.admin.studentManager.model.dao;

import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;

public interface AdminStudentDAO {
    List<AdminStudentDTO> selectAllStudentList();

    List<AdminStudentDTO> selectStudentByCondition(SearchCondition searchCondition);

    int insertStudent(AdminStudentDTO adminStudentDTO);

    int updateStudent(AdminStudentDTO adminStudentDTO);

    int deleteStudent(int studentCode);
}
