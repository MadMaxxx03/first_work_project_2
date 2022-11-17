package com.example.first_work_project.classes;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "applications")
public class Application {

    @Id
    @Column(name = "application_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int applicationId;

    @Column(name = "kb_amount_limit")
    private int kbAmountLimit;

    @Column(name = "user_amount_limit")
    private int userAmountLimit;

    @Column
    private String token;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String salt;

    @Column(name = "has_access")
    private boolean hasAccess;

    @Column(name = "date_of_expiration")
    private Timestamp dateOfExpiration;

    @OneToMany(mappedBy = "application", fetch = FetchType.LAZY)
    private Set<User> users;

    public Application() {
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getKbAmountLimit() {
        return kbAmountLimit;
    }

    public void setKbAmountLimit(int kbAmountLimit) {
        this.kbAmountLimit = kbAmountLimit;
    }

    public int getUserAmountLimit() {
        return userAmountLimit;
    }

    public void setUserAmountLimit(int userAmountLimit) {
        this.userAmountLimit = userAmountLimit;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public boolean isHasAccess() {
        return hasAccess;
    }

    public void setHasAccess(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }

    public Timestamp getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(Timestamp dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicationId=" + applicationId +
                ", kbAmountLimit=" + kbAmountLimit +
                ", userAmountLimit=" + userAmountLimit +
                ", token='" + token + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", hasAccess=" + hasAccess +
                ", dateOfExpiration=" + dateOfExpiration +
                ", users=" + users +
                '}';
    }
}
