package lab8;

import java.util.*;
import java.util.function.UnaryOperator;

public class Main {

    static String ex1(){
        List<String> inputList = Arrays.asList("Hello", "End", "Long", "Light", "Other");
        StringBuilder sb = new StringBuilder();
        inputList.forEach(s -> sb.append(s.charAt(0)));
        return sb.toString();
    }

    static void ex2(){
        List<String> inputList = new ArrayList<>(Arrays.asList("Hello", "End", "Long", "Light", "Other"));
        inputList.removeIf(s -> s.length()%2 == 1);
        inputList.forEach(System.out::println);

    }

    static void ex3(){
        List<String> inputList = new ArrayList<>(Arrays.asList("Hello", "End", "Long", "Light", "Other"));
        inputList.replaceAll(String::toUpperCase);
        inputList.forEach(System.out::println);

    }

    static void ex4(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "First");
        map.put("2", "Second");
        map.put("3", "Third");

        StringBuilder sb = new StringBuilder();
        map.forEach((k,v) -> sb.append(k).append(v));
        System.out.println(sb);

    }

    static void ex5(){
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        new Thread(() -> inputList.forEach(System.out::print)).start();

    }



    public static void main(String[] args) {
        System.out.println(ex1());
        ex2();
        ex3();
        ex4();
        ex5();
    }
}
