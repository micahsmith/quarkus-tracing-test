// settings.gradle.kts
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") { from(files("libs.versions.toml")) }
    }
}
rootProject.name = "quarkus-tracing-test"
include(":api", ":shell")
