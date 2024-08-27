pipeline {
    agent {
        docker {
            image 'maven:3.8.7-eclipse-temurin-17'  // Use the appropriate Maven version and JDK version
            args '-v /root/.m2:/root/.m2'          // Optional: Mount local Maven repository to persist dependencies
        }
    }
    stages {
        stage('Check GitHub') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/rafed-99/football-club.git'
            }
        }
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}