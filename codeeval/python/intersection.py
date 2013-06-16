import sys,re

test_cases = open(sys.argv[1],'r')
for test in test_cases:
    list=test.strip().split(';')
    list1 = map(int,re.findall(r'\d+',list[0]))
    list2 = map(int,re.findall(r'\d+',list[1]))
    #print list1
    #print list2
    list3=map(int,set(list1).intersection(set(list2)))
    #print list3
    print ','.join(str(x) for x in list3)