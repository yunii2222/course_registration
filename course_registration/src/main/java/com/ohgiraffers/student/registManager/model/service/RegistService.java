package com.ohgiraffers.student.registManager.model.service;

import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;
import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.common.SearchCondition;
import com.ohgiraffers.student.registManager.model.dao.RegistDAO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class RegistService {

    private RegistDAO registDAO;
    public List<LectureDTO> selectLectureByCondition(SearchCondition searchCondition) {
        SqlSession sqlSession = getSqlSession();
        registDAO = sqlSession.getMapper(RegistDAO.class);

        List<LectureDTO> lectureList = registDAO.selectLectureByCondition(searchCondition);

        sqlSession.close();
        return lectureList;
    }

    public boolean addNewRegist(int lectureCode, int studentCode) {
        SqlSession sqlSession = getSqlSession();
        registDAO = sqlSession.getMapper(RegistDAO.class);

        int result = registDAO.insertRegist(lectureCode, studentCode);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public List<LectureDTO> selectLectureByStudent(int studentCode) {
        SqlSession sqlSession = getSqlSession();
        registDAO = sqlSession.getMapper(RegistDAO.class);

        List<LectureDTO> lectureList = registDAO.selectLectureByStudent(studentCode);

        sqlSession.close();
        return lectureList;
    }


    public boolean deleteRegist(int lectureCode, int studentCode) {
        SqlSession sqlSession = getSqlSession();
        registDAO = sqlSession.getMapper(RegistDAO.class);

        int result = registDAO.deleteRegist(lectureCode, studentCode);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }


}
