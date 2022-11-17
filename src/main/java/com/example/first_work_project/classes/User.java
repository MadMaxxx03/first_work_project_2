package com.example.first_work_project.classes;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @ManyToOne
    @JoinColumn(name = "application_id", nullable = false)
    private Application application;

    @Column(name = "delete_as_soon_as_possible")
    private boolean deleteAsSoonAsPossible;

    @Column(name = "will_be_deleted_after")
    private Timestamp willBeDeletedAfter;

    @Column(name = "date_of_creation")
    private Timestamp dateOfCreation;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
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

    public Timestamp getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Timestamp dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", application=" + application +
                ", deleteAsSoonAsPossible=" + deleteAsSoonAsPossible +
                ", willBeDeletedAfter=" + willBeDeletedAfter +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }
}
