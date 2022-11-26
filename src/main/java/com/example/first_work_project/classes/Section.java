package com.example.first_work_project.classes;

import javax.persistence.*;

@Entity
@Table(name = "sections")
public class Section {

    @Id
    @Column(name = "section_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sectionId;

    @Column(name = "section_name", length = 128, nullable = false)
    private String sectionName;

    @Column(name = "kb_id", nullable = false)
    private int kbId;

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted;

    @Column(nullable = false)
    private String description;
    //Text


    public Section() {
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public int getKbId() {
        return kbId;
    }

    public void setKbId(int kbId) {
        this.kbId = kbId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Section{" +
                "sectionId=" + sectionId +
                ", sectionName='" + sectionName + '\'' +
                ", kbId=" + kbId +
                ", isDeleted=" + isDeleted +
                ", description='" + description + '\'' +
                '}';
    }
}
