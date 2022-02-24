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

    for _ in range(len(graphe) - 1):
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

    return distances

if __name__ == '__main__':

    graphe = [
        [0,-1,4,float("Inf"),float("Inf")],
        [float("Inf"),0,3,2,2],
        [float("Inf"),float("Inf"),0,float("Inf"),float("Inf")],
        [float("Inf"),1,5,0,float("Inf")],
        [float("Inf"),float("Inf"),float("Inf"),-3,0]
    ]
    distances = BellmanFord(graphe, 0)
    print("Distances depuis la Source")
    for i in range(len(distances)):
        print("Sommet",i,"\t-->\t",distances[i])