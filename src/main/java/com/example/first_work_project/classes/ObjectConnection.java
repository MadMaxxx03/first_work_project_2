package com.example.first_work_project.classes;

import javax.persistence.*;

@Entity
@Table(name = "object_connections")
public class ObjectConnection {

    enum ObjectConnectionType{
        RS,
        TRA,
        S,
        SN,
        ART
    }

    @Id
    @Column(name = "object_connection_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int objectConnectionId;

    //from_object

    //to_object

    @Column(name = "connection_type")
    private ObjectConnectionType connectionType;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column
    private String description;
    //Text

    //current_version

    //previous_version

    //first_version

}
