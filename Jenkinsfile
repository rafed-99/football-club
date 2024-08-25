pipeline {
    environment {
        registry = "rafed99/club-app" // Docker image name
        registryCredential = 'f03f3a82-448f-4ab2-89f8-01090e135fde' // Docker registry credentials ID
        dockerImage = '' // This will be set dynamically later
    }
    agent any

    stages {
        stage("Check GitHub") {
            steps {
                git branch: "master", url: "https://github.com/rafed-99/football-club.git"
            }
        }
        stage("Clean and Package") {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
