enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("deps") {
            from(files("deps.version.toml"))
        }
    }
}

rootProject.name = "MovieDatabase"
include(":app")
include(":domain")
include(":data")
include(":common")
include(":feature:home")
