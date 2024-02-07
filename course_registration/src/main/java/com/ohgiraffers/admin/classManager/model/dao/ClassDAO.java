package com.ohgiraffers.admin.classManager.model.dao;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;

import java.util.List;

public interface ClassDAO {
    List<ClassDTO> selectAllClassList();
}
