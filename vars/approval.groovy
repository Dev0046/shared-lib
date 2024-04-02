// UserApproval.groovy
def call(String message = 'Approve deployment?', String ok = 'Approve') {
    try {
        input message: message, ok: ok
        return true
    } catch (Exception e) {
        return false
    }
}
