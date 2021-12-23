plugins {
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