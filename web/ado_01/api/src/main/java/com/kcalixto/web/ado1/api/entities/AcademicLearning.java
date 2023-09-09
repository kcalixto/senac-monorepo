package com.kcalixto.web.ado1.api.entities;

public class AcademicLearning {
    private String semester;
    private String description;
    private String[] subjects;
    private String githubURL;

    public AcademicLearning() {
    }

    public AcademicLearning(String semester, String description, String[] subjects, String githubURL) {
        this.semester = semester;
        this.description = description;
        this.subjects = subjects;
        this.githubURL = githubURL;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String getGithubURL() {
        return githubURL;
    }

    public void setGithubURL(String githubURL) {
        this.githubURL = githubURL;
    }

}
