plugins {
    id("convention-setup")
    alias(libs.plugins.serialization)
}

kotlin {
    dependencies {
        implementation(libs.kotlinx.serialization.core)
    }
}

android {
    namespace = "ru.bortsov.feature.main.api"
}