package com.pplam;

/**
 * @author derian-cordoba - 16/8/21
 * @project Pattern_Delegate
 */
public class Project implements Description {

    private String name, duration;

    public Project(String name, String duration) {
        this.setName(name);
        this.setDuration(duration);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String description() {
        return String.format("%s-%s", this.getName(), this.getDuration());
    }
}
