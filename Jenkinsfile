def call(Map config) {
    pipeline {
        agent any
        
        stages {
            stage('Clone Repository') {
                steps {
                    echo "Cloning Repository..."
                    git 'https://github.com/Dev0046/shared-lib.git'
                }
            }
            
            stage('User Approval') {
                when {
                    expression { return config.KEEP_APPROVAL_STAGE }
                }
                steps {
                    script {
                        input(message: "Approve Deployment?", ok: "Deploy")
                    }
                }
            }
            
            stage('Playbook Execution') {
                steps {
                    echo "Executing Ansible Playbook..."
                    sh "ansible-playbook -i /var/lib/jenkins/workspace/Sonarqube_roles/inventory /var/lib/jenkins/workspace/Sonarqube_roles/sonar.yaml "
                }
            }
            
            stage('Notification') {
                steps {
                    echo "Sending Notification..."
                    // Here is where you'd send a message to Slack, requires Slack Notification plugin or a custom script.
                    slackSend(channel: config.SLACK_CHANNEL_NAME, message: config.ACTION_MESSAGE)
                }
            }
        }
    }
}
