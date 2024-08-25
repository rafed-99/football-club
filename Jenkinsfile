pipeline {
    agent {
        docker {
            image 'maven:latest'
        }
    }

    stages {
        stage("Check GitHub") {
            steps {
                git branch: "master",
                url: "https://github.com/rafed-99/football-club.git"
            }
        }
        stage("Clean and Package") {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
