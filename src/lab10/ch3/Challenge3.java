package lab10.ch3;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Challenge3 {
    private List<String> words = Arrays.asList("The", "Quick","brown", "fox","jumped","over","the","lazy","dog");
    public void displayLetters(){
         Flux.fromIterable(words).flatMap(word->Flux.fromArray(word.split(""))).subscribe(System.out::println);


    }

     void sortLetters(){
        Flux<String> manyLetters = Flux;
        Flux.fromIterable(words)
                .flatMap(word->Flux.fromArray(word.split("")))
                .sort()
                .distinct()
                .zipWith(Flux.range(1, Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s", count, string));

        manyLetters.subscribe(System.out::println);

    }
}
