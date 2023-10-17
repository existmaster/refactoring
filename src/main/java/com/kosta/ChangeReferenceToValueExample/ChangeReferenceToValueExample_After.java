package com.kosta.ChangeReferenceToValueExample;

import java.util.Objects;

public class ChangeReferenceToValueExample_After {

    static class Client_After {

        public static void main(String[] args) {
            System.out.println(new Currency_After("USD").equals(new Currency_After("USD")));
        }

    }

    static class Currency_After {

        private String code;

        Currency_After(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Currency_After that = (Currency_After) o;
            return Objects.equals(code, that.code);
        }

        @Override
        public int hashCode() {
            return Objects.hash(code);
        }
    }

}
