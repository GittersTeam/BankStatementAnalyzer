package com.gitters.domain;

public enum Currency {

        USD("$"), NIS("₪"), EURO("€"), GBP("£"),JOD("JD"); 
        
        private String value;
        private Currency(String value){
        this.value=value;
        }
        
   
}
