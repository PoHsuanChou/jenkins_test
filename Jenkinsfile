@Library('shared-library') _
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script {
                    echo "Hello"
                    greetExecutor('Ithome')  // 調用共享庫中的函數
                }
            }
        }
    }
}