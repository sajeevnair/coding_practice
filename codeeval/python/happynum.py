import sys
def happy(n):
    sum=0
    visited =set()
    while sum!=1:
        sum=0    
        while n:
            sum = (n%10)**2+sum
            n=n/10
        
        else:
            n=sum
        
        if  sum in visited:
            return 0
            break
        visited.add(sum)
    else:
        return 1
    

test_cases=open(sys.argv[1],'r')
for test in test_cases:
    n=int(test.strip())  
    print happy(n)  
    