package com.diyorbek.dictionarybackend.beans;

import com.diyorbek.dictionarybackend.beans.base.BaseIdBean;

public class StudentsBean {
    private Long id;
    private String name;
    private String last_name;
    private Integer course;

    public StudentsBean(Long id, String name, String last_name, Integer course) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }
}
