pipeline{
parameters {
            choice(name: 'JOB', choices: ['Test','Test2'], description: 'Please choose job')
    }

    agent{
    'any'
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

    success{
        emailext body : '$PROJECT_NAME - Build # $BUILD_NUMBER - SUCCESS!\r\rCheck console output at $BUILD_URL to view the results.' , subject: ''
    }
}