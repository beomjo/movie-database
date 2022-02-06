import Environment.REST_KEY
import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.library")
    `detekt-setting`
    `android-config`
    id("dagger.hilt.android.plugin")
}
val restKey: String? = gradleLocalProperties(rootDir)
    .getProperty(REST_KEY)

android {
    defaultConfig {
        buildConfigField("String", REST_KEY, "\"$restKey\"")
    }
}

dependencies {
    implementation(projects.domain)

    implementation(libs.bundles.coroutine)

    implementation(libs.bundles.google)
    implementation(libs.bundles.retrofit)
    implementation(libs.bundles.retrofit)

    implementation(libs.dagger.hilt)
    kapt(libs.dagger.hiltApt)

    implementation(libs.bundles.okhttp3)

    testImplementation(libs.bundles.test)
}