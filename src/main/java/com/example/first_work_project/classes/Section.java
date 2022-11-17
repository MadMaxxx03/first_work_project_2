package com.example.first_work_project.classes;

import javax.persistence.*;

@Entity
@Table(name = "sections")
public class Section {

    @Id
    @Column(name = "section_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sectionId;

    @Column(name = "section_name", length = 128)
    private String sectionName;

    //kb_id

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column
    private String description;
    //Text

    //current_version

    //previous_version

    //first_version

}
