package com.kcalixto.web.ado1.api.entities;

public class AcademicExperience {
    private String institution;
    private String course;
    private String start_date;
    private String end_date;
    private AcademicLearning[] learning;

    public AcademicExperience() {
    }

    public AcademicExperience(String institution, String course, String start_date, String end_date,
            AcademicLearning[] learning) {
        this.institution = institution;
        this.course = course;
        this.start_date = start_date;
        this.end_date = end_date;
        this.learning = learning;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public AcademicLearning[] getLearning() {
        return learning;
    }

    public void setLearning(AcademicLearning[] learning) {
        this.learning = learning;
    }

}
