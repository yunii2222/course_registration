package com.ohgiraffers.admin.professorManager.model.dao;

import com.ohgiraffers.admin.professorManager.model.dto.ProfessorDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;

public interface ProfessorDAO {
    List<ProfessorDTO> selectAllProfessorList();

    List<ProfessorDTO> selectProfessorByCondition(SearchCondition searchCondition);

    int insertProfessor(ProfessorDTO professorDTO);

    int updateProfessor(ProfessorDTO professorDTO);

    int deleteProfessor(int professorCode);
}
