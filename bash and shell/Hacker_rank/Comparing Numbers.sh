#!usr/bin/env bash

read x
read y

if (( $x>$y )); then
    echo "X is greater than Y"
elif (( $x<$y )); then
    echo "Y is greater than X"
else
    echo "X is equal to Y"
fi
