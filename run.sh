#!/usr/bin/env bash

# OPTION=$1
[[ -z "$1" ]] && OPTION="" || OPTION=$1

if [[ $OPTION = "test" ]]
then
      # echo "\$var is empty"
      ./mvnw clean test
else
      # echo "\$var is NOT empty"
      ./mvnw clean package > /dev/null

      java -cp target/PokerHandApplication-1.0.0.jar com.poker.App
fi




