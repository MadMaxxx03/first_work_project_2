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

    @Column(name = "kb_name", length =  128, nullable = false)
    private String kbName;

    @Column(name = "modified_by_user", nullable = false)
    private int modifiedByUser;

    @Column(name = "delete_as_soon_as_possible", nullable = false)
    private boolean deleteAsSoonAsPossible;

    @Column(name = "will_be_deleted_after", nullable = false)
    private Timestamp willBeDeletedAfter;

    public KnowledgeBase() {
    }

    public int getKbId() {
        return kbId;
    }

    public void setKbId(int kbId) {
        this.kbId = kbId;
    }

    public String getKbName() {
        return kbName;
    }

    public void setKbName(String kbName) {
        this.kbName = kbName;
    }

    public int getModifiedByUser() {
        return modifiedByUser;
    }

    public void setModifiedByUser(int modifiedByUser) {
        this.modifiedByUser = modifiedByUser;
    }

    public boolean isDeleteAsSoonAsPossible() {
        return deleteAsSoonAsPossible;
    }

    public void setDeleteAsSoonAsPossible(boolean deleteAsSoonAsPossible) {
        this.deleteAsSoonAsPossible = deleteAsSoonAsPossible;
    }

    public Timestamp getWillBeDeletedAfter() {
        return willBeDeletedAfter;
    }

    public void setWillBeDeletedAfter(Timestamp willBeDeletedAfter) {
        this.willBeDeletedAfter = willBeDeletedAfter;
    }

    @Override
    public String toString() {
        return "KnowledgeBase{" +
                "kbId=" + kbId +
                ", kbName='" + kbName + '\'' +
                ", modifiedByUser=" + modifiedByUser +
                ", deleteAsSoonAsPossible=" + deleteAsSoonAsPossible +
                ", willBeDeletedAfter=" + willBeDeletedAfter +
                '}';
    }
}
