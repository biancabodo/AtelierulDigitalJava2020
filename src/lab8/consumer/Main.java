package lab8.consumer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    @Test
    public void ex1(){
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));

        Consumer<List<String>> consumer = List::clear;
        consumer.accept(list);
        System.out.println(list);

        Assert.assertEquals(list, new ArrayList<>());
    }

    @Test
    public void ex2(){
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "c", "first", "second"));

        Consumer<List<String>> consumer = list1 -> list1.add("first");
        Consumer<List<String>> consumer2 = list1 -> list1.add("second");

        Consumer<List<String>> consumer3 = consumer.andThen(consumer2);
        consumer3.accept(list);



        Assert.assertEquals(list, list2);
    }

    public static void main(String[] args) {


    }
}
