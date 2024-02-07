package com.ohgiraffers.admin.lectureManager.model.dto;

public class LectureDTO {

    private int lectureCode;
    private int lectureLimit;
    private int registStudent;
    private String lecturePlace;
    private int professorCode;
    private int classCode;
    private String semester;

    public LectureDTO() {
    }

    public LectureDTO(int lectureCode, int lectureLimit, int registStudent, String lecturePlace, int professorCode, int classCode, String semester) {
        this.lectureCode = lectureCode;
        this.lectureLimit = lectureLimit;
        this.registStudent = registStudent;
        this.lecturePlace = lecturePlace;
        this.professorCode = professorCode;
        this.classCode = classCode;
        this.semester = semester;
    }

    public int getLectureCode() {
        return lectureCode;
    }

    public void setLectureCode(int lectureCode) {
        this.lectureCode = lectureCode;
    }

    public int getLectureLimit() {
        return lectureLimit;
    }

    public void setLectureLimit(int lectureLimit) {
        this.lectureLimit = lectureLimit;
    }

    public int getRegistStudent() {
        return registStudent;
    }

    public void setRegistStudent(int registStudent) {
        this.registStudent = registStudent;
    }

    public String getLecturePlace() {
        return lecturePlace;
    }

    public void setLecturePlace(String lecturePlace) {
        this.lecturePlace = lecturePlace;
    }

    public int getProfessorCode() {
        return professorCode;
    }

    public void setProfessorCode(int professorCode) {
        this.professorCode = professorCode;
    }

    public int getClassCode() {
        return classCode;
    }

    public void setClassCode(int classCode) {
        this.classCode = classCode;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "LectureDTO{" +
                "lectureCode=" + lectureCode +
                ", lectureLimit=" + lectureLimit +
                ", registStudent=" + registStudent +
                ", lecturePlace='" + lecturePlace + '\'' +
                ", professorCode=" + professorCode +
                ", classCode=" + classCode +
                ", semester='" + semester + '\'' +
                '}';
    }
}
