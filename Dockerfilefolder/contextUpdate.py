#!/usr/bin/python
import datetime
import time
import sys
try:
    f = open("contextvalues.txt", "a")
except:
    print ("Error: can't open file")

for i in range (0, 10000):
    t = time.strftime('%H:%M:%S')
    t = t + str(" ") + str(i)
    f.write(t) 
    f.write(' \n')
    time.sleep(1)
f.close()    
