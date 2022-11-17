package com.example.first_work_project.classes;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name = "object_attributes")
public class ObjectAttribute {

    @Id
    @Column(name = "object_attribute_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int objectAttributeId;

    //object_id

    //attribute_id

    //@Column(name = "numeric_range")
    //private numrange numericRange;

    @Column(name = "string_values")
    private String stringValues;
    //character varying[]

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column
    private String description;
    //Text

    //current_version

    //previous_version

    //first_version

}
