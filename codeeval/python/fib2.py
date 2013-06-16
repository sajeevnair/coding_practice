import sys
def fib(n):
    count=0
    a=0
    b=1   
    n1=0
    if n==0:
        return 0
    if n<0:
        n1=n
        n=n*-1
        
    while count<n-1:
        temp=a
        a=b
        b=temp+a
        count=count+1
    if n1<0:
        
        return b*(-1)**(n+1)
    return b

n=int(sys.argv[1])
print fib(n)