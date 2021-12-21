plugins {
    android
    `kotlin-android`
    `kotlin-kapt`
    `detekt-setting`
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Environment.ANDROID_COMPILE
    buildToolsVersion = Environment.BUILD_TOOL

    defaultConfig {
        applicationId = Environment.APPLICATION_ID
        minSdk = Environment.ANDROID_MIN
        targetSdk = Environment.ANDROID_TARGET
        vectorDrawables.useSupportLibrary = true
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

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.5"
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

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":app"))
}