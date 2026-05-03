def call(Map config) {
    pipeline {
        agent any
        stages {
            stage('Print Info') {
                steps {
                    echo "Runninggggggggggggggggggggg in ${config.env} environment"
                }
            }
        }
    }
}
