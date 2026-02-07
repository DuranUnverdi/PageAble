package com.duranunverdi.dto;

import lombok.Data;

@Data
public class DtoDepartment {
    private Long id;
    private String name;
    private String location;

    public DtoDepartment(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
