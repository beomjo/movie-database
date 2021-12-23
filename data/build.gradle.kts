plugins {
    `detekt-setting`
    `android-config`
    id("dagger.hilt.android.plugin")
}

dependencies {
    implementation(projects.domain)

    implementation(Dependency.Kotlin.COROUTINE_CORE)
    implementation(Dependency.Kotlin.COROUTINE_ANDROID)

    implementation(Dependency.Hilt.CORE)
    kapt(Dependency.Hilt.APT)

    implementation(Dependency.Google.GSON)

    implementation(Dependency.Retrofit.CORE)
    implementation(Dependency.Retrofit.CONVERT_GSON)

    implementation(Dependency.OkHttp.CORE)
    implementation(Dependency.OkHttp.CONNECTION)
    implementation(Dependency.OkHttp.LOGGING_INTERCEPTOR)

    testImplementation(TestDependency.KOTEST)
    testImplementation(TestDependency.MOCKK)
}