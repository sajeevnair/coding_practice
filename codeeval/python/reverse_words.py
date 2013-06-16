import sys

test_cases = open(sys.argv[1], 'r')

for sentence in test_cases:
        words = sentence.split()
        print ' '.join(reversed(words))
test_cases.close()
