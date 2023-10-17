package com.kosta.ChangeUnidirectionalAssociationToBidirectionalExample;

public class Customer_Before {

    private String name, emailAddress;
    public Customer_Before(String name) { this.name =name; }
    String getName() { return name; }
    void setName(String arg) { name = arg; }

}
