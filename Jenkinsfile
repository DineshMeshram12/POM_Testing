
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/DineshMeshram12/POM_Testing.git'

                echo 'GitHub repository cloned successfully!'
            }
        }
    }
}
