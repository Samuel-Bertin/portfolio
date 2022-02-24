

t=int(input("entrez la taille de la matrice carree : "))
mat = [[ None for y in range( t ) ] for x in range( t ) ]

print("Attention, pour entrer la valeur infini entrer un nombre > 20000")

for i in range(0,t):
	for j in range (0,t):
		print("M[",i+1,"][",j+1,"]")
		mat[i][j] = float(input("->"))
		if mat[i][j] > 200000:
			mat[i][j] = float('inf')

tab = []

for i in range(0,t):
	tab.append(mat[0][i])

print(tab)
for j in range (0,t):
	for i in range(0,t):
		mini  = tab[i]
		for z in range(0,t):
			x = tab[z] 
			y = mat[z][i]
			if x + y < mini:
				tab[i] = x+y
			
	print(tab)
