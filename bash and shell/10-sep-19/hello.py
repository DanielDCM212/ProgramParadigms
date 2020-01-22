#!/usr/bin/env python
from future import print function
import sys
print("#stdout", file=sys.stdout)
print("#stderrt", file=sys.stderr)

for line in sys.stdin:
    print(line, file=sys.stdout)
