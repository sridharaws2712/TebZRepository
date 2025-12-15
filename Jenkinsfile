pipeline {

    agent any

    stages {

        stage('Build') {

            steps {

                sh 'mvn clean package'   

            }

        }

        stage('Deploy to Tomcat') {

            steps {

                deploy adapters: [tomcat9(

                    credentialsId: 'TomcatServer',     

                    path: '/G2',                          

                    url: 'http://localhost:8080'     

                )],

                war: 'target/*.jar',                         

                contextPath: '/G2'                         

            }

        }

    }

}
