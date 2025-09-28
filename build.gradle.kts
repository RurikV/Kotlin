// Root composite build does not contain an application module.
// Provide a convenience `run` task so that `./gradlew run` does not fail.
// It prints guidance on how to run tasks in included builds.

tasks.register("run") {
    group = "application"
    description = "Shows how to run tasks in included builds of this composite project."
    doLast {
        println(
            """
            This repository is a Gradle composite build (root: kotlin-composite).
            There is no single runnable application at the root, so this `run` task prints guidance.

            To work with included builds:
            - Build all: ./gradlew build
            - Run tests in project-modules/core-jvm: ./gradlew :project-modules:core-jvm:test
            - Run tests in study-modules/utils-jvm: ./gradlew :study-modules:utils-jvm:test
            - Run JVM tests of MPP sample: ./gradlew :study-modules:sample-mpp:jvmTest

            Tip: Use `./gradlew tasks` to see available tasks.
            """.trimIndent()
        )
    }
}
