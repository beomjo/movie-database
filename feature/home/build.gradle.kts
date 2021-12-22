plugins {
    android
    `kotlin-android`
    `kotlin-kapt`
    `detekt-setting`
    `android-config`
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
}