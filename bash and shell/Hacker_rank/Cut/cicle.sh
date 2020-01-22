#!/usr/bin/env bas

read N
for((i=0;i<$N;i++)); do
    read a
    echo ${a:2:1}
done
