package com.github.nguyenquan9699.customtemplateplugin.services

import com.github.nguyenquan9699.customtemplateplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
