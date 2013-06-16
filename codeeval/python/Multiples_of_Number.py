import sys,re

test_cases = open(sys.argv[1], 'r')
l1=[]
for tests in test_cases:
    x=map(int, re.findall(r'\d+', tests))
    #print x
    a=int(x[0])
    b=int(x[1])
    #print a,
    #print b
    i=2
    multiple = b*i
    while a>multiple:
        i=i+1
        multiple=b*i
    else:
        print multiple
    
test_cases.close()
