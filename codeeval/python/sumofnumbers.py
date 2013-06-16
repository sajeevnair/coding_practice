import sys
test_cases  = open(sys.argv[1],'r')
numbers=[]
for tests in test_cases:    
    numbers.append(int(tests.strip()))
print sum(numbers)
