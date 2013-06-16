test ="10011011001;0110,1001,1001,0,10,11"
list1 = test.split(';')
original = list1[0]
list2=list1[1].split(',')
f1=[] 
r1=[]
for i,x in enumerate(list2):
	if i%2 ==0:
		f1.append(x)
	else:
		r1.append(x)
print f1
print r1
for i in range(0,len(r1)):
	print original
	if int(r1[i],2)!=0:
		original = original.replace(f1[i],str(int(r1[i],2)))
	else:
		original = original.replace(f1[i],'x')
	print original

print original