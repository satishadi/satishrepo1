

pipeline {
    agent any
    
    stages {
        stage('Continuous Download_child1') {
            steps {
                // Checkout the code from the repository
                git 'https://github.com/satishadi/satishrepo1.git'
            }
        }
        stage('Continuous Build_child1') {
            steps {
                // Build the project using Maven
                sh 'mvn package'
            }
        }
    }
}


