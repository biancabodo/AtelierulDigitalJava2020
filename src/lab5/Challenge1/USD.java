package lab5.Challenge1;

import lab5.Challenge1.Currency;

public class USD extends Currency {

    public USD(){super.setName("USD");}
    public USD(float value){
        super(value, "USD");
    }
}
