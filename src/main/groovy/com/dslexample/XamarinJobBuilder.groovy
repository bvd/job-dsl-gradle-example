package com.dslexample

import javaposse.jobdsl.dsl.DslFactory
import javaposse.jobdsl.dsl.Job

/**
 * Example Class for creating a Gradle build
 */
class XamarinJobBuilder {

    String gitUrl
    String projectName
    ArrayList<LinkedHashMap<String, String>> environments

    void build(DslFactory dslFactory) {

        println "git url is " + gitUrl
        println "projectname is " + projectName

        def basePath = "CCM${projectName.toUpperCase()}"

        println "basepath is $basePath"


        // Create base folder for the project
        dslFactory.folder(basePath) {
            displayName("${projectName.toUpperCase()}")
            description("Folder voor project ${projectName}")
        }

        // Create subfolders for the different components in this project
        dslFactory.folder "${basePath}/App"

        println "environment count is ${environments.size()}"

        /*
        dslFactory.job(name) {
            it.description this.description
            logRotator {
                numToKeep 5
            }
            scm {
                github this.ownerAndProject, gitBranch
            }
            triggers {
                scm pollScmSchedule
            }
            steps {
                gradle tasks, switches, useWrapper
            }
            publishers {
                archiveArtifacts artifacts
                archiveJunit junitResults
                if (emails) {
                    mailer emails.join(' ')
                }
            }
        }
        */
    }
}
