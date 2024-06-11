@Library('shared-library@dev-456') _
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                script {
                    echo "Hello"
                    test('Ithome')  // 調用共享庫中的函數
                }
            }
        }
    }
}
