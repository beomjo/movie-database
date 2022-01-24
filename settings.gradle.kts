enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("VERSION_CATALOGS")

rootProject.name = "MovieDatabase"
include(":app")
include(":domain")
include(":data")
include(":common")
include(":feature:home")
include(":feature:search")
