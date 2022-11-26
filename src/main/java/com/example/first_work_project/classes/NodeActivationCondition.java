package com.example.first_work_project.classes;

import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;

import javax.persistence.*;

@Entity
@Table(name = "node_activation_conditions")
public class NodeActivationCondition {

    @Id
    @Column(name = "node_activation_condition_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nodeActivationConditionId;

    @Column(name = "node_id", nullable = false)
    private int nodeId;

    @Column(name = "activation_condition_id", nullable = false)
    private int activationConditionId;

    @Column(name = "numeric_range_start_point", nullable = false)
    private double numericRangeStartPoint;
    //double precision

    @Column(name = "numeric_range_end_point", nullable = false)
    private double numericRangeEndPoint;
    //double precision

    @Column(name = "string_values", nullable = false)
    private String stringValues;
    //character varying[]

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted;

    @Column(nullable = false)
    private String description;
    //Text


    public NodeActivationCondition() {
    }

    public int getNodeActivationConditionId() {
        return nodeActivationConditionId;
    }

    public void setNodeActivationConditionId(int nodeActivationConditionId) {
        this.nodeActivationConditionId = nodeActivationConditionId;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public int getActivationConditionId() {
        return activationConditionId;
    }

    public void setActivationConditionId(int activationConditionId) {
        this.activationConditionId = activationConditionId;
    }

    public double getNumericRangeStartPoint() {
        return numericRangeStartPoint;
    }

    public void setNumericRangeStartPoint(double numericRangeStartPoint) {
        this.numericRangeStartPoint = numericRangeStartPoint;
    }

    public double getNumericRangeEndPoint() {
        return numericRangeEndPoint;
    }

    public void setNumericRangeEndPoint(double numericRangeEndPoint) {
        this.numericRangeEndPoint = numericRangeEndPoint;
    }

    public String getStringValues() {
        return stringValues;
    }

    public void setStringValues(String stringValues) {
        this.stringValues = stringValues;
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
        return "NodeActivationCondition{" +
                "nodeActivationConditionId=" + nodeActivationConditionId +
                ", nodeId=" + nodeId +
                ", activationConditionId=" + activationConditionId +
                ", numericRangeStartPoint=" + numericRangeStartPoint +
                ", numericRangeEndPoint=" + numericRangeEndPoint +
                ", stringValues='" + stringValues + '\'' +
                ", isDeleted=" + isDeleted +
                ", description='" + description + '\'' +
                '}';
    }
}
