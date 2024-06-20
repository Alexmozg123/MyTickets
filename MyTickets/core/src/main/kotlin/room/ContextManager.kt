package room

import PlatformConfiguration
import android.content.Context

internal class ContextManager(private val platformConfiguration: PlatformConfiguration) {
    fun getAppContext(): Context = platformConfiguration.context
}