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
                    script {
                        def rootDir = pwd()
                        def T01 = load "${rootDir}/TestRunner.Groovy"
                        //def T01 = load "TestRunner.groovy"
                        println ('1 About to call T01.Test01Runner()!!! ')
                        T01.Test01Runner()
                    }
                }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying.....'
            }
        }
    }
}