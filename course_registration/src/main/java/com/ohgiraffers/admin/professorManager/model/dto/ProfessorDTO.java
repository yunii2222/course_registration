package com.ohgiraffers.admin.professorManager.model.dto;

public class ProfessorDTO {
    private int professorCode;
    private String professorNmae;
    private String professorPhone;
    private int subjectCode;

    public ProfessorDTO() {
    }

    public ProfessorDTO(int professorCode, String professorNmae, String professorPhone, int subjectCode) {
        this.professorCode = professorCode;
        this.professorNmae = professorNmae;
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
        return professorNmae;
    }

    public void setProfessorNmae(String professorNmae) {
        this.professorNmae = professorNmae;
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
                ", professorNmae='" + professorNmae + '\'' +
                ", professorPhone='" + professorPhone + '\'' +
                ", subjectCode=" + subjectCode +
                '}';
    }
}
