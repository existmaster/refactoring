package com.kosta.ExtractClassExample;

public class Person_After {

    private static String name;
    private static TelephoneNumber_After officeTelephoneNumber = new TelephoneNumber_After();

    public static String getName() { return name; }
    public static void setName(String name) { Person_After.name = name; }

    public static String getOfficeTelephoneNumber() {
        return TelephoneNumber_After.getTelephoneNumber();
    }

    public static void main(String[] args) {
        setName("June Park");
        officeTelephoneNumber.setAreaCode("031");
        officeTelephoneNumber.setPrefix("555");
        officeTelephoneNumber.setLineNumber("6666");
        System.out.println(
                "Name: " + getName() + "\n" + "Telephone Number: "
                        + getOfficeTelephoneNumber());
    }

}
