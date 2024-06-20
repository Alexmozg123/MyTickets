plugins {
    id("convention-setup")
}

kotlin {
    dependencies {
        implementation(project(":feature:main:api"))
        implementation(project(":core"))
//        implementation(libs.koin.di)
    }
}

android {
    namespace = "ru.bortsov.feature.main.presentation"
}