# TP-Inversion-Controle-SD

\# Compte Rendu : Inversion de Contrôle et Injection des Dépendances



\## Introduction

Ce TP présente les concepts de couplage faible et d'Inversion de Contrôle (IoC).



\## Structure du projet

\- \*\*dao\*\* : Interface IDao et implémentation DaoImpl.

\- \*\*metier\*\* : Interface IMetier et implémentation MetierImpl.

\- \*\*pres\*\* : Classes de test pour les différentes méthodes d'injection.



\## Injections réalisées

\- \*\*Statique\*\* : Injection manuelle via le constructeur/setter.

\- \*\*Dynamique\*\* : Utilisation de la réflexion Java et d'un fichier `config.txt`.

\- \*\*Spring XML\*\* : Configuration via `config.xml`.

\- \*\*Spring Annotations\*\* : Utilisation de `@Component` et `@Autowired`.

