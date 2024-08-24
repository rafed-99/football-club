pipeline{
        agent any
                stages{
                        stage("check github"){
                                                steps{
                                                        git branch: "master",
                                                        url: "https://github.com/rafed-99/football-club.git"
                                                }
                        }
                        stage("clean and package"){
                                                    steps{
                                                            sh 'mvn clean'
                                                            sh 'mvn package'
                                                    }
                        }
                }

}