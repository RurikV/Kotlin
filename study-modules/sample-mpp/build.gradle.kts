plugins {
    kotlin("multiplatform")
}

group = "top.ajasta.study"
version = "0.1.0"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)

    jvm {
        withJava()
    }
    sourceSets {
        named("commonTest") {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        named("jvmTest") {
            dependencies {
                implementation(libs.junit.jupiter.api)
                runtimeOnly(libs.junit.jupiter.engine)
            }
        }
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}
