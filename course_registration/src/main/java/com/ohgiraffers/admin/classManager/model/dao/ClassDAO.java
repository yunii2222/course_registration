package com.ohgiraffers.admin.classManager.model.dao;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;

import java.util.List;
import java.util.Map;

public interface ClassDAO {
    List<ClassDTO> selectAllClassList();

    int insertClass(ClassDTO classDTO);

    int updateClass(ClassDTO classDTO);

    int deleteClass(Map<String, String> parameter);
}
