package com.kosta.ChangeReferenceToValueExample;

public class ChangeReferenceToValueExample_Before {

    static class Client_Before {

        public static void main(String[] args) {
            System.out.println(new Currency_Before("USD").equals(new Currency_Before("USD")));
        }

    }

    static class Currency_Before {

        private String code;

        Currency_Before(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

    }

}
