import Environment.REST_KEY
import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.application")
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
    implementation(projects.navigation)
    implementation(projects.feature.home)
    implementation(projects.feature.search)
    implementation(projects.feature.people)
    implementation(projects.feature.mypage)

    implementation(libs.bundles.compose)
    debugImplementation(libs.compose.uitooling)

    implementation(libs.dagger.hilt)
    kapt(libs.dagger.hiltApt)

    testImplementation(libs.bundles.test)
    androidTestImplementation(libs.bundles.androidTest)
}