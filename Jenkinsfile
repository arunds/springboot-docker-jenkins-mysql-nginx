#!groovy

properties([pipelineTriggers([pollSCM('H/10 * * * *')])])

node() {
    stage('Checkout'){
        checkout scm
    }
    stage ('build'){
     dir('springboot-data-docker-mysql-app') {
       sh 'mvn clean install'
     }
    
    }

    stage ('build & push containers'){
        withDockerRegistry(credentialsId: 'dockerHub', url: 'https://index.docker.io/v1/') {
            sh 'docker tag arunds/springboot-data-docker-mysql-app:0.0.1-SNAPSHOT  arunds/springboot-data-docker-mysql-app'
            sh 'docker push arunds/springboot-data-docker-mysql-app'			
			sh 'docker-compose up --force-recreate'
        }

    }

}