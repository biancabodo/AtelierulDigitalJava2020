package lab10;
import java.time.Duration;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Challenge1 ch1 = new Challenge1();
        ch1.emptyFlux().subscribe(System.out::println);
        ch1.fooBarFluxforValues().subscribe(System.out::println);
        ch1.errorFlux().subscribe(System.out::println);

    }
}
