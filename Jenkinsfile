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
bat 'mvn clean package' // This is for windows
 //sh 'mvn clean package' this is for linux
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
 bat 'docker login -u username -p password'
bat 'docker push shubhamhule/test'
}
}
}
}
