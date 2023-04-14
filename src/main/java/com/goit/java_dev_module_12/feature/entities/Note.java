package com.goit.java_dev_module_12.feature.entities;

import lombok.Data;

@Data
public class Note {
    private long id;

    private String title;

    private String content;
}
