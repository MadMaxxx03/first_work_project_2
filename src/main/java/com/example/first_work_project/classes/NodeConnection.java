package com.example.first_work_project.classes;

import net.jcip.annotations.ThreadSafe;

import javax.persistence.*;

@Entity
@Table(name = "node_connections")
public class NodeConnection {

    enum node_connection_type{
        RS,
        TRA,
        S,
        SN,
        ART
    }

    @Id
    @Column(name = "node_connection_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nodeConnectionId;

    @Column(name = "from_node", nullable = false)
    private int fromNode;

    @Column(name = "to_node", nullable = false)
    private int toNode;

    @Column(name = "connection_type", nullable = false)
    private node_connection_type connectionType;

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted;

    @Column(nullable = false)
    private String description;
    //text


    public NodeConnection() {
    }

    public int getNodeConnectionId() {
        return nodeConnectionId;
    }

    public void setNodeConnectionId(int nodeConnectionId) {
        this.nodeConnectionId = nodeConnectionId;
    }

    public int getFromNode() {
        return fromNode;
    }

    public void setFromNode(int fromNode) {
        this.fromNode = fromNode;
    }

    public int getToNode() {
        return toNode;
    }

    public void setToNode(int toNode) {
        this.toNode = toNode;
    }

    public node_connection_type getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(node_connection_type connectionType) {
        this.connectionType = connectionType;
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
        return "NodeConnection{" +
                "nodeConnectionId=" + nodeConnectionId +
                ", fromNode=" + fromNode +
                ", toNode=" + toNode +
                ", connectionType=" + connectionType +
                ", isDeleted=" + isDeleted +
                ", description='" + description + '\'' +
                '}';
    }
}
