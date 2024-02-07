package com.ohgiraffers.admin.studentManager.model.dto;

public class StudentDTO {
    private int studentCode;
    private String studentName;
    private String studentPhone;
    private int studentGrade;
    private String password;
    private String studentStatus;
    private int majorStudent;
    private int tutorProfessor;

    public StudentDTO() {
    }

    public StudentDTO(int studentCode, String studentName, String studentPhone, int studentGrade, String password, String studentStatus, int majorStudent, int tutorProfessor) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentGrade = studentGrade;
        this.password = password;
        this.studentStatus = studentStatus;
        this.majorStudent = majorStudent;
        this.tutorProfessor = tutorProfessor;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public int getMajorStudent() {
        return majorStudent;
    }

    public void setMajorStudent(int majorStudent) {
        this.majorStudent = majorStudent;
    }

    public int getTutorProfessor() {
        return tutorProfessor;
    }

    public void setTutorProfessor(int tutorProfessor) {
        this.tutorProfessor = tutorProfessor;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentCode=" + studentCode +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentGrade=" + studentGrade +
                ", password='" + password + '\'' +
                ", studentStatus='" + studentStatus + '\'' +
                ", majorStudent=" + majorStudent +
                ", tutorProfessor=" + tutorProfessor +
                '}';
    }
}
