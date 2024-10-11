package eu.darken.sdmse.pro.common.debug.autoreporting

import android.app.Application
import eu.darken.sdmse.pro.common.debug.AutomaticBugReporter
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FossAutoReporting @Inject constructor() : AutomaticBugReporter {
    override fun setup(application: Application) {
        // NOOP
    }

    override fun leaveBreadCrumb(crumb: String) {
        throw IllegalStateException("Who initliazed this? Without setup no calls to here!")
    }

    override fun notify(throwable: Throwable) {
        throw IllegalStateException("Who initliazed this? Without setup no calls to here!")
    }
}
