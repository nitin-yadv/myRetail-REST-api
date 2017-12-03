pipeline {
    agent any
    tools { 
        maven 'localMaven' 
        jdk 'localJDK' 
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }

        stage ('Build stage') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage ('Deploy') {
            steps {
                sh "cp -i $WORKSPACE/target/*.jar /Users/nitin/DevOps/apache-tomcat7/webapps"
                echo "copied the build to tomcat localhost"
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}