package ru.bortsov.mytickets

import PlatformConfiguration
import coreModule
import di.Inject
import org.koin.dsl.koinApplication
import org.koin.dsl.module

object PlatformSDK {
    fun init(
        configuration: PlatformConfiguration
    ) {
        val umbrellaModule = module {
            single<PlatformConfiguration> { configuration }
        }

        Inject.createDependencies(
            koinApplication {
                modules(
                    coreModule,
                    umbrellaModule,
                )
            }.koin
        )
    }
}