package lab10;

import reactor.core.publisher.Flux;


public class Challenge1 {
    static Flux<String> emptyFlux() {
        return Flux.empty();
    }

    public Flux<String> fooBarFluxforValues(){
        return Flux.just("foo", "bar");
    }

    public Flux<String> errorFlux(){
        return Flux.error(new IllegalAccessError());
    }

}


