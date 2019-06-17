# springboot-docker-jenkins-mysql-nginx
springboot docker jenkins mysql nginx

## Build & Run the spring boot application
springboot-docker-jenkins-mysql-nginx\springboot-data-docker-mysql-app> mvn install dockerfile:build
springboot-docker-jenkins-mysql-nginx\springboot-data-docker-mysql-app> mvn dockerfile:push
springboot-docker-jenkins-mysql-nginx> docker-compose up

## After staring the application you can acccess the application in the below URL
http://192.168.99.100:8080/

![Welcome Screen](screenshots/hello.PNG?raw=true "Welcome Screen")

## Run the Jenkkins Docker Instance
cd springboot-docker-jenkins-mysql-nginx/jenkins
springboot-docker-jenkins-mysql-nginx/jenkins> docker-compose up

Access the Jenkins in the following URL
http://192.168.99.100:8085/

![Jenkins Login](screenshots/jenkins.PNG?raw=true "Jenkins Home Screen")
