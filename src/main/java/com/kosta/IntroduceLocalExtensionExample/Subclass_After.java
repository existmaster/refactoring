package com.kosta.IntroduceLocalExtensionExample;

import java.util.Date;

public class Subclass_After extends Date{

    public Subclass_After(Date arg) {
        super(arg.getTime());
    }

    public Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }
}
