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
stage('JaCoCo Report') {
steps {
jacoco()
}
}
}
}
