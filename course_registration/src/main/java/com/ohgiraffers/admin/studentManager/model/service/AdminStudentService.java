package com.ohgiraffers.admin.studentManager.model.service;

import com.ohgiraffers.admin.professorManager.model.dto.ProfessorDTO;
import com.ohgiraffers.admin.studentManager.model.dao.AdminStudentDAO;
import com.ohgiraffers.admin.studentManager.model.dto.AdminStudentDTO;
import com.ohgiraffers.common.SearchCondition;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class AdminStudentService {
    private AdminStudentDAO adminStudentDAO;

    public List<AdminStudentDTO> selectAllStudentList() {
        SqlSession sqlSession = getSqlSession();
        adminStudentDAO = sqlSession.getMapper(AdminStudentDAO.class);

        List<AdminStudentDTO> adminStudentList = adminStudentDAO.selectAllStudentList();

        sqlSession.close();
        return adminStudentList;
    }

    public List<AdminStudentDTO> selectStudentByCondition(SearchCondition searchCondition) {
        SqlSession sqlSession = getSqlSession();
        adminStudentDAO = sqlSession.getMapper(AdminStudentDAO.class);

        List<AdminStudentDTO> adminStudentList = adminStudentDAO.selectStudentByCondition(searchCondition);

        sqlSession.close();
        return adminStudentList;
    }

    public boolean addNewStudent(AdminStudentDTO adminStudentDTO) {
        SqlSession sqlSession = getSqlSession();
        adminStudentDAO = sqlSession.getMapper(AdminStudentDAO.class);

        int result = adminStudentDAO.insertStudent(adminStudentDTO);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }

    public boolean modifyStudent(AdminStudentDTO adminStudentDTO) {
        SqlSession sqlSession = getSqlSession();
        adminStudentDAO = sqlSession.getMapper(AdminStudentDAO.class);

        int result = adminStudentDAO.updateStudent(adminStudentDTO);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }

    public boolean deleteStudent(int studentCode) {
        SqlSession sqlSession = getSqlSession();
        adminStudentDAO = sqlSession.getMapper(AdminStudentDAO.class);

        int result = adminStudentDAO.deleteStudent(studentCode);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0;
    }
}
