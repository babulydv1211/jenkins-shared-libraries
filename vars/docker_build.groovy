def call(String projectName, String imageTag, String dockerUser) {
    sh "docker build -t ${dockerUser}/${projectName}:${imageTag} ."
}

