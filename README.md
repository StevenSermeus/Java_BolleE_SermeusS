# Java - Gestion de tournois
## Remise pour le 23 mai

commandes docker si Modif

		docker container rm projet
		docker image rm projet
		docker build -t projet .
		docker run --name projet -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d projet
		
sinon

		docker start projet
		docker stop projet

First start 

		docker build -t projet .
		docker run --name projet -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d projet
