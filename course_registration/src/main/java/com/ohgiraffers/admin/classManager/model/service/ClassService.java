package com.ohgiraffers.admin.classManager.model.service;

import com.ohgiraffers.admin.classManager.model.dao.ClassDAO;
import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.common.SearchCondition;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ClassService {
    private ClassDAO classDAO;

    public List<ClassDTO> selectAllClassList() {
        SqlSession sqlSession = getSqlSession();
        classDAO = sqlSession.getMapper(ClassDAO.class);

        List<ClassDTO> classList = classDAO.selectAllClassList();

        sqlSession.close();
        return classList;
    }

    public List<ClassDTO> selectClassBy() {
        SqlSession sqlSession = getSqlSession();
        classDAO = sqlSession.getMapper(ClassDAO.class);

        List<ClassDTO> classList = classDAO.selectAllClassList();

        sqlSession.close();
        return classList;
    }

    public boolean addNewClass(ClassDTO classDTO) {
        SqlSession sqlSession = getSqlSession();
        classDAO = sqlSession.getMapper(ClassDAO.class);

        int result = classDAO.insertClass(classDTO);
        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }

    public boolean updateClass(ClassDTO classDTO) {
        SqlSession sqlSession = getSqlSession();
        classDAO = sqlSession.getMapper(ClassDAO.class);

        int result = classDAO.updateClass(classDTO);
        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }

    public boolean deleteClass(Map<String, String> parameter) {
        SqlSession sqlSession = getSqlSession();
        classDAO = sqlSession.getMapper(ClassDAO.class);

        int result = classDAO.deleteClass(parameter);
        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }

    public List<ClassDTO> selectClassByCondition(SearchCondition searchCondition) {
        return null;
    }

    public boolean addNewClass(ClassDTO classDTO) {
        return false;
    }

    public boolean modifyClass(ClassDTO classDTO) {
        return false;
    }


    public boolean deleteClass(int classCode) {
        return false;
    }


}
