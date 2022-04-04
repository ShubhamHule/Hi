pipeline {
agent any

 stages {
stage('Check out') {
steps {
echo 'Checking out'
}
}
stage('Package') {
steps {
bat 'mvn clean package'
}
}
stage('JaCoCo Report') {
steps {
jacoco()
}
}
}
}
