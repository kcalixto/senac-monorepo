package com.kcalixto.web.ado1.api.entities;

public class ExperienceTask {
    private String title;
    private String slug;

    public ExperienceTask() {
    }

    public ExperienceTask(String title, String slug) {
        this.title = title;
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public String getSlug() {
        return slug;
    }

}
