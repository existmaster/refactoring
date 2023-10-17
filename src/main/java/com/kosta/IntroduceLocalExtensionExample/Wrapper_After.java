package com.kosta.IntroduceLocalExtensionExample;

import java.util.Date;

public class Wrapper_After {

    private final Date date;

    public Wrapper_After(Date date) {
        this.date = date;
    }

    public int getYear() {
        return this.date.getYear();
    }

    public int getMonth() {
        return this.date.getMonth();
    }

    public int getDate() {
        return this.date.getDate();
    }

    public Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }
}
