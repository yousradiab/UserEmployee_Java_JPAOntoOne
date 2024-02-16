package org.example.useremployee.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserID;
    @Column(unique = true)
    private String email;
    private String password;


    //betyder en user har en employee, linje 2 betyder at over i employee klassen er der en atribut der hedder user.
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Employee employee;

    public Employee getEmployee() {

        return employee;
    }

    public void setEmployee(Employee employee) {

        this.employee = employee;
    }

    public int getUserID() {

        return UserID;
    }

    public void setUserID(int userID) {

        UserID = userID;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
