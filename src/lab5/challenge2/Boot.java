package lab5.challenge2;

public class Boot implements Shoe{
    private String color;
    private int size;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }

    public Boot(String color, int size) {
        this.color = color;
        this.size = size;
    }
}
