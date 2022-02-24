nbc=int(input("Entrer le nombre de colonne(s) de la matrice : "))
nbl=int(input("Entrer le nombre de ligne(s) de la matrice : "))
 
mat=[ [0 for i in range(0,nbc)] for j in range(0,nbl)]
print(mat)
 
for i in range(nbl):
    for j in range(nbc):                
        mat[i][j]=int(input("Entrer le terme de la ligne "+str(i)+" et de la colonne "+str(j)+" : "))
        print(mat)
print("")
print(mat)