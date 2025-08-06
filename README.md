# Projet SOAP Java - Gestion des Secteurs et Classes

## Description

Ce projet est une API SOAP développée en Java avec Hibernate et JAX-WS.  
Il permet de gérer les entités **Sector** et **Classe** via des services web SOAP.  
La persistance est assurée avec Hibernate et une base de données relationnelle.

---

## Fonctionnalités

- CRUD (Create, Read, Update, Delete) pour Sector et Classe  
- Gestion des transactions Hibernate  
- Services exposés en SOAP avec JAX-WS

---

## Prérequis

- Java 17
- Maven pour la gestion des dépendances  
- Serveur d’application (Tomcat)  
- Base de données configurée (MySQL)  
- Hibernate

---

## Installation et Lancement

1. Cloner le dépôt  
2. Configurer la base de données dans `database.properties`  
3. Construire le projet :  
   ```bash
   mvn clean install

  ## demarage du projet 
  
  <img width="916" height="496" alt="image" src="https://github.com/user-attachments/assets/606f13b3-73fd-41a9-b002-7e9625d07ff8" />

  ## Interface Chrome avec les liens
  
  <img width="437" height="94" alt="image" src="https://github.com/user-attachments/assets/733bbc38-e6b0-41b3-89d4-a1424a8632c4" />

  ## Endpoint Sector wsdl
  
  <img width="938" height="470" alt="image" src="https://github.com/user-attachments/assets/55c2ed08-a7da-4e38-90fa-e21ab0a39d38" />

## Endpoint classe wsdl

<img width="937" height="482" alt="image" src="https://github.com/user-attachments/assets/bd5a8d4f-6543-41c8-8450-ed9000ed1f40" />

## Teste avec l'outil SOAPUI

<img width="212" height="353" alt="image" src="https://github.com/user-attachments/assets/1d4407c5-ee5b-4874-a5c1-87ab58f35274" />

ici nous avons les deux endpoints sector et classe

## Test Sector

<img width="908" height="416" alt="image" src="https://github.com/user-attachments/assets/4f3d63df-5eb6-4255-960a-47102e5cdc4a" />

On peut le verifier dans la BD

<img width="605" height="275" alt="image" src="https://github.com/user-attachments/assets/123c041a-824e-43f3-aaa9-a6a1521a3f44" />

## Test Classe 
C'est le meme proceder dans SOAPUI

<img width="894" height="365" alt="image" src="https://github.com/user-attachments/assets/9b3af08d-7970-4b1d-b4b8-8730f991ad65" />

La BD

<img width="503" height="240" alt="image" src="https://github.com/user-attachments/assets/932ed628-b9a0-4416-8498-b48c71e59122" />








