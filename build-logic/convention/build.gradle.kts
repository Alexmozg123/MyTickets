plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    mavenLocal()
    google()
}

dependencies {
    implementation(libs.plugin.kotlin)
    implementation(libs.plugin.android)
    implementation(libs.plugin.serialization)
}

kotlin {
    sourceSets.getByName("main").kotlin.srcDir("build-logic/src/main/kotlin")
}