#!/usr/bin/env bash

# OPTION=$1
[[ -z "$1" ]] && OPTION="" || OPTION=$1

if [[ $OPTION = "test" ]]
then
      # This will run the tests.
      ./mvnw clean test
else
      # This will complete the package phase and write only errors to the console.
      # The package phase includes: compilation, unit tests and build.
      ./mvnw clean package > /dev/null

      # This will run the compiled console application.
      java -cp target/PokerHandApplication-1.0.0.jar com.poker.App
fi




