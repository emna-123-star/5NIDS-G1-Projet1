node {
  stage('SCM') {
    checkout scm
  }

  stage('Maven Clean and Compile') {
    def mvn = tool 'dev'
    sh "${mvn}/bin/mvn clean compile"
  }

  stage('Nexus Deployment') {
    def mvn = tool 'dev'
    sh "${mvn}/bin/mvn deploy -DskipTests"
  }

  stage('SonarQube Analysis') {
    def mvn = tool 'dev'
    withSonarQubeEnv() {
      sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=devops -Dsonar.projectName='devops'"
    }
  }
}


