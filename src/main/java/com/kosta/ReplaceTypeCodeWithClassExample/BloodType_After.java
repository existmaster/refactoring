package com.kosta.ReplaceTypeCodeWithClassExample;

public class BloodType_After {
    public static final BloodType_After O = new BloodType_After(0);
    public static final BloodType_After A = new BloodType_After(1);
    public static final BloodType_After B = new BloodType_After(2);
    public static final BloodType_After AB = new BloodType_After(3);
    public static final BloodType_After[] bloodTypes = {O, A, B, AB};
    private final int bloodTypeCode;

    public static BloodType_After bloodType(int code) { return bloodTypes[code]; }

    public BloodType_After(int bloodTypeCode) {
        this.bloodTypeCode = bloodTypeCode;
    }

    public int getBloodTypeCode() {
        return bloodTypeCode;
    }
}
