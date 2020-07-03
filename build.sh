#!/usr/bin/env bash

mvn clean install

pushd greeting-service
  docker build -t greeting-service .
popd

pushd name-service
  docker build -t name-service .
popd

