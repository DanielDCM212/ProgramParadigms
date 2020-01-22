#!/usr/bin/env bash

read input

if [[ "$input" == 'Y' || "$input" == 'y' ]]; then
    echo 'YES'
else
    echo 'NO'
fi

read letter

if [[ "$letter" == 'Y' || "$letter" == 'y' ]]; then
    echo 'Yes'
else
    echo 'No'
fi
