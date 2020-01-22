#!/usr/bin/env bash

read N
sum=0
for((i=0;i<N;i++)); do
    read number
    sum=$(($sum+$number))
done

printf "%.3f\n" `echo "$sum / $N" | bc -l`
