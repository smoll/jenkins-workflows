node('docker') {
    docker.image('tutum/hello-world').withRun('-p 8181:80') {c ->
        sh "sleep 3"
        sh "curl http://localhost:8181/"
    }
}
