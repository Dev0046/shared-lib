 def call() {
    sh 'ansible-playbook -i inventory sonar.yaml'
 }