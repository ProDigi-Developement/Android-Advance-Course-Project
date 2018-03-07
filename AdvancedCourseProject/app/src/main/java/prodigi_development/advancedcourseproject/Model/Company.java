package prodigi_development.advancedcourseproject.Model;

import android.graphics.Bitmap;

import java.util.ArrayList;

/**
 * Created by antho on 3/6/2018.
 */

public class Company {

    private ArrayList<Job> jobs;
    private String name, logo, size, photo, contact, website, techStack, description;

    public Company() {

    }

    public Company(String name, String logo, String size, String photo, String contact, String website, String techStack, String description, ArrayList<Job> jobs) {
        this.name = name;
        this.logo = logo;
        this.size = size;
        this.photo = photo;
        this.contact = contact;
        this.website = website;
        this.techStack = techStack;
        this.description = description;
        this.jobs = jobs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public String getSize() {
        return size;
    }

    public String getPhoto() {
        return photo;
    }

    public String getContact() {
        return contact;
    }

    public String getWebsite() {
        return website;
    }

    public String getTechStack() {
        return techStack;
    }

    public String getDescription() {
        return description;
    }
}

