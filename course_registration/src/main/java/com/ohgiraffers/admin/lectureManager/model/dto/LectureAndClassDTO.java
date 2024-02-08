package com.ohgiraffers.admin.lectureManager.model.dto;

public class LectureAndClassDTO {

    private int lectureCode;
    private int lectureLimit;
    private int registStudent;
    private String lecturePlace;
    private int professorCode;
    private String semester;

    private  int classCode;
    private String className;
    private  String category;
    private int classGrade;
    private String classCredit;
    private String classStatus;

    public LectureAndClassDTO() {
    }

    public LectureAndClassDTO(int lectureCode, int lectureLimit, int registStudent, String lecturePlace, int professorCode, String semester, int classCode, String className, String category, int classGrade, String classCredit, String classStatus) {
        this.lectureCode = lectureCode;
        this.lectureLimit = lectureLimit;
        this.registStudent = registStudent;
        this.lecturePlace = lecturePlace;
        this.professorCode = professorCode;
        this.semester = semester;
        this.classCode = classCode;
        this.className = className;
        this.category = category;
        this.classGrade = classGrade;
        this.classCredit = classCredit;
        this.classStatus = classStatus;
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

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
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
        return "LectureAndClassDTO{" +
                "lectureCode=" + lectureCode +
                ", lectureLimit=" + lectureLimit +
                ", registStudent=" + registStudent +
                ", lecturePlace='" + lecturePlace + '\'' +
                ", professorCode=" + professorCode +
                ", semester='" + semester + '\'' +
                ", classCode=" + classCode +
                ", className='" + className + '\'' +
                ", category='" + category + '\'' +
                ", classGrade=" + classGrade +
                ", classCredit='" + classCredit + '\'' +
                ", classStatus='" + classStatus + '\'' +
                '}';
    }
}
