package edu.dmacc.codedsm.tasker.objects;

import edu.dmacc.codedsm.tasker.TaskAssigner;

import java.util.Objects;

public class User implements TaskAssigner {

    private String firstName;
    private String lastName;
    private String contactInfo;

    public User(String firstName, String lastName, String contactInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(contactInfo, user.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, contactInfo);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }

    @Override
    public void assignInPerson() {
        System.out.println("Assigned in person. (User)");
    }

    @Override
    public void assignOverEmail() {
        System.out.println("Assigned over email. (User)");
    }

    @Override
    public void assignOverPhone() {
        System.out.println("Assigned over phone. (User)");
    }
}
