package com.github.aj3douglas.ajdebugger.services

import com.github.aj3douglas.ajdebugger.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
