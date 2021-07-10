package com.hackaton.shareme.adapters;

public class NearbyPersonModel {
    private String person_name;
    private int person_rating;
    // Constructor
    public NearbyPersonModel(String person_name, int person_rating) {
        this.person_name = person_name;
        this.person_rating = person_rating;
    }

    // Getter and Setter
    public String getCourse_name() {
        return person_name;
    }

    public void setCourse_name(String course_name) {
        this.person_name = course_name;
    }

    public int getCourse_rating() {
        return person_rating;
    }

    public void setCourse_rating(int course_rating) {
        this.person_rating = course_rating;
    }
}
