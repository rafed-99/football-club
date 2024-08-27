pipeline{
        agent any
                stages{
                        stage("check github"){
                                                steps{
                                                        git branch: "master",
                                                        url: "https://github.com/rafed-99/football-club.git"
                                                }
                        }
                        stage("clean + package"){
                                                    steps{
                                                            sh 'mvn clean'
                                                            sh 'mvn package'
                                                    }
                        }
                }
}