pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'gradle build'
            }
        }
        stage('Test') {
            steps {
                sh 'gradle test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
    post {
        success {
            echo 'Build and deployment successful!'
        }
        failure {
            echo 'Build and deployment failed!'
        }
    }
}