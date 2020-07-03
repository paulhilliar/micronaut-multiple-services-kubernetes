package com.paulhilliar;

import com.github.javafaker.Faker;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * Use {@link Faker} to generate a random name
 */
@Controller("/names")
class NameController {

    @Get("/")
    Name generateRandomName() {
        Faker faker = new Faker();
        com.github.javafaker.Name name = faker.name();
        return new Name(name.firstName(), name.lastName());
    }

}
