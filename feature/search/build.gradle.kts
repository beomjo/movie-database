plugins {
    id("com.android.library")
    `detekt-setting`
    `android-config`
    id("dagger.hilt.android.plugin")
}

android {
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.get()
    }
}

dependencies {
    implementation(projects.domain)
    implementation(projects.data)
    implementation(projects.common)
    implementation(projects.navigation)

    implementation(libs.dagger.hilt)
    kapt(libs.dagger.hiltApt)
}