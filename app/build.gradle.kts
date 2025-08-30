plugins {
    id("org.jetbrains.kotlin.jvm")
    application
}

repositories {
    mavenCentral()
}

val junitVersion: String by project
val jvmTargetValue = providers.gradleProperty("jvmTarget").get()
val junitPlatformVersion: String by project

kotlin {
    // Align Kotlin compiler toolchain with desired JVM target to avoid mismatches with system JDK
    jvmToolchain(jvmTargetValue.toInt())
    // Configure Kotlin compiler options using the new compilerOptions API (replaces deprecated kotlinOptions)
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.fromTarget(jvmTargetValue))
    }
}

java {
    // Ensure Java tasks (e.g., compileJava) use the same JVM version as Kotlin
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(jvmTargetValue.toInt()))
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
    // Explicit launcher to avoid Gradle's deprecated auto-loading behavior
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:$junitPlatformVersion")
}


application {
    // For Kotlin top-level main in Main.kt, Gradle uses MainKt as the class name
    mainClass.set("org.example.MainKt")
}
