package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Employee {

    @Id
    private String ID;
    @Field
    private String Name;
    @Field
    private String Document;
    @Field
    private String User;
    @Field
    private String Password;

    public Employee() {}

    public Employee(String Name, String Document, String User, String Password) {
        this.Name = Name;
        this.Document = Document;
        this.User = User;
        this.Password = Password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDocument() {
        return Document;
    }

    public void setDocument(String Document) {
        this.Document = Document;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return String.format("Employee[ID='%s', Name='%s', Document='%s' User='%s', Password='%s'", ID, Name, Document, User, Password);
    }
}
