plugins {
    kotlin
    `detekt-setting`
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    implementation(group = "javax.inject", name = "javax.inject", version = "1")
    implementation(libs.bundles.coroutine)
    implementation(libs.kotlin.reflection)
    testImplementation(libs.bundles.test)
}