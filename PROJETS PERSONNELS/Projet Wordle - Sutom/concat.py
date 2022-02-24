motsATrier = chaineATrier = "ABACA ABALE ABATS ABBES ABCES ABDOS ABEES ABERS ABETI ABIES ABIMA ABIME ABLES ABOIE ABOIS ABOLI ABORD ABOTS ABOUT ABOYA ABOYE ABRAS ABRIA ABRIE ABRIS ABUSA ABUSE ABUTA ABUTE ABYME ACAIS ACARE ACCES ACCON ACCOT ACCRO ACCRU ACCUL ACCUS ACERA ACERE ACHAR ACHAT ACHEB ACHES ACIDE ACIER ACINI ACMES ACNES ACONS ACORE ACRAS ACRES ACTAI ACTAS ACTAT ACTEE ACTER ACTES ACTEZ ACTIF ACTUS ACULS ACYLE ADACS ADAGE ADAVS ADDAX ADENT ADIEU ADIRE ADJAR ADMET ADMIS ADMIT ADNEE ADNES ADOBE ADONC ADONS ADORA ADORE ADRAR ADRET ADULA ADULE AEDES AERAI AERAS AERAT AEREE AERER AERES AEREZ AFARE AFARS AFATS AFFIN AFFUT AFROS AFTER AGACA AGACE AGADA AGAME AGAMI AGAPE AGATE AGAVE AGEES AGENT"
nbEspaces = chaineATrier.count(" ")
indiceDebutMot = 0
if chaineATrier.count(" ")!=0:
    indiceFinMot = chaineATrier.index(" ")
else:
    indiceFinMot = len(chaineATrier)
listeDesMotsTries = []
 
for i in range(0, nbEspaces + 1):
    listeDesMotsTries.append(chaineATrier[indiceDebutMot:indiceFinMot])
    chaineATrier=chaineATrier[indiceFinMot+1:]
    if chaineATrier.count(" ")!=0:
        indiceFinMot = chaineATrier.index(" ")
    else:
        indiceFinMot = len(chaineATrier)
 
for j in range(len(listeDesMotsTries)):
    print('\"'+listeDesMotsTries[j]+'\",')