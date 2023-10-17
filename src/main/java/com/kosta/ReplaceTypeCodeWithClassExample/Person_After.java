package com.kosta.ReplaceTypeCodeWithClassExample;

public class Person_After {

    public static final int O = BloodType_After.O.getBloodTypeCode();
    public static final int A = BloodType_After.A.getBloodTypeCode();
    public static final int B = BloodType_After.B.getBloodTypeCode();
    public static final int AB = BloodType_After.AB.getBloodTypeCode();
    public static final String[] bloodTypes = {"O", "A", "B", "AB"};

    private String name;
    private BloodType_After bloodType;

    public Person_After(BloodType_After bloodType) {
        this.bloodType = bloodType;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public BloodType_After getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType_After bloodType) {
        this.bloodType = bloodType;
    }

    public int getBloodTypeCode() {
        return bloodType.getBloodTypeCode();
    }

    public static void main(String[] args) {
        Person_After june = new Person_After(BloodType_After.A);
        june.setName("June");
        System.out.println(june.getName() + "'s blood type is " + bloodTypes[june.getBloodType().getBloodTypeCode()]);
    }

}
