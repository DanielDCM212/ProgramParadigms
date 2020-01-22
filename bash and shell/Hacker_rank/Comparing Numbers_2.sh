#!/usr/bin/env bash

read a
read b

if(($a==$b)); then
    echo "X is equal Y"
elif(($a>$b)); then
    echo "X is greater than Y"
else
    echo "X is less than Y"
fi
