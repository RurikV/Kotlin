plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

// Ensure consistent toolchains for Kotlin and Java in build-logic to avoid target mismatches
kotlin {
    jvmToolchain(17)
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

// Precompiled script plugins are discovered from src/main/kotlin/*.gradle.kts
// and can use the version catalog defined in settings via the `libs` accessor.

dependencies {
    // Provide Kotlin Gradle plugin on the classpath for precompiled script plugins
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.21")
}
