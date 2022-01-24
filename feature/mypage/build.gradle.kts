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
    implementation(projects.app)

    implementation(libs.dagger.hilt)
    kapt(libs.dagger.hiltApt)
}