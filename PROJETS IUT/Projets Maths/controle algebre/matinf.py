def BellmanFord(graphe, origine):
    """
    Fonction qui permet de lancer l'algorithme de Bellman-Ford sur un graphe:
    - graphe : La Matrice d'adjacence du graphe
    - origine : Le sommet à partir duquel seront calculé toutes les distances
    L'algorithme de BellmanFord tolère les arcs de poids négatifs et détecte les
    cycles négatifs.
    """

    distances = [float("Inf")] * len(graphe)
    distances[origine] = 0
    for i in range (len(graphe)-1):
        distances[i+1] = graphe[0][i+1]


    for _ in range(len(graphe) - 1):
        if _  == 0:
            print()
            print("Initialisation pour i = 1")
        else:
            print()
            print("Relaxation pour i = ", _+1)
        print("d(0) = ",distances[0])
        """"print("d(1) = min [",distances[1],",",distances[0],"+",graphe[0][1],"=",distances[0]+graphe[0][1],",",distances[2],"+",graphe[2][1],"=",distances[2]+graphe[2][1],",",distances[3],"+",graphe[3][1],"=",distances[3]+graphe[3][1],"] = ", min(distances[1],distances[0]+graphe[0][1],distances[2]+graphe[2][1],distances[3]+graphe[3][1]))
        print("d(2) = min [",distances[2],",",distances[0],"+",graphe[0][2],"=",distances[0]+graphe[0][2],",",distances[1],"+",graphe[1][2],"=",distances[1]+graphe[1][2],",",distances[3],"+",graphe[3][2],"=",distances[3]+graphe[3][2],"] = ", min(distances[2],distances[0]+graphe[0][2],distances[1]+graphe[1][2],distances[3]+graphe[3][2]))
        print("d(3) = min [",distances[3],",",distances[0],"+",graphe[0][3],"=",distances[0]+graphe[0][3],",",distances[1],"+",graphe[1][3],"=",distances[1]+graphe[1][3],",",distances[2],"+",graphe[2][3],"=",distances[2]+graphe[2][3],"] = ", min(distances[3],distances[0]+graphe[0][3],distances[1]+graphe[1][3],distances[2]+graphe[2][3]))
        print()"""

        for i in range(1,len(graphe)):
            string = "d("
            string += str(i)
            string += ") = min [ "
            string += str((distances[i]))
            for j in range (1,len(graphe)):
                if j <= i:
                    j -= 1
                string += " , "
                string += str((distances[i-(i-j)]))
                string += " + "
                string += str((graphe[j][i]))
                string += " = "
                string += str((distances[i-(i-j)]+graphe[j][i]))
            string += " ]"
            print(string)
        print(distances)
        pause = input()

        for u in range(len(graphe)):
            for v in range(len(graphe)):
                if distances[u] + graphe[u][v] < distances[v]:
                        distances[v] = distances[u] + graphe[u][v]


    # Si on trouve une distance inférieure après le premier parcours, il y a
    # un cycle négatif
    for u in range(len(graphe)):
        for v in range(len(graphe)):
            if distances[u] + graphe[u][v] < distances[v]:
                print("Le graphe contient un cycle négatif")
                return

    print()
    return distances


print("Nb de sommets ?")
nbSommets = int(input())

"""Création d'une matrice  m d'ordre nbSommets initialisée a l'infini"""
m = [[float("Inf")] * nbSommets for i in range(nbSommets)]

"""Pour chaque sommet"""
for i in range(nbSommets):
    for j in range(nbSommets):
        print()
        print("Cout de la matrice au rang [", i, j)
        cout = input()
        if cout != "" :
            m[i][j] = float(cout)

print()
print("Pour le graphe associé a la matrice de cout:")
print(m)
print()
distances = BellmanFord(m, 0)
print("Distances depuis la Source")
for i in range(len(distances)):
    print("Sommet",i,"\t-->\t",distances[i])