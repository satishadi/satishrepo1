

pipeline {
    agent any
    
    stages {
        stage('Continuous Download_master') {
            steps {
                // Checkout the code from the repository
                git 'https://github.com/satishadi/satishrepo1.git'
            }
        }
        stage('Continuous Build_master') {
            steps {
                // Build the project using Maven
                sh 'mvn package'
            }
        }
    }
}


