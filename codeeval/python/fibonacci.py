import string
for i in range(1,13):
    for j in range(1,13):
        print string.rjust(`i*j`,4),
    print '\n'
