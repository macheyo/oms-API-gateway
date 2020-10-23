package com.footprint.omsAPIgateway.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackController {
    @RequestMapping("/orderingFallback")
    public Mono<String> orderingServiceFallBack(){
        return Mono.just("Ordering Service is taking too long to respond or is unavailable, Please contact the system administrator");
    }
    @RequestMapping("/paymentFallback")
    public Mono<String> paymentServiceFallBack(){
        return Mono.just("Payment Service is taking too long to respond or is unavailable, Please contact the system administrator");
    }
}
