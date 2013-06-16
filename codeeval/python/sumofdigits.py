import sys,re

test_cases = open(sys.argv[1], 'r')

for tests in test_cases:
    print sum(map(int,str(tests.strip())))
    
    
    
test_cases.close()
