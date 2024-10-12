package eu.darken.sdmse.pro.common.upgrade

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import eu.darken.sdmse.pro.common.upgrade.core.UpgradeRepoGplay
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class UpgradeModule {
    @Binds
    @Singleton
    abstract fun control(gplay: UpgradeRepoGplay): UpgradeRepo

}
