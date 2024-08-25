pipeline {
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
                    docker.image('maven:3.8.1-amazoncorretto-17.0.6').inside {
                        sh 'mvn clean package'
                    }
                }
            }
        }
    }
}
