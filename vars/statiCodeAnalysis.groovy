def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId, installationName:'SonarQube') {
        withMaven(globalMavenSettingsConfig: '', jdk: 'JDK11', maven: 'Maven-3.9.5', mavenSettingsConfig: '', traceability: true) { 
            sh 'mvn clean package sonar:sonar -Dsonar.projectKey=org.springframework.boot:spring-boot-starter-parent -Dsonar.projectName="Sonar-Docker-Test-App"' 
        }
    }
}