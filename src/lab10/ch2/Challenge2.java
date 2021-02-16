package lab10.ch2;

import reactor.core.publisher.Mono;

public class Challenge2 {
    public Mono <String> emptyMono(){
        return Mono.empty();
    }

    public Mono <String> monoWithNoSignal(){
        return Mono.never();
    }

    public Mono<String> fooMono() {
        return Mono.just("FOO");
    }

    public Mono<String> errorMono() {
        return Mono.error(new IllegalStateException());
    }
}
