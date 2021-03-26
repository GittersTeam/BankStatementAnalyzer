package com.gitters.domain;

public enum Currency {

        USD("$"), NIS("₪"), EURO("€"), GBP("£"), JD("JOD");

        private String value;

        private Currency(String value) {
                this.value = value;
        }

        // @Override
        // public String toString() {
        // return this.value;
        // }

        /**
         * @return String return the value
         */
        public String getValue() {
                return value;
        }

        /**
         * @param value the value to set
         */
        public void setValue(String value) {
                this.value = value;
        }

}
