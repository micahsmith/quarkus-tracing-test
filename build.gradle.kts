// build.gradle.kts
plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.plugin.allopen) apply false
    alias(libs.plugins.quarkus) apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}
