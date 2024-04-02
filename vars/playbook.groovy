 def call() {
    sh 'ansible-playbook -i /var/lib/jenkins/inventory  /var/lib/jenkins/sonar.yaml'
 }