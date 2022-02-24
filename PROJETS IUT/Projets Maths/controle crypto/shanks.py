import math

def pgcd(x, y):
  
    while(y):
        x, y = y, x % y
    return x


print(" p = ?")
p = int(input())
n = p-1

m = math.floor((math.sqrt(n)))

print("alpha = ?")
alpha = int(input())
s = []
t = []

print("P = ?")
grandP = int(input())
print()

for i in range (m):
    if pgcd(alpha,p) == 1:
        gauche = alpha**m%p
        s.append(gauche**i%p)
        inverse = alpha**(p-2)%p
        droite = inverse**i*grandP%p
        t.append(droite)

print("S = ",s)
print("T = ",t)
print()

rangsQ = []
rangsR = []

for i in range (m):
    for j in range (m):
        if s[i] == t[j]:
            rangsQ.append(i)
            rangsR.append(j)

if len(rangsQ) > 0:
    q = rangsQ[0]
    r = rangsR[0]

    for i in range (1,len(rangsQ)):
        if r > rangsR[i]:
            q = rangsQ[i]
            r = rangsR[i]

    print("q = ",q)
    print("r = ",r)
    print()


    pause = input()
        
    print("k = mq + r [p]")
    print("k =",m,"*",q,"+",r,"[",p,"]")
    k = ((m*q)+r)%p
    print("k = ",k)
else:
    print("Pas de correspondances")
