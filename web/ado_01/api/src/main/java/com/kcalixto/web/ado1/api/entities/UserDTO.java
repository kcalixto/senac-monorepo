package com.kcalixto.web.ado1.api.entities;

import java.util.Arrays;

public class UserDTO {

    private String name;
    private String phone;
    private String email;
    private String birth_date;
    private SocialMedia[] socialMedia;
    private ProfessionalExperience[] professionalExperience;
    private AcademicExperience[] academicExperience;
    private PersonalProjects[] personalProjects;
    private Interests[] interests;
    private Languages[] languages;

    public UserDTO() {
    }

    public UserDTO(String name, String phone, String email, String birth_date, SocialMedia[] socialMedia,
            ProfessionalExperience[] professionalExperience, AcademicExperience[] academicExperience,
            PersonalProjects[] personalProjects, Interests[] interests, Languages[] languages) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birth_date = birth_date;
        this.socialMedia = socialMedia;
        this.professionalExperience = professionalExperience;
        this.academicExperience = academicExperience;
        this.personalProjects = personalProjects;
        this.interests = interests;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public SocialMedia[] getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(SocialMedia[] socialMedia) {
        this.socialMedia = socialMedia;
    }

    public ProfessionalExperience[] getProfessionalExperience() {
        return professionalExperience;
    }

    public void setProfessionalExperience(ProfessionalExperience[] professionalExperience) {
        this.professionalExperience = professionalExperience;
    }

    public AcademicExperience[] getAcademicExperience() {
        return academicExperience;
    }

    public void setAcademicExperience(AcademicExperience[] academicExperience) {
        this.academicExperience = academicExperience;
    }

    public PersonalProjects[] getPersonalProjects() {
        return personalProjects;
    }

    public void setPersonalProjects(PersonalProjects[] personalProjects) {
        this.personalProjects = personalProjects;
    }

    public Interests[] getInterests() {
        return interests;
    }

    public void setInterests(Interests[] interests) {
        this.interests = interests;
    }

    public Languages[] getLanguages() {
        return languages;
    }

    public void setLanguages(Languages[] languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", phone=" + phone + ", email=" + email + ", birth_date=" + birth_date
                + ", socialMedia=" + Arrays.toString(socialMedia) + ", professionalExperience="
                + Arrays.toString(professionalExperience) + ", academicExperience="
                + Arrays.toString(academicExperience) + ", personalProjects=" + Arrays.toString(personalProjects)
                + ", interests=" + Arrays.toString(interests) + ", languages=" + Arrays.toString(languages) + "]";
    }

}
