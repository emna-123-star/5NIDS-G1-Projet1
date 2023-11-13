pipeline {
    agent any  // Utilisation de n'importe quel agent disponible pour exécuter le pipeline

    triggers {
        // Définition du déclencheur pour lancer le pipeline dès qu'un push est détecté dans le référentiel Git
        scm 'pollSCM: true'
    }

    stages {
        stage('Checkout') {
            steps {
                // Récupération du code source depuis le référentiel Git
                git url: 'https://url-de-votre-referentiel-git.git'
            }
        }

        stage('Display Date') {
            steps {
                // Affichage de la date système
                script {
                    def currentDate = sh(script: 'date', returnStdout: true).trim()
                    echo "La date système est : ${currentDate}"
                }
            }
        }
    }
}
