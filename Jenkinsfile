@Library('shared-library') _
pipeline {
    agent any

    stages{
        stage('Helo'){
            steps{
                echo "Hello"
                greetExecutor('Ithome')
            }
        }
        stage('cat README'){
	 when {
	  branch "fix-*"
	 }
         steps {
          sh '''
            cat README.md
          '''
         }
	}
    }
}
