from math import sqrt
sum =0
n=1000
i=2
while n>0:
        
        
        prime =True
        
        # is divisible by sqrt
        
        for x in range(2,int(sqrt(i))+1):
                if i%x==0:
                    prime=False
                    break
        if not prime:
                i=i+1

        else:
                sum += i
                n=n-1
                i=i+1
                #print i,

print sum


