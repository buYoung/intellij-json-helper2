package com.livteam.jsoninja.listeners

import com.intellij.ide.plugins.DynamicPluginListener
import com.intellij.openapi.application.ApplicationActivationListener
import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.wm.IdeFrame

internal class JsonHelperActivationListener : ApplicationActivationListener, DynamicPluginListener {

    override fun applicationActivated(ideFrame: IdeFrame) {
        thisLogger().warn("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
