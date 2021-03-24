package com.gitters.domain;

public enum Currency {

        $("USD"), ₪("NIS"), €("EURO"), £("GBP"), JD("JOD");

        private final String value;

        private Currency(String value) {
                this.value = value;
        }

        @Override
        public String toString() {
                return this.value;
        }
}
