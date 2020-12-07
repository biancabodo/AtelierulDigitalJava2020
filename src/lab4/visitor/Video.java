package lab4.visitor;

public class Video implements Element {
    public String name;
    public int time;

    public Video(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }
}
