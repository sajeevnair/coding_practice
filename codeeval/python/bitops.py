import sys,re

test_cases = open(sys.argv[1], 'r')
l1=[]
for tests in test_cases:
    x=map(int, re.findall(r'\d+', tests))
    #print x
    n=int(x[0])
    a=int(x[1])
    b=int(x[2])
    
    #print bin(n)
    #print (a)
    #print (b)

    mask1=(0b1<<a-1)
    #print bin(mask1)
    mask2=(0b1<<b-1)
    #print bin(mask2)
    
    x=mask1&n
    y=mask2&n
    #print bin(x)
    #print bin(y)
    x=x>>a-1
    y=y>>b-1
    #print bin(x)
    #print bin(y)
    #print "\n"
    if x==y:
        print "true"
    else:
        print "false"
    
    
test_cases.close()
