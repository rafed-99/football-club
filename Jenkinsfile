// pipeline {
//      agent {
//             docker {
//                  image 'maven:3.8.7-eclipse-temurin-17'
//                  args '-v /var/run/docker.sock:/var/run/docker.sock'
//             }
//      }
// // docker {
// //             image 'neww'
// //             args '-v /var/run/docker.sock:/var/run/docker.sock'
// //         }
// //         }
// //         environment {
// //                 registry  = 'rafed99/neww'
// //                 registryCredential = 'dckr_pat_WjGMG0d4YilRuXllJlHnEwcJfDA'
// //                 dockerImage = ''
// //             }
//     stages {
//         stage('Check GitHub') {
//             steps {
//                 git branch: 'master',
//                     url: 'https://github.com/rafed-99/football-club.git'
//             }
//         }
// // stage('Login') {
// //             steps {
// //                 script {
// //                     // Login to Docker registry
// //                     docker.withRegistry(registry , registryCredential) {
// //                         echo 'Logged in to Docker registry'
// //                         // Place your Docker commands here
// //                     }
// //                 }
// //             }
// //         stage('Debug') {
// //                     steps {
// //                                     script {
// //                                         // Print out PATH and check Docker Compose location
// //                                         sh 'echo "PATH: $PATH"'
// //                                         sh 'ls -l /usr/local/bin/docker-compose || echo "docker-compose not found in /usr/local/bin"'
// //                                         sh 'ls -l /usr/bin/docker-compose || echo "docker-compose not found in /usr/bin"'
// //                                         sh '/usr/local/bin/docker-compose --version || echo "docker-compose not executable"'
// //                                     }
// //                                 }
// //                 }
// //                 stage('Build and Run') {
// //                             steps {
// //                                 script {
// //                                     sh '/usr/local/bin/docker-compose -f docker-compose.yml up -d --build'
// //                                 }
// //                             }
// //                         }
// //         stage('Build and Run') {
// //                     steps {
// //                         script {
// //                             // Use explicit path to Docker Compose
// //                             sh '/usr/local/bin/docker-compose -f docker-compose.yml up -d --build'
// //                         }
// //                     }
// //                 }
// //         stage('Docker compose up'){
// //             steps{
// //                 sh 'docker compose up -d'
// //             }
// //         }
//         stage('Clean') {
//             steps {
//                 sh 'mvn clean'
//             }
//         }
// //         stage('Package') {
// //             steps {
// //                 sh 'docker-compose up -d --build'
// //                 sh 'mvn package'
// //             }
// //         }
//     }
// }
pipeline {
    agent {
        docker {
            image 'maven:3.8.7-eclipse-temurin-17'
            args '--add-host=host.docker.internal:host-gateway'
        }
    }
    stages {
        stage('Check GitHub') {
            steps {
                git branch: 'master', url: 'https://github.com/rafed-99/football-club.git'
            }
        }
        stage('Build and Run') {
            steps {
                script {
                    sh 'docker compose up -d --build'
                }
            }
        }
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
    }
}