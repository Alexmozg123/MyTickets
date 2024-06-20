plugins {
    alias(libs.plugins.android)
    alias(libs.plugins.kotlin)
}

kotlin {
    jvmToolchain(17)

    dependencies {
        implementation(libs.androidx.appcompat)
        implementation(libs.material)
        implementation(libs.androidx.activity)

        implementation(project(":core"))
        implementation(project(":feature:main:api"))
    }
}

android {
    namespace = "ru.bortsov.mytickets"

    compileSdk = 34
    defaultConfig {
        applicationId = "ru.bortsov.mytickets"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}
