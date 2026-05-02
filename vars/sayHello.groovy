def call(Map config) {
    pipeline {
        agent any
        stages {
            stage('Print Info') {
                steps {
                    echo "Running in ${config.env} environment"
                }
            }
        }
    }
}
