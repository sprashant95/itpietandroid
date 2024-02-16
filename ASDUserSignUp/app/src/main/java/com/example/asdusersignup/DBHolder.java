package com.example.asdusersignup;

import android.app.Activity;

public class DBHolder {

    String name, specialization, image;

    public DBHolder(String name, String specialization, String image) {
        this.name = name;
        this.specialization = specialization;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
