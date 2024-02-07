package com.ohgiraffers.admin.classManager.model.service;

import com.ohgiraffers.admin.classManager.model.dao.ClassDAO;
import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.common.SearchCondition;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ClassService {

    public List<ClassDTO> selectAllClassList() {
        return null;
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
