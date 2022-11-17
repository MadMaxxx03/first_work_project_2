package com.example.first_work_project.classes;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "versions")
public class Version {

    enum TableNameType{
        knowledge_bases,
        sections,
        object_types,
        objects,
        object_sections,
        object_connections,
        attributes,
        object_attributes
    }

    enum ActionType{
        create,
        update,
        delete
    }

    @Id
    @Column(name = "version_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long versionId;

    //kb_id

    //user_id

    @Column(name = "table_name")
    private TableNameType tableName;

    @Column
    private ActionType action;

    @Column(name = "registration_date")
    private Timestamp registrationDate;

    //previous_version_id
}
