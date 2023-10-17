package com.kosta.ExtractClassExample;

public class TelephoneNumber_After {

    private static String areaCode, prefix, lineNumber;

    public static String getTelephoneNumber() {
        return ("(" + areaCode + ") " + prefix + "-" + lineNumber);
    }

    public static String getAreaCode() {
        return areaCode;
    }

    public static void setAreaCode(String areaCode) {
        TelephoneNumber_After.areaCode = areaCode;
    }

    public static String getPrefix() {
        return prefix;
    }

    public static void setPrefix(String prefix) {
        TelephoneNumber_After.prefix = prefix;
    }

    public static String getLineNumber() {
        return lineNumber;
    }

    public static void setLineNumber(String lineNumber) {
        TelephoneNumber_After.lineNumber = lineNumber;
    }
}
