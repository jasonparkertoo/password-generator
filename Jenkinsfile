pipeline {
    agent any
    stages {
        stage('Test stage') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Compile stage') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Package stage') {
            steps {
                sh 'mvn package'
            }
        }
    }
}