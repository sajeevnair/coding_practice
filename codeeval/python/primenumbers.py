from math import sqrt
import sys
def nprime(N):
    count =0
    primes=[]
    primes.append(2)
    primes.append(3)

    #check if the number is divisible by any number before its square root
    for i in range(2,N):
        prime=True 
        #print "i="+str(i)
        #print "sqrt= "+str(int(sqrt(N)))
        for j in range(2,int(sqrt(N))+1):
            
            #print str(i)+"/"+str(j)
            if i%j==0:
                prime=False
                break
        if prime:
            primes.append(i)
            count =0
    return primes
                     
                        
test_case=open(sys.argv[1],'r')
for test in test_case:
    N=int(test.strip())
    
    print ','.join(str(num) for num in nprime(N)).strip()
