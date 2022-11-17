package com.example.first_work_project.classes;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "knowledge_bases")
public class KnowledgeBase {

    @Id
    @Column(name = "kb_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kbId;

    @Column(name = "kb_name", length =  128)
    private String kbName;

    // modified_by_user

    @Column(name = "date_of_modification")
    private Timestamp dateOfModification;

    @Column(name = "delete_as_soon_as_possible")
    private boolean deleteAsSoonAsPossible;

    @Column(name = "will_be_deleted_after")
    private Timestamp willBeDeletedAfter;

    @Column
    private String description;
    //Text

    // created_by_user

    @Column(name = "date_of_creation")
    private Timestamp dateOfCreation;

}
