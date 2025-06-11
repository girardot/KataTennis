# Coding dojo

## Déroulement 

- Introduction
  - Coding dojo
  - Sujet + Contraintes + Outils
  - TDD
- Code + Tests
- Partage des solutions
- Rétrospective

# Tennis

L’objectif de ce kata est d’implémenter le système de score du tennis (un match en un jeu).

### Les règles du tennis sont les suivantes:

- Durant un jeu, le serveur ou le receveur peuvent avoir un score de 0, 15, 30 ou 40, correspondant respectivement à 0, 1, 2 ou 3 points marqués.

- Un jeu est remporté par le premier joueur ayant gagné au moins quatre points au total et ayant au moins deux points d'avance sur son adversaire.

- Lorsque les deux joueurs ont marqué trois points chacun (soit 40 - 40), le score est alors noté "Égalité" (Deuce). Le joueur qui marque le point suivant obtient "Avantage".

- Pour remporter le jeu, un joueur ayant l'avantage doit marquer un point supplémentaire.

- Si c’est l’autre joueur (celui qui n’a pas l’avantage) qui marque le point suivant, on revient à "Égalité", et ainsi de suite jusqu’à ce qu’un joueur remporte le jeu.

### Les règles du Kata :

- La classe **TennisGame** doit implémenter l’interface **TennisGameInterface** (cette interface ne doit pas être modifiée).

- La méthode getScore de la classe **TennisGame** doit retourner une chaîne de caractères parmi les valeurs suivantes: 
  - "Love,Fifteen" | "Love,Thirty" | "Love,Forty" | "Fifteen,Forty" | ...
  - "Love all" | "Fifteen all" | "Thirty all" 
  - "Deuce"
  - "Advantage Player1"
  - "Advantage Player2"
  - "Player1 wins"
  - "Player2 wins"

### Les contraintes : 
- Faire du TDD.
- Surprise en cours de kata !!!
