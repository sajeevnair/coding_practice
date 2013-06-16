a=0b101000
mask =(0b1 <<2)
desired =  mask&a
print bin(a)
print bin(mask)
print bin(desired)
mask2 =(0b1<<5)
desired2 = mask2&a
print bin(mask2)
desired2 = desired2 >> 5
desired = desired >> 2

print desired
print desired2

