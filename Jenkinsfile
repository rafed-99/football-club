pipeline {
    environment {
        registry = "rafed99/club-app" // Docker image name
        registryCredential = 'f03f3a82-448f-4ab2-89f8-01090e135fde' // Docker registry credentials ID
        dockerImage = '' // This will be set dynamically later
        DOCKER_COMPOSE_FILE = 'docker-compose.yml'
    }
    tools {
            maven 'Maven 3.8.1' // Make sure this matches the Maven installation name in Jenkins
        }
    agent any

    stages {
        stage("Check GitHub") {
            steps {
                git branch: "master", url: "https://github.com/rafed-99/football-club.git"
            }
        }
        stage('Check Docker Compose') {
                    steps {
                        sh 'docker-compose --version'
                    }
        }
        stage("Clean") {
            steps {
                sh 'mvn clean'
            }
        }
        stage("Package") {
                    steps {
                        sh 'docker-compose -f ${DOCKER_COMPOSE_FILE} up -d'
                        sh 'mvn package'
                    }
                }
    }
}
