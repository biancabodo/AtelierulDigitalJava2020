package lab5.Challenge1;

import lab5.Challenge1.Currency;

public class EUR extends Currency {

    public EUR(){super.setName("EUR");}
    public EUR(float value){
        super(value, "EUR");
    }
}
