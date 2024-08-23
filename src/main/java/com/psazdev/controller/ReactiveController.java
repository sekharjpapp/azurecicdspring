package com.psazdev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ReactiveController {


    @GetMapping("/mono")
    public Mono<String> mono() { return Mono.just("Mono"); } // <1>

    @GetMapping("/flux")
    public Flux<String> flux() {
        return Flux.just("Hello ","World !","from "," Flux"); } // <2>
}
