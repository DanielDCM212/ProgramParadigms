#!/usr/bin/env bash
awk '{
score=$2+$3+$4;
overage=score/3;
if(overage>=90) print $0," : A";
else if(overage>=80) print $0," : B";
else if(overage>=50) print $0," : C";
else print $0," : Fail";
}' matrix.txt

