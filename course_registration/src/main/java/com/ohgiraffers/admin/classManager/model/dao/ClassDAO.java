package com.ohgiraffers.admin.classManager.model.dao;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.common.SearchCondition;

import java.util.List;

public interface ClassDAO {
    List<ClassDTO> selectAllClassList();

    List<ClassDTO> selectClassByCondition(SearchCondition searchCondition);

    int insertClass(ClassDTO classDTO);

    int updateClass(ClassDTO classDTO);

    int deleteClass(int classCode);
}
