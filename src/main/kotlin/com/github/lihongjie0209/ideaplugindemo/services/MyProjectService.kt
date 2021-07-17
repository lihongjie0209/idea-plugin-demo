package com.github.lihongjie0209.ideaplugindemo.services

import com.github.lihongjie0209.ideaplugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
