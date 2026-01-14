def call(String containerName = 'notes-app') {
    sh """
    docker rm -f ${containerName} || true
    docker compose up -d
    """
}
