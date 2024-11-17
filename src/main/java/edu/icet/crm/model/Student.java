package edu.icet.crm.model;

import java.util.Base64;

public class Student {

    private String name;

    private String email;

    private String contactNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if("".equalsIgnoreCase(name)) return; //If the string value null then it can not use setName
        Base64.getEncoder().encode();
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
