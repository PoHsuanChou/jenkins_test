// 範例 Jenkinsfile
pipeline {
    agent any // 不指定執行 agent
    stages { // 開始宣告 Pipeline 流程
        stage('ithome 2022 pipeline') {
            // 行為宣告
            steps {
                echo 'Hello Github ~'
            }
        }
    }
}
