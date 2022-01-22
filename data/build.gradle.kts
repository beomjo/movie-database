plugins {
    `detekt-setting`
    `android-config`
    id("dagger.hilt.android.plugin")
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