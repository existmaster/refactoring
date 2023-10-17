package com.kosta.ExtractClassExample;

public class Person_Before {

    private static String name, officeAreaCode, officePrefix, officeLineNumber;

    public static String getName() { return name; }
    public static void setName(String name) { Person_Before.name = name; }
    public static String getTelephoneNumber() {
        return ("(" + officeAreaCode + ") " + officePrefix + "-" + officeLineNumber);
    }
    String getOfficeAreaCode() { return officeAreaCode; }
    static void setOfficeAreaCode(String arg) { officeAreaCode = arg; }
    String getOfficePrefix() { return officePrefix; }
    static void setOfficePrefix(String arg) { officePrefix = arg; }
    String getOfficeLineNumber() { return officeLineNumber; }
    static void setOfficeLineNumber(String arg) { officeLineNumber = arg; }

    public static void main(String[] args) {
        setName("June Park");
        setOfficeAreaCode("031");
        setOfficePrefix("555");
        setOfficeLineNumber("6666");
        System.out.println("Name: " + getName() + "\n" + "Telephone Number: " + getTelephoneNumber());
    }

}
