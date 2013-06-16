'''
Given a string s, little Johnny defined the beauty of the string as the sum of the beauty of the letters in it.
The beauty of each letter is an integer between 1 and 26, inclusive, and no two letters have the same beauty.
 Johnny doesn't care about whether letters are uppercase or lowercase, so that doesn't affect the beauty of a letter. 
 (Uppercase 'F' is exactly as beautiful as lowercase 'f', for example.)
You're a student writing a report on the youth of this famous hacker. 
You found the string that Johnny considered most beautiful. What is the maximum possible beauty of this string?
'''
import collections,sys
#open file
test_case = open(sys.argv[1],'r')
for test in test_case:
    #remove new line and convert to lower case
    test=test.strip().lower()
    #create a dict 
    d = collections.defaultdict(int);
    # list to store all letter freq
    list1=[]
    # store letter freq in dict
    for c in test:
        d[c]+=1
    # copy the freq of only alphabets  to list for sorting
    for x in d:
        if x.isalpha():
            list1.append(int(d[x]))
    # reverse sort the list
    list1.sort(reverse=True)
    
    score=26
    beauty=0
    for x in list1:
        beauty+=score*x
        score=score-1
    #print the beauty 
    print beauty
test_case.close()