package com.kosta.EncapsulateCollectionExample;

public class Course_Before {
    private String name;
    private boolean isAdvanced;
    public Course_Before(String name, boolean isAdvanced) {
        this.name = name;
        this.isAdvanced = isAdvanced;
    }
    public boolean isAdvanced() { return isAdvanced; }
}
