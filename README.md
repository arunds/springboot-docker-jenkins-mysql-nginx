# springboot-docker-jenkins-mysql-nginx
springboot application with docker, jenkins, mysql and nginx

## Build & Run the spring boot application
springboot-docker-jenkins-mysql-nginx\springboot-data-docker-mysql-app> __mvn install dockerfile:build__  
springboot-docker-jenkins-mysql-nginx\springboot-data-docker-mysql-app> __mvn dockerfile:push__    
springboot-docker-jenkins-mysql-nginx> __docker-compose up__  

## After the container started we can acccess the application in the below URL  
IP Adress of the docker VM  
http://192.168.99.100:8080/

![Welcome Screen](screenshots/hello.PNG?raw=true "Welcome Screen")

## Run the Jenkkins Docker Instance
cd springboot-docker-jenkins-mysql-nginx/jenkins  
springboot-docker-jenkins-mysql-nginx/jenkins> __docker-compose up__ 

Access the Jenkins in the following URL  
http://192.168.99.100:8085/

![Jenkins Login](screenshots/jenkins.PNG?raw=true "Jenkins Home Screen")

## Jenkins Configuration
Once the jenkins instance started, need to configure below things
Create pipleline projectect using the github URL
Add github credentials in jenkins
Configure webhook to trigger automatic build

![Jenkins Job](screenshots/jenkins-job.PNG?raw=true "Jenkins Job Screen")
