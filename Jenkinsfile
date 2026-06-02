pipeline {

    agent any

    tools {

        jdk 'JDK21'
        maven 'Maven3'

    }

    stages {

        stage('Checkout') {

            steps {

                checkout scm

            }

        }

        stage('Build Project') {

            steps {

                bat 'mvn clean install'

            }

        }

        stage('Run API Tests') {

            steps {

                bat 'mvn test'

            }

        }

    }

}