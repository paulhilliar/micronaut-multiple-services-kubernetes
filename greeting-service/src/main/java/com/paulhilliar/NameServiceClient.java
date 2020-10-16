package com.paulhilliar;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("http://name-service-loadbalancer:8080")
public interface NameServiceClient {

  @Get("/names")
  Name getName();

}