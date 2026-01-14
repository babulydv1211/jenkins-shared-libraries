def call(String imageName, String dockerUser) {
    withCredentials([usernamePassword(
        credentialsId: 'dockerhubCred',
        usernameVariable: 'DOCKERHUB_USER',
        passwordVariable: 'DOCKERHUB_PASS'
    )]) {

        sh """
        docker login -u \$DOCKERHUB_USER -p \$DOCKERHUB_PASS
        docker tag ${imageName}:latest ${dockerUser}/${imageName}:latest
        docker push ${dockerUser}/${imageName}:latest
        """
    }
}
