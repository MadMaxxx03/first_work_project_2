package com.example.first_work_project.classes;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.vladmihalcea.hibernate.type.range.PostgreSQLRangeType;
import com.vladmihalcea.hibernate.type.range.Range;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity
@Table(name = "attributes")
@TypeDef(
        typeClass = PostgreSQLRangeType.class,
        defaultForType = Range.class
)
public class Attribute {

    @Id
    @Column(name = "attribute_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attributeId;

    @Column(name = "attribute_name", length = 128)
    private String attributeName;

    @Column(name = "has_numeric_type")
    private boolean hasNumericType;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column(name = "possible_numeric_range")
    private Range possibleNumericRange;

    @Column(name = "possible_string_values")
    private Character[] possibleStringValues;
    //character varying[]

    @Column(length = 128)
    private String label;

    @Column(name = "kb_id")
    private int kbId;
    //kb_id

    @Column
    private String description;
    //Text

    @Column(name = "current_version")
    private int currentVersion;
    //current_version

    @Column(name = "previous_version")
    private int previousVersion;
    //previous_version

    @Column(name = "first_version")
    private int firstVersion;
    //first_version


    public int getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(int attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public boolean isHasNumericType() {
        return hasNumericType;
    }

    public void setHasNumericType(boolean hasNumericType) {
        this.hasNumericType = hasNumericType;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Range getPossibleNumericRange() {
        return possibleNumericRange;
    }

    public void setPossibleNumericRange(Range possibleNumericRange) {
        this.possibleNumericRange = possibleNumericRange;
    }

    public Character[] getPossibleStringValues() {
        return possibleStringValues;
    }

    public void setPossibleStringValues(Character[] possibleStringValues) {
        this.possibleStringValues = possibleStringValues;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getKbId() {
        return kbId;
    }

    public void setKbId(int kbId) {
        this.kbId = kbId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(int currentVersion) {
        this.currentVersion = currentVersion;
    }

    public int getPreviousVersion() {
        return previousVersion;
    }

    public void setPreviousVersion(int previousVersion) {
        this.previousVersion = previousVersion;
    }

    public int getFirstVersion() {
        return firstVersion;
    }

    public void setFirstVersion(int firstVersion) {
        this.firstVersion = firstVersion;
    }
}
