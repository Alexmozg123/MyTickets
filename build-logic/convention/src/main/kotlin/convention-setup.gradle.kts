plugins {
    id("com.android.library")
    kotlin("android")
}

kotlin {
    jvmToolchain(17)
}

android {
    compileSdk = 34
    defaultConfig.minSdk = 24
}