package com.paulhilliar;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/greetings")
class GreetingController {

    @Get("/")
    Greeting generateGreeting() {
        return new Greeting("Hi", "Bob Smith");
    }

}
