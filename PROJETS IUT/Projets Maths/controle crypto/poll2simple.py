import math

def pgcd(x, y):
  
    while(y):
        x, y = y, x % y
    return x

print("n = ?")
n = int(input())
print("b = ?")
b = int(input())
print("x0 = y0 = ?")
x = int(input())
y = x

trouve = False
i = 1
while not trouve:
    x = ((x**2)+b)%n
    y = (((((y**2)+b)%n)**2)+b)%n
    g = pgcd(abs(x-y),n)
    print("i =",i,"x =",x," y=",y,"pgcd(x",i,"- y",i,",n) =",g,)
    if g > 1:
        trouve = True
        print(g," est un diviseur de N")
        pause = input()
        print("On pose p = ",g)
        print("q = n/p = ",int((n/g)))
    i += 1
    
