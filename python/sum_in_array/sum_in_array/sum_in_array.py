'''
Program to find pair of values in a list that form the sum entered by the user
'''
import random
#fill list with unique random integers
values  = random.sample(range(20),10)

# display the list
for idx,val in enumerate(values):
    print idx,val

# find all the pairs of values in the list that give the sum
def sum_exists(sum,values):
    values.sort()
    l=len(values)
    start = 0
    end = l-1
    count=0
    while start<end:
        if values[start]+values[end]<sum:
            start+=1
        elif values[start]+values[end]>sum:
            start=0
            end-=1
        else:
            print values[start], values[end]
            start=0
            end-=1
            count+=1
    else:
        print "found "+str(count)+" pair(s) of number(s) that add up to "+str(sum)

#get sum from user
sum= raw_input("Enter the sum you want to find:\n")
print "values that add up to "+sum
sum_exists(int(sum),values)

ch=raw_input("Hit enter to exit the program\n")