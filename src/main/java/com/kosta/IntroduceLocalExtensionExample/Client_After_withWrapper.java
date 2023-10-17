package com.kosta.IntroduceLocalExtensionExample;

import java.util.Date;

public class Client_After_withWrapper {
    public static void main(String[] args) {
        Wrapper_After today = new Wrapper_After(new Date());
        System.out.println("Next day is " + today.nextDay());
    }
}
