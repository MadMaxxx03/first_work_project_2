package com.example.first_work_project.classes;

import javax.persistence.*;

@Entity
@Table(name = "activation_conditions")
public class ActivationCondition {

    @Id
    @Column(name = "activation_condition_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int activationConditionId;

    @Column(name = "has_numeric_type", nullable = false)
    private boolean hasNumericType;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @Column(name = "possible_numeric_range_start_point", nullable = false)
    private double possibleNumericRangeStartPoint;
    //double precision

    @Column(name = "possible_numeric_range_end_point", nullable = false)
    private double possibleNumericRangeEndPoint;
    //double precision

    @Column(name = "possible_staring_values", nullable = false)
    private String possibleStaringValues;
    //character varying[]

    @Column(name = "label", length = 128, nullable = false)
    private String label;

    @Column(name = "kb_id", nullable = false)
    private int kbId;

    @Column(nullable = false)
    private String description;
    //text


    public ActivationCondition() {
    }

    public int getActivationConditionId() {
        return activationConditionId;
    }

    public void setActivationConditionId(int activationConditionId) {
        this.activationConditionId = activationConditionId;
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

    public double getPossibleNumericRangeStartPoint() {
        return possibleNumericRangeStartPoint;
    }

    public void setPossibleNumericRangeStartPoint(double possibleNumericRangeStartPoint) {
        this.possibleNumericRangeStartPoint = possibleNumericRangeStartPoint;
    }

    public double getPossibleNumericRangeEndPoint() {
        return possibleNumericRangeEndPoint;
    }

    public void setPossibleNumericRangeEndPoint(double possibleNumericRangeEndPoint) {
        this.possibleNumericRangeEndPoint = possibleNumericRangeEndPoint;
    }

    public String getPossibleStaringValues() {
        return possibleStaringValues;
    }

    public void setPossibleStaringValues(String possibleStaringValues) {
        this.possibleStaringValues = possibleStaringValues;
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

    @Override
    public String toString() {
        return "ActivationCondition{" +
                "activationConditionId=" + activationConditionId +
                ", hasNumericType=" + hasNumericType +
                ", isDeleted=" + isDeleted +
                ", possibleNumericRangeStartPoint=" + possibleNumericRangeStartPoint +
                ", possibleNumericRangeEndPoint=" + possibleNumericRangeEndPoint +
                ", possibleStaringValues='" + possibleStaringValues + '\'' +
                ", label='" + label + '\'' +
                ", kbId=" + kbId +
                ", description='" + description + '\'' +
                '}';
    }
}
