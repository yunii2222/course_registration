package com.ohgiraffers.student.registManager.model.dto;

public class RegistDTO {
    private int studentCode;
    private int lectureCode;
    private String registDate;

    public RegistDTO() {
    }

    public RegistDTO(int studentCode, int lectureCode, String registDate) {
        this.studentCode = studentCode;
        this.lectureCode = lectureCode;
        this.registDate = registDate;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public int getLectureCode() {
        return lectureCode;
    }

    public void setLectureCode(int lectureCode) {
        this.lectureCode = lectureCode;
    }

    public String getRegistDate() {
        return registDate;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }

    @Override
    public String toString() {
        return "RegistDTO{" +
                "studentCode=" + studentCode +
                ", lectureCode=" + lectureCode +
                ", registDate='" + registDate + '\'' +
                '}';
    }
}
