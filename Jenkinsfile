pipeline {
    stages {
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
               always {
                   gamekins jacocoCSVPath: '**/target/site/jacoco/', jacocoResultsPath: '**/target/site/jacoco/jacoco.csv', searchCommitCount: 50
               }
            }
        }
    }
}