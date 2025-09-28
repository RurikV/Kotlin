plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    // Configure JVM toolchain at the extension scope for all JVM targets
    jvmToolchain(17)

    jvm {
        withJava()
    }
    // You can add more targets later (js, native, etc.)
    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting {
            dependencies {
                implementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
                runtimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
            }
        }
    }
}

// Ensure JUnit 5 on JVM tests
tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
