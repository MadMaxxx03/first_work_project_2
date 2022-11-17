package com.example.first_work_project.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "object_types_history")
public class ObjectTypeHistory {

    @Id
    @Column(name = "object_type_id")
    private int objectTypeId;
    //Its not Id!!!

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

    //current_version

    //previous_version
}
