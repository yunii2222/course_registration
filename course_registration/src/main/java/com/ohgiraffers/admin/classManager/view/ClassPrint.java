package com.ohgiraffers.admin.classManager.view;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;

import java.util.List;

public class ClassPrint {
    public void printAllClassList(List<ClassDTO> allClassList) {
        System.out.println("==== 수업목록 ====");
        for(ClassDTO classDTO : allClassList){
            System.out.println(classDTO);
        }

    }

    public void printErrorMessage(String errorCode) {
        System.out.println("==== ERROR ====");
        String errorMessage = "";
        switch (errorCode) {
            case "classList" :
                errorMessage = "수업 조회 실패"; break;

        }
    }
}
