max =~0
n=100000000
m=101101
i=2
j=6
left = max-(0b1<<j-1)
print bin(left)

right=(0b1<<i-1)
print bin(right)
mask = left|right
print bin(mask)
print bin((n&mask)|m<<i)