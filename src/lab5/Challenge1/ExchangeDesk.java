package lab5.Challenge1;

import lab5.Challenge1.Currency;

public class ExchangeDesk {
    public <A extends Currency,B extends Currency> B exchange (A from, Class<B> to, float rate){
        B toReturn = null;
        try {
            toReturn = to.getDeclaredConstructor().newInstance();
            toReturn.setValue( from.getValue() * rate);
        }catch(Exception ex){
            System.out.println(ex);
        }

        return toReturn;

    }
}
