package com.diyorbek.dictionarybackend.beans;

import com.diyorbek.dictionarybackend.beans.base.BaseIdBean;
import lombok.Data;

@Data
public class StudentsBean {
    private Long id;
    private String name;
    private String last_name;
    private Integer course;

}
