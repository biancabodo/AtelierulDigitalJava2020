package lab4.visitor;

public class Book implements Element {
    private int NumberOfPages;
    private String name;

    public Book(int numberOfPages, String name) {
        this.NumberOfPages = numberOfPages;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    public void accept(Visitor v){v.visit(this);}
}
