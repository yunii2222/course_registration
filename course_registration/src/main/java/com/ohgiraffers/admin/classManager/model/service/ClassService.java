package com.ohgiraffers.admin.classManager.model.service;

import com.ohgiraffers.admin.classManager.model.dao.ClassDAO;
import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

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
}
