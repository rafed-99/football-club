pipeline {
    agent {
        docker {
            image 'maven:3.8.1-amazoncorretto-17.0.6'
            args '-v /root/.m2:/root/.m2'  // Optional: Mounting the local Maven repository
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
