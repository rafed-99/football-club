pipeline {
     agent {
            docker {
                 image 'maven:3.8.7-eclipse-temurin-17'
                 args '-v /var/run/docker.sock:/var/run/docker.sock'
            }
        }
     environment {
             // Define the path to Docker Compose explicitly if needed
             DOCKER_COMPOSE_PATH = "/usr/local/bin/docker-compose"
         }
    stages {
        stage('Check GitHub') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/rafed-99/football-club.git'
            }
        }
        stage('Build Docker Image') {
                    steps {
                        // Build your app's Docker image using Docker Compose
                        script {
                            // Use Docker Compose to build the application
                            sh "${DOCKER_COMPOSE_PATH} -f docker-compose.yml up -d --build"
                        }
                    }
                }

                stage('Run Application') {
                    steps {
                        // Use Docker Compose to run the application
                        script {
                            // Start the services defined in the docker-compose.yml file
                            sh "${DOCKER_COMPOSE_PATH} -f docker-compose.yml up -d"
                        }
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