from math import sqrt
for i in range(999,1,-1):
        u=i%10
        th=(i/100)
        t=(i/10)%10
        digit_sum = u+t+th
        last_two=t*10+u
        prime =True
        # is divisible by 2?
        if u!=th:
                pass
        else:
                for x in range(2,int(sqrt(i))):
                        if i%x==0:
                            prime=False
                            break
                if not prime:
                        pass

                else:
                        print i
                        break


