package lab3.factory;

public class ChicagoPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("CHMargherita")) {
            return new CHMargherita();
        }

        if (type.equals("CHQuattro")){
            return new CHQuattro();
        }

        return pizza;
    }
}
