rootProject.name = "kotlin-composite"

// Include composite builds
includeBuild("build-logic")
includeBuild("study-modules")
includeBuild("project-modules")

// Include local subprojects
include("app")
