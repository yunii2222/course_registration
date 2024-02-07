package com.ohgiraffers.admin.classManager.model.dto;

public class ClassDTO {

    private  int classCode;
    private String className;
    private  String category;
    private int classGrade;
    private String classCredit;
    private String classStatus;

    public ClassDTO() {
    }

    public ClassDTO(int classCode, String className, String category, int classGrade, String classCredit, String classStatus) {
        this.classCode = classCode;
        this.className = className;
        this.category = category;
        this.classGrade = classGrade;
        this.classCredit = classCredit;
        this.classStatus = classStatus;
    }

    public int getClassCode() {
        return classCode;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(int classGrade) {
        this.classGrade = classGrade;
    }

    public String getClassCredit() {
        return classCredit;
    }

    public void setClassCredit(String classCredit) {
        this.classCredit = classCredit;
    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "ClassDTO{" +
                "classCode=" + classCode +
                ", className='" + className + '\'' +
                ", category='" + category + '\'' +
                ", classGrade=" + classGrade +
                ", classCredit='" + classCredit + '\'' +
                ", classStatus='" + classStatus + '\'' +
                '}';
    }
}
