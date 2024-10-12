package eu.darken.sdmse.pro.systemcleaner.core

val SystemCleaner.Data?.hasData: Boolean
    get() = this?.filterContents?.isNotEmpty() ?: false
