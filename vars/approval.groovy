// ApprovalStage.groovy

def call() {
    stage('Approval') {
        steps {
            script {
                dir('shared-lib') {
                    def approval = input message: "Approve Deployment?", ok: "Proceed", submitterParameter: "APPROVAL", abort: "Abort"
                    if (approval == 'Abort') {
                        error 'Pipeline aborted as deployment was not approved..'
                    }
                }
            }
        }
    }
}
