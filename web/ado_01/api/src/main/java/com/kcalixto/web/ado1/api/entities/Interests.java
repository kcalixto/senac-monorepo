package com.kcalixto.web.ado1.api.entities;

public class Interests {
    private String title;
    private String slug;
    private String description;

    public Interests() {
    }

    public Interests(String title, String slug, String description) {
        this.title = title;
        this.slug = slug;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
