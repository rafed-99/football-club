pipeline {
     agent {
            docker {
                 image 'maven:3.8.7-eclipse-temurin-17'
                 args '-v /var/run/docker.sock:/var/run/docker.sock'
            }
        }
    stages {
        stage('Check GitHub') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/rafed-99/football-club.git'
            }
        }
//         stage('Docker compose up'){
//             steps{
//                 sh 'docker compose up -d'
//             }
//         }
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Package') {
            steps {
                sh 'docker-compose up -d --build'
                sh 'mvn package'
            }
        }
    }
}