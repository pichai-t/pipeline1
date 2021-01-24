pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'

                def rootDir = pwd()
                def T01 = load "${rootDir}/TestRunner.Groovy"
                T01.Test01Runner()

            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying.....'
            }
        }
    }
}