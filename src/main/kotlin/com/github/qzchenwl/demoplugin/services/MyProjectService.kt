package com.github.qzchenwl.demoplugin.services

import com.intellij.openapi.project.Project
import com.github.qzchenwl.demoplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
