plugins {
    kotlin
    `detekt-setting`
}

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    implementation(Dependency.Kotlin.COROUTINE_CORE)
    implementation(Dependency.Kotlin.COROUTINE_ANDROID)
    implementation(Dependency.Kotlin.REFLECTION)

    testImplementation(TestDependency.KOTEST)
    testImplementation(TestDependency.MOCKK)
    testImplementation(TestDependency.MOCKK_AGENT_JVM)
}