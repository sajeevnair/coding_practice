import sys,re

test_cases = open(sys.argv[1],'r')
list2=[]
for test in test_cases:
    list1 = map(int,re.findall(r'\d+',test))
    print ','.join(str(num) for num in list(set(list1))),
    print '\n'
