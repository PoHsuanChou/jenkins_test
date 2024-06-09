pipeline {
    agent any

    stages{
        stage('Helo'){
            steps{
                echo "Hello"
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
