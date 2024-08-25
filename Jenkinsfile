pipeline {
    environment {
        registry = "rafed99/club-app" // Docker image name
        registryCredential = 'f03f3a82-448f-4ab2-89f8-01090e135fde' // Docker registry credentials ID
        dockerImage = '' // This will be set dynamically later
        _JAVA_OPTIONS = "-Dorg.jenkinsci.plugins.durabletask.BourneShellScript.LAUNCH_DIAGNOSTICS=true"
        PATH = '${env.PATH}:/usr/local/bin'
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
        stage('Example') {
                    steps {
                        sh 'echo "Running shell script"'
                        sh 'docker-compose --version' // Example command
                    }
                }
//         stage("Package") {
//                     steps {
//                         sh 'docker-compose -f docker-compose.yml up -d'
//                         sh 'mvn clean package'
//                     }
//                 }
    }
}
