package com.example.first_work_project.classes;

import javax.persistence.*;

@Entity
@Table(name = "object_types")
public class ObjectType {

    @Id
    @Column(name = "object_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int objectTypeId;

    @Column(name = "object_type_name", length = 128)
    private String objectTypeName;

    @Column
    private String description;

    @Column(name = "is_sign")
    private boolean isSign;

    @Column(name = "is_target")
    private boolean isTarget;

    @Column(name = "is_service")
    private boolean isService;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    //kb_id

    //current_version

    //previous_version

    //first_version
}
