package lab3.factory;

public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("NYMargherita")) {
            return new NYMargherita();
        }

        if (type.equals("NYQuattro")){
            return new NYQuattro();
        }

        return pizza;
    }
}
