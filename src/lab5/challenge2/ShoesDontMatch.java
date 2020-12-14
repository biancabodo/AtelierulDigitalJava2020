package lab5.challenge2;

public class ShoesDontMatch extends Exception {
    public ShoesDontMatch(){
        super("Wrong params, they must have same color and size!");
    }
}
