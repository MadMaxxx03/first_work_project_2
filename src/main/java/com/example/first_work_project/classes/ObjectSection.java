package com.example.first_work_project.classes;

import javax.persistence.*;

@Entity
@Table(name = "object_sections")
public class ObjectSection {

    @Id
    @Column(name = "object_section_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int objectSectionId;

    //section_id

    //object_id

    @Column(name = "is_deleted")
    private boolean isDeleted;

    //current_version

    //previous_version

    //first_version
}
