pluginManagement {
    // Make local convention plugins from build-logic available to all builds via pluginManagement
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        val kotlinVersion: String by settings
        id("org.jetbrains.kotlin.jvm") version kotlinVersion
        id("application") // no version needed
    }
}

// Composite build: include standalone builds as in 202508-ok-marketplace
includeBuild("project-modules")
includeBuild("study-modules")

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "Kotlin"
include(":app")
