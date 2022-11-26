package com.example.first_work_project.classes;

import javax.persistence.*;

@Entity
@Table(name = "nodes")
public class Node {

    enum node_type{
        target_node,
        full_activation_service_node,
        partial_activation_service_node,
        feature_node
    }

    @Id
    @Column(name = "node_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nodeId;

    @Column(name = "section_id", nullable = false)
    private int sectionId;

    @Column(name = "node_name", length = 128, nullable = false)
    private String nodeName;

    @Column(name = "node_type", nullable = false)
    private node_type nodeType;

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted;

    @Column(nullable = false)
    private String description;
    //text


    public Node() {
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public node_type getNodeType() {
        return nodeType;
    }

    public void setNodeType(node_type nodeType) {
        this.nodeType = nodeType;
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
        return "Node{" +
                "nodeId=" + nodeId +
                ", sectionId=" + sectionId +
                ", nodeName='" + nodeName + '\'' +
                ", nodeType=" + nodeType +
                ", isDeleted=" + isDeleted +
                ", description='" + description + '\'' +
                '}';
    }
}
