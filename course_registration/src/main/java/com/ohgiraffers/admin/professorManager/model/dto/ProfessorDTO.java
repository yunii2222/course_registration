package com.ohgiraffers.admin.professorManager.model.dto;

public class ProfessorDTO {
    private int professorCode;
    private String professorName;
    private String professorPhone;
    private int subjectCode;

    public ProfessorDTO() {
    }

    public ProfessorDTO(int professorCode, String professorNmae, String professorPhone, int subjectCode) {
        this.professorCode = professorCode;
        this.professorName = professorNmae;
        this.professorPhone = professorPhone;
        this.subjectCode = subjectCode;
    }

    public int getProfessorCode() {
        return professorCode;
    }

    public void setProfessorCode(int professorCode) {
        this.professorCode = professorCode;
    }

    public String getProfessorNmae() {
        return professorName;
    }

    public void setProfessorNmae(String professorNmae) {
        this.professorName = professorNmae;
    }

    public String getProfessorPhone() {
        return professorPhone;
    }

    public void setProfessorPhone(String professorPhone) {
        this.professorPhone = professorPhone;
    }

    public int getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }

    @Override
    public String toString() {
        return "ProfessorDTO{" +
                "professorCode=" + professorCode +
                ", professorName='" + professorName + '\'' +
                ", professorPhone='" + professorPhone + '\'' +
                ", subjectCode=" + subjectCode +
                '}';
    }
}
