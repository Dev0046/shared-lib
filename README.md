# Assignment-06
"Create a ansible shared library in jenkins for your tool with following steps:
- clone
- User Approval
- Plabook Execuion
- Notificaion
Required inputs for the shared library should be passed via confguraion file
eg:
SLACK_CHANNEL_NAME  = build-status
ENVIRONMENT         = prod
CODE_BASE_PATH      = env/prod
ACTION_MESSAGE      = <channel message>
KEEP_APPROVAL_STAGE = true"

# solution

      I made the shared-lib in which i write a function and call via pipeline,also i configured the shared library in the manage jenkins,also made the config file attached are the snips


