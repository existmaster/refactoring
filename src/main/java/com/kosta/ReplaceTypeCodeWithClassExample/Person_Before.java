package com.kosta.ReplaceTypeCodeWithClassExample;

public class Person_Before {

    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;
    public static final String[] bloodTypes = {"O", "A", "B", "AB"};

    private String name;
    private int bloodTypeCode;

    public Person_Before(int bloodTypeCode) {
        this.bloodTypeCode = bloodTypeCode;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBloodTypeCode() {
        return bloodTypeCode;
    }
    public void setBloodGroupCode(int bloodTypeCode) {
        this.bloodTypeCode = bloodTypeCode;
    }

    public static void main(String[] args) {
        Person_Before june = new Person_Before(Person_Before.B);
        june.setName("June");
        System.out.println(june.getName() + "'s blood type is " + bloodTypes[june.getBloodTypeCode()]);
    }

}
