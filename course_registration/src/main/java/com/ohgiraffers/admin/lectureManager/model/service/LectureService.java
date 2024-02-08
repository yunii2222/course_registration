package com.ohgiraffers.admin.lectureManager.model.service;

import com.ohgiraffers.admin.lectureManager.model.dao.LectureDAO;
import com.ohgiraffers.admin.lectureManager.model.dto.LectureDTO;
import com.ohgiraffers.common.SearchCondition;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class LectureService {
    private LectureDAO lectureDAO;

    public List<LectureDTO> selectAllLectureList() {
        SqlSession sqlSession = getSqlSession();
        lectureDAO = sqlSession.getMapper(LectureDAO.class);

        List<LectureDTO> lectureList = lectureDAO.selectAllLectureList();

        sqlSession.close();
        return lectureList;
    }

    public List<LectureDTO> selectLectureByCondition(SearchCondition searchCondition) {
        SqlSession sqlSession = getSqlSession();
        lectureDAO = sqlSession.getMapper(LectureDAO.class);

        List<LectureDTO> lectureList = lectureDAO.selectLectureByCondition(searchCondition);

        sqlSession.close();
        return lectureList;
    }

    public boolean addNewLecture(LectureDTO lectureDTO) {
        SqlSession sqlSession = getSqlSession();
        lectureDAO = sqlSession.getMapper(LectureDAO.class);

        int result = lectureDAO.insertLecture(lectureDTO);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return false;
    }

    public boolean modifyLecture(LectureDTO lectureDTO) {
        SqlSession sqlSession = getSqlSession();
        lectureDAO = sqlSession.getMapper(LectureDAO.class);

        int result = lectureDAO.updateLecture(lectureDTO);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return false;
    }

    public boolean deleteLecture(int lectureCode) {
        SqlSession sqlSession = getSqlSession();
        lectureDAO = sqlSession.getMapper(LectureDAO.class);

        int result = lectureDAO.deleteLecture(lectureCode);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return false;
    }
}
