package com.pplam;

/**
 * @author derian-cordoba - 16/8/21
 * @project Pattern_Delegate
 */
public class Student implements Description {

    private String university, title;

    public Student(String university, String title) {
        this.setUniversity(university);
        this.setTitle(title);
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String description() {
        return String.format("%s-%s", this.getUniversity(), this.getTitle());
    }
}
