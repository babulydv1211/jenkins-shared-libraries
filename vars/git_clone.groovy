def call(String url, String branch = 'main') {
    git url: url, branch: branch
    echo "Code cloned successfully"
}
