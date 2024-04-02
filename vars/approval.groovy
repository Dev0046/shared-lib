stage('Approval') {
   steps {
     script {
        input message: 'Approve deployment?', ok: 'Approve'
     }
   }
}
