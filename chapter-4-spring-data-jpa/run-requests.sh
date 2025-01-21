#!/bin/bash -x

http :8080/fruits
http :8080/fruits/Apple
http :8080/fruits/Pineapple
cat fruit.json | http :8080/fruits
http :8080/fruits
http :8080/fruits/Pineapple