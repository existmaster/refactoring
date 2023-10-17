package com.kosta.HideDelegateExample;

public class Department_Before {
    private String departmentName;
    private String chargeCode;

    public Department_Before(String departmentName) { this.departmentName = departmentName; }

    public String getDepartmentName() { return departmentName; }
    public String getChargeCode() { return chargeCode; }
    public void setChargeCode(String chargeCode) { this.chargeCode = chargeCode; }

}
