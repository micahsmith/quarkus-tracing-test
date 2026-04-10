// shell/build.gradle.kts
plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.plugin.allopen)
    alias(libs.plugins.quarkus)
}

dependencies {
    implementation(enforcedPlatform(libs.quarkus.bom))
    implementation(libs.quarkus.kotlin)
    implementation(libs.quarkus.arc)
    implementation(project(":api"))
    implementation(libs.quarkus.container.image.jib)
}

tasks.withType<io.quarkus.gradle.tasks.QuarkusDev>().configureEach {
    jvmArgs = jvmArgs + "-javaagent:${rootProject.file("dd-java-agent-1.60.3.jar")}"
}
