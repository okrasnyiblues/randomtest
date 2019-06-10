pipelineJob("newhob") {
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            name('origin')
                            url("git@github.com:okrasnyiblues/randomtest.git")
                            credentials('okrasnyiblues')
                        }
                    }
                }
                scriptPath("jenkins/jobs/test.jenkinsfile")
            }
        }
        environmentVariables {
            env("AWS_REGION", 'eu-west-1')
            env("AWS_ROLE", "cloudformation-cicd")
            env("AWS_ROLE_ACCOUNT", "975631993232")

        }
}
