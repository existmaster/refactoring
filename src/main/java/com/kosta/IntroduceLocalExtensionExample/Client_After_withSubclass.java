package com.kosta.IntroduceLocalExtensionExample;

import java.util.Date;

public class Client_After_withSubclass {
    public static void main(String[] args) {
        Subclass_After today = new Subclass_After(new Date());
        System.out.println("Next day is " + today.nextDay());
    }
}
