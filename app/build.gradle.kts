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
    implementation(Dependency.Kotlin.SDK)
    implementation(Dependency.Kotlin.COROUTINE_CORE)
    implementation(Dependency.Kotlin.COROUTINE_ANDROID)

    implementation(Dependency.AndroidX.APP_COMPAT)
    implementation(Dependency.AndroidX.COMPOSE_UI)
    implementation(Dependency.AndroidX.COMPOSE_UI_PREVIEW)
    implementation(Dependency.AndroidX.COMPOSE_MATERIAL)
    implementation(Dependency.AndroidX.COMPOSE_ACTIVITY)

    implementation(Dependency.KTX.CORE)
    implementation(Dependency.KTX.LIFECYCLE_LIVEDATA)
    implementation(Dependency.KTX.LIFECYCLE_VIEWMODEL)
    implementation(Dependency.KTX.ACTIVITY)
    implementation(Dependency.KTX.FRAGMENT)

    implementation(Dependency.Google.MATERIAL)
    implementation(Dependency.Google.GSON)

    implementation(Dependency.Hilt.CORE)
    kapt(Dependency.Hilt.APT)

    testImplementation(TestDependency.MOCKK)
    testImplementation(TestDependency.COROUTINE_TEST)
    testImplementation(TestDependency.KOTEST)
    debugImplementation(TestDependency.COMPOSE_UI_TOOLING)
    androidTestImplementation(AndroidTestDependency.TEST_RUNNER)
    androidTestImplementation(AndroidTestDependency.ESPRESSO_CORE)
}