package com.ohgiraffers.admin.professorManager.model.service;

import com.ohgiraffers.admin.professorManager.model.dao.ProfessorDAO;
import com.ohgiraffers.admin.professorManager.model.dto.ProfessorDTO;
import com.ohgiraffers.common.SearchCondition;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ProfessorService {
    private ProfessorDAO professorDAO;

    public List<ProfessorDTO> selectAllProfessorList() {
        SqlSession sqlSession = getSqlSession();
        professorDAO = sqlSession.getMapper(ProfessorDAO.class);

        List<ProfessorDTO> professorList = professorDAO.selectAllProfessorList();

        sqlSession.close();
        return professorList;
    }

    public List<ProfessorDTO> selectProfessorByCondition(SearchCondition searchCondition) {
        SqlSession sqlSession = getSqlSession();
        professorDAO = sqlSession.getMapper(ProfessorDAO.class);

        List<ProfessorDTO> professorList = professorDAO.selectProfessorByCondition(searchCondition);

        sqlSession.close();
        return professorList;
    }

    public boolean addNewProfessor(ProfessorDTO professorDTO) {
        SqlSession sqlSession = getSqlSession();
        professorDAO = sqlSession.getMapper(ProfessorDAO.class);

        int result = professorDAO.insertProfessor(professorDTO);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }

    public boolean modifyProfessor(ProfessorDTO professorDTO) {
        SqlSession sqlSession = getSqlSession();
        professorDAO = sqlSession.getMapper(ProfessorDAO.class);

        int result = professorDAO.updateProfessor(professorDTO);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }

    public boolean deleteProfessor(int professorCode) {
        SqlSession sqlSession = getSqlSession();
        professorDAO = sqlSession.getMapper(ProfessorDAO.class);

        int result = professorDAO.deleteProfessor(professorCode);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }
}
