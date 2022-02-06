import Environment.REST_KEY
import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.application")
    `detekt-setting`
    `android-config`
    id("dagger.hilt.android.plugin")
}

val restKey: String? = gradleLocalProperties(rootDir).getProperty(REST_KEY)

android {
    defaultConfig {
        applicationId = Environment.APPLICATION_ID
        vectorDrawables.useSupportLibrary = true

        buildConfigField("String", REST_KEY, "\"$restKey\"")
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
    implementation(projects.feature.home)
    implementation(projects.feature.search)
    implementation(projects.feature.people)
    implementation(projects.feature.mypage)

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