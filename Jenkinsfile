pipeline {
environment {
    registry = "rafed99/club-app"
    registryCredential = 'f03f3a82-448f-4ab2-89f8-01090e135fde'
    dockerImage = ''
  }
    agent any

    stages {
        stage("Check GitHub") {
            steps {
                git branch: "master",
                url: "https://github.com/rafed-99/football-club.git"
            }
        }
        stage("Clean and Package") {
            steps {
                script {
                    def mvn = docker.image('maven:3.8.1-amazoncorretto-17.0.6')
                    mvn.inside {
                        sh 'mvn clean package'
                    }
                }
            }
        }
    }
}
