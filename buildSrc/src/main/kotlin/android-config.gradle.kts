@file:Suppress("UnstableApiUsage")

import com.android.build.gradle.BaseExtension

fun android(configuration: BaseExtension.() -> Unit) = configure(configuration)

// Common configuration for all Android modules.
android {
    compileSdkVersion(Environment.ANDROID_COMPILE)
    buildToolsVersion = Environment.BUILD_TOOL

    defaultConfig {
        minSdk = Environment.ANDROID_MIN
        targetSdk = Environment.ANDROID_TARGET
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = TestDependency.ANDROID_JUNIT_RUNNER
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile(
                    "proguard-android-optimize.txt"
                ),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    testOptions {
        unitTests.all {
            it.useJUnitPlatform()
        }
    }
}