package com.paulhilliar;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/greetings")
public class GreetingController {

    private final NameServiceClient nameServiceClient;

    public GreetingController(NameServiceClient nameServiceClient) {
        this.nameServiceClient = nameServiceClient;
    }

    @Get("/")
    Greeting generateGreeting() {
        Name name = nameServiceClient.getName();
        return new Greeting("Hi", String.format("%s %s", name.getFirstName(), name.getLastName()));
    }

}
