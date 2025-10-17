# Kotlin

Training project: Gradle (Kotlin DSL) + Kotlin

Contents:
- Root Gradle project using Kotlin DSL
- Subproject app (Kotlin/JVM) with a Hello World application
- Minimal auto-test with JUnit 5
- Centralized library versions in gradle.properties
- Proper .gitignore

Assignment requirements (m1-init):
- Create a project on GitHub and open a PR from the m1-init branch
- Root Gradle project with Kotlin DSL, Kotlin subproject
- Library/plugin versions defined in gradle.properties
- .gitignore without junk files (.idea, .gradle, build, etc.)

Project structure:
- settings.gradle.kts — root project name and include(":app")
- build.gradle.kts — shared repositories and test configuration
- gradle.properties — kotlinVersion, junitVersion, jvmTarget
- app/build.gradle.kts — Kotlin/JVM and application plugins, JUnit 5 dependencies
- app/src/main/kotlin/org/example/Main.kt — greet() and main()
- app/src/test/kotlin/org/example/MainTest.kt — minimal test

How to build and run:
- Build: ./gradlew build
- Run the application: ./gradlew :app:run
- Run tests: ./gradlew test

Notes:
- Plugin/library versions are centralized in gradle.properties
- Kotlin and application plugins are declared via pluginManagement in settings.gradle.kts