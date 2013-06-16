import sys,re

test_cases = open(sys.argv[1],'r')
for test in test_cases:
    s=test.strip().split(',')
    print str(s[0]).find(str(s[1]))