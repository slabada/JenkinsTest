pipeline {
    agent any

    tools{
        maven "M3"
    }

    stages{
        stage('Compile'){
            steps{
                sh "mvp compile"
            }
        }
        stage('Test'){
            steps{
                sh "mvp test"
            }
        }
    }
}