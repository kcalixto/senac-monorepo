package com.kcalixto.web.ado1.api.entities;

public class ProfessionalExperience {
    private String company;
    private String company_slug;
    private String start_date;
    private String end_date;
    private String role;
    private ExperienceTask[] tasks;

    public ProfessionalExperience() {
    }

    public ProfessionalExperience(String company, String company_slug, String start_date, String end_date, String role,
            ExperienceTask[] tasks) {
        this.company = company;
        this.company_slug = company_slug;
        this.start_date = start_date;
        this.end_date = end_date;
        this.role = role;
        this.tasks = tasks;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany_slug() {
        return company_slug;
    }

    public void setCompany_slug(String company_slug) {
        this.company_slug = company_slug;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ExperienceTask[] getTasks() {
        return tasks;
    }

    public void setTasks(ExperienceTask[] tasks) {
        this.tasks = tasks;
    }

}
