plugins {
    id("convention-setup")
    alias(libs.plugins.serialization)
}

kotlin {
    dependencies {
        api(libs.kotlinx.serialization.core)
        api(libs.kotlinx.coroutines)
//        api(libs.koin.di)
    }
}

android {
    namespace = "ru.bortsov.core"
}