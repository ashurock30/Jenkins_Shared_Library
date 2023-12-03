def call(){
    withMaven(globalMavenSettingsConfig: '', jdk: 'JDK11', maven: 'Maven-3.9.5', mavenSettingsConfig: '', traceability: true) {
        sh 'mvn clean install'
    }
}