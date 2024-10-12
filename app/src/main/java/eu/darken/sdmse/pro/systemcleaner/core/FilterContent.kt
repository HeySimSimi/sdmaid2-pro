package eu.darken.sdmse.pro.systemcleaner.core

import eu.darken.sdmse.pro.common.ca.CaDrawable
import eu.darken.sdmse.pro.common.ca.CaString
import eu.darken.sdmse.pro.systemcleaner.core.filter.FilterIdentifier
import eu.darken.sdmse.pro.systemcleaner.core.filter.SystemCleanerFilter

data class FilterContent(
    val identifier: FilterIdentifier,
    val icon: CaDrawable,
    val label: CaString,
    val description: CaString,
    val items: Collection<SystemCleanerFilter.Match>
) {
    val size: Long
        get() = items.sumOf { it.lookup.size }
}
