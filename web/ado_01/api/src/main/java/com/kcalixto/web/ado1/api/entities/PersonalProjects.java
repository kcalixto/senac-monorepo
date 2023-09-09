package com.kcalixto.web.ado1.api.entities;

import java.util.HashMap;

public class PersonalProjects {
    private String title;
    private String slug;
    private String description;
    private HashMap<String, String> links;

    public PersonalProjects() {
    }

    public PersonalProjects(String title, String slug, String description, HashMap<String, String> links) {
        this.title = title;
        this.slug = slug;
        this.description = description;
        this.links = links;
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

    public HashMap<String, String> getLinks() {
        return links;
    }

    public void setLinks(HashMap<String, String> links) {
        this.links = links;
    }

}
