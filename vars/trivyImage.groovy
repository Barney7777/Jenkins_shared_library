def call() {
    sh 'trivy image barneywang/youtube:latest > trivyimage.txt'
}