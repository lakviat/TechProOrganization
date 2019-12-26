pipeline {
         agent any
         stages {
                 stage('Clean') {
                 steps {
                     sh '@?dependency:copy-dependencies package'
                 }
                 }
                 stage('Build') {
                 steps {
                    sh 'sudo su root'
                 }
                 }
                 stage('Running Tests') {
                 when {
                       not {
                            branch "master"
                       }
                 }
                 steps {
                       echo "Hello"
                 }
                 }
                 stage('Extra Tests') {
                 parallel {
                            stage('Unit Test') {
                           steps {
                                echo "Running the unit test..."
                           }
                           }
                            stage('Integration test') {
                              agent {
                                    docker {
                                            reuseNode true
                                            image 'ubuntu'
                                           }
                                    }
                              steps {
                                echo "Running the integration test..."
                              }
                           }
                           }
                           }
              }
}