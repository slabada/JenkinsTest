pipeline {
    agent any

    tools{
        maven "M3"
    }

    stages{
        stage('Compile'){
            steps{
                sh "mvn compile"
            }
        }
        stage('Test'){
            steps{
                sh "mvn test"
            }
        }
    }
}