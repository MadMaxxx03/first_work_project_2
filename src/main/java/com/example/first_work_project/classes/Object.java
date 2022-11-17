package com.example.first_work_project.classes;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "objects")
public class Object {

    @Id
    @Column(name = "object_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int objectId;

    @Column(name = "object_name")
    private String objectName;

    @Column(name = "object_node_type")
    private int objectNodeType;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column
    private String description;

    @Column(name = "is_full_event")
    private boolean isFullEvent;

    @Column(name = "current_version")
    private int currentVersion;

    @Column(name = "previous_version")
    private int previousVersion;

    @Column(name = "first_version")
    private Long firstVersion;
}
