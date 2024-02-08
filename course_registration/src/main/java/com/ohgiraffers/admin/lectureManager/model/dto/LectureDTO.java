package com.ohgiraffers.admin.lectureManager.model.dto;

import com.ohgiraffers.admin.classManager.model.dto.ClassDTO;
import com.ohgiraffers.admin.professorManager.model.dto.ProfessorDTO;

public class LectureDTO {

    private int lectureCode;
    private int lectureLimit;
    private int registStudent;
    private String lecturePlace;
    private ProfessorDTO professorDTO;
    private ClassDTO classDTO;
    private String semester;
    public LectureDTO() {
    }

    public LectureDTO(int lectureCode, int lectureLimit, int registStudent, String lecturePlace, ProfessorDTO professorDTO, ClassDTO classDTO, String semester) {

        this.lectureCode = lectureCode;
        this.lectureLimit = lectureLimit;
        this.registStudent = registStudent;
        this.lecturePlace = lecturePlace;
        this.professorDTO = professorDTO;
        this.classDTO = classDTO;
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

    public ProfessorDTO getProfessorDTO() {
        return professorDTO;
    }

    public void setProfessorDTO(ProfessorDTO professorDTO) {
        this.professorDTO = professorDTO;
    }

    public ClassDTO getClassDTO() {
        return classDTO;
    }

    public void setClassDTO(ClassDTO classDTO) {
        this.classDTO = classDTO;
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
                ", professorDTO=" + professorDTO +
                ", classDTO=" + classDTO +
                ", semester='" + semester + '\'' +
                '}';
    }
}
