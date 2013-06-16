import sys

test_cases = open(sys.argv[1], 'r')

for test in test_cases:
        inputs = test.split(" ")

        a=int(inputs[0])
        b=int(inputs[1])
        n=int(inputs[2])

        for i in range(1,n+1):
                if i%a==0 and i%b==0:
                        print "FB",
                elif i%a==0:
                        print "F",
                elif i%b==0:
                        print "B",
                else:
                        print i,
        print "\n"



test_cases.close()
