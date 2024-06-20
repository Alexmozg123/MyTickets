plugins {
    id("convention-setup")
    alias(libs.plugins.serialization)
}

kotlin {
    dependencies {
        api(project(":feature:main:api"))
        implementation(project(":core"))
        implementation(libs.koin.di)
    }
}

android {
    namespace = "ru.bortsov.feature.main.data"
}