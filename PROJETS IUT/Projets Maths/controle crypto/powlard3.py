import math

def pgcd(x, y):
  
    while(y):
        x, y = y, x % y
    return x

print("n = ?")
n = int(input()) 

print("a1 = ?")
a = [0]
a.append(int(input()))
print()
p=0
i = 1
trouve = False

while not trouve:
    a.append(a[i]**(i+1)%n)
    print("a",i+1,"= a",i,"^",i+1,"=",a[i],"^",i+1,"=",a[i+1],"[n]")
    print("pgcd(n, a",i+1,"-1)")
    print("= pgcd(",n,",",(a[i+1]-1),") =",(pgcd(n, (a[i+1])-1)))
    if pgcd(n, (a[i+1])-1) != 1:
        p = pgcd(n, (a[i+1])-1)
        print(p," divise n")
        print("On psose p =",p)
        print("q = n/p = ",(n/p))
        trouve = True
    i += 1
