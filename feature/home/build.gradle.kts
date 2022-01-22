plugins {
    `detekt-setting`
    `android-config`
    id("dagger.hilt.android.plugin")
}

android {
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = COMPOSE_VERSION
    }
}

dependencies {
    implementation(projects.app)

    implementation(libs.dagger.hilt)
    kapt(libs.dagger.hiltApt)
}