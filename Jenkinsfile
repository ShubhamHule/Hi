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
  stage('Sonar Analysis') {
steps {
 withSonarQubeEnv('ZensarCodeAnalysis'){
 bat 'mvn sonar:sonar'
 }
}
  }
stage('JaCoCo Report') {
steps {
jacoco()
}
}
    stage('Build Docker Image') {
steps {
bat 'docker build -t shubhamhule/test .'
}
}
    stage('Push Docker Image To DockerHub') {
steps {
 bat 'docker login -u shubhamhule -p NarutoUzumaki@106'
bat 'docker push shubhamhule/test'
}
}
}
}
