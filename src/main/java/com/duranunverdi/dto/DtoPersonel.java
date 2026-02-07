package com.duranunverdi.dto;

public class DtoPersonel {

    private Long id;
    private String firstName;
    private String lastName;
    private Long departmentId;
    private String departmentName;

    public DtoPersonel(Long id,
                       String firstName,
                       String lastName,
                       Long departmentId,
                       String departmentName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }


    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
