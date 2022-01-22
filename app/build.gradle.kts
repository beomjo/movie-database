plugins {
    `detekt-setting`
    `android-config`
    id("dagger.hilt.android.plugin")
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
        kotlinCompilerExtensionVersion = libs.versions.compose.get()
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(projects.domain)
    implementation(projects.data)
    implementation(projects.common)

    implementation(libs.bundles.android)
    implementation(libs.bundles.coroutine)
    implementation(libs.bundles.compose)
    debugImplementation(libs.compose.uitooling)

    implementation(libs.bundles.google)

    implementation(libs.dagger.hilt)
    kapt(libs.dagger.hiltApt)

    testImplementation(libs.bundles.test)
    androidTestImplementation(libs.bundles.androidTest)
}