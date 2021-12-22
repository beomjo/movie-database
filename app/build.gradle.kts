plugins {
    android
    `kotlin-android`
    `kotlin-kapt`
    `detekt-setting`
    id("dagger.hilt.android.plugin")

    // Precompiled plugin with the base android configuration.
    // Declared in buildSrc/.../android-config.gradle.kts.
    `android-config`
}

android {
    defaultConfig {
        applicationId = Environment.APPLICATION_ID
        vectorDrawables.useSupportLibrary = true
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = COMPOSE_VERSION
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":common"))

    implementation(Dependency.Kotlin.SDK)
    implementation(Dependency.Kotlin.COROUTINE_CORE)
    implementation(Dependency.Kotlin.COROUTINE_ANDROID)

    implementation(Dependency.AndroidX.APP_COMPAT)
    implementation(Dependency.AndroidX.COMPOSE_UI)
    implementation(Dependency.AndroidX.COMPOSE_UI_PREVIEW)
    implementation(Dependency.AndroidX.COMPOSE_MATERIAL)
    implementation(Dependency.AndroidX.COMPOSE_ACTIVITY)

    implementation(Dependency.KTX.CORE)
    implementation(Dependency.KTX.LIFECYCLE_LIVEDATA)
    implementation(Dependency.KTX.LIFECYCLE_VIEWMODEL)
    implementation(Dependency.KTX.ACTIVITY)
    implementation(Dependency.KTX.FRAGMENT)

    implementation(Dependency.Google.MATERIAL)
    implementation(Dependency.Google.GSON)

    implementation(Dependency.Hilt.CORE)
    kapt(Dependency.Hilt.APT)

    testImplementation(TestDependency.MOCKK)
    testImplementation(TestDependency.COROUTINE_TEST)
    testImplementation(TestDependency.KOTEST)
    debugImplementation(TestDependency.COMPOSE_UI_TOOLING)
    androidTestImplementation(AndroidTestDependency.TEST_RUNNER)
    androidTestImplementation(AndroidTestDependency.ESPRESSO_CORE)
}