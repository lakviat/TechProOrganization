pipeline{
parameters {
            choice(name: 'JOB', choices: ['Test','Test2'], description: 'Please choose job')
    }

    stages {
        stage('Clean'){
        steps {
            sh 'mvn clean'
            }
        }

     stage {
            stage('Build'){
            steps {
                sh 'mvn test'
                }
            }
     stages {
              stage('Test'){
              steps {
                  sh 'mvn clean'
                    }
                }
            }
        }
    }
}