'''
Program to calculate Fibonacci sequence up to number n 
Works for -ve sequence too
This program accepts input from the terminal
'''
import sys
def fibonacci(n):
    xn1=0 # Xn-1
    xn2=1 # Xn-2
    mult=1 # multiplier for negetive values

    fib=0 

    if n==0:
        return 0
    if n==1:
        return 1
    if n<0:
        n=n*-1
        mult = (-1)**(n+1)
        if n==-1:
            return -1

    for i in range(2,n+1):
        fib =xn1+xn2
        xn1=xn2
        xn2=fib

    return fib*mult

def fib(n):
    m=1
    if n==0:
        return 0;
    if n==1:
        return 1;
    if n<0:
        if n==-1:
            return -1
        n=n*(-1)
        m=(-1)**(n+1)

    return m*(fib(n-1)+fib(n-2))
    



#print fibonacci(int(sys.argv[1]))

print fib(10) # recuresive 
print fibonacci(1000) # The  iterative function


raw_input("Press enter ..")

