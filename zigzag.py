import random
import time
import sys
#cerner_2^5_2019
dir = 1
countdir = -1
count = 30
pos = 1
while True:
    scape = ""
    for i in range(0, 80) :
        if dir == -1 and i == 40 - pos : scape += '/'
        elif dir == -1 and i == 40 + pos : scape += '\\'
        elif dir == 1 and i == 40 + pos : scape += '\\'
        elif dir == 1 and i == 40 - pos  : scape += '/'
        else: scape += '_'
    print(scape)
    time.sleep(.01 + .001 / (count / 30))
    pos += dir
    if pos == 0 :
        dir = 1
        if count <= 10 :
            countdir = 1
        count += countdir
    elif pos >= count / 2 :
        dir = -1
        if count >= 30 :
            countdir = -1
        count += countdir