package com.dslexample

import javaposse.jobdsl.dsl.DslFactory
import javaposse.jobdsl.dsl.Folder

/**
 * Example Class for creating a Gradle build
 */
class CordovaJobBuilder {

    String name

    Folder build(DslFactory dslFactory) {
        dslFactory.folder(name) {
            description 'it is the ' + name + ' folder'
        }
    }
}
