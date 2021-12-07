object Dependency {

    object Kotlin {
        const val SDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${KOTLIN_VERSION}"
        const val COROUTINE_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2"
        const val COROUTINE_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2"
        const val REFLECTION = "org.jetbrains.kotlin:kotlin-reflect:${KOTLIN_VERSION}"
    }

    object AndroidX {
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.1"
        const val APP_COMPAT = "androidx.appcompat:appcompat:1.4.0"
        const val COMPOSE_UI = "androidx.compose.ui:ui:${COMPOSE_VERSION}"
        const val COMPOSE_UI_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${COMPOSE_VERSION}"
        const val COMPOSE_MATERIAL = "androidx.compose.material:material:${COMPOSE_VERSION}"
        const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:${ACTIVITY_FRAGMENT_VERSION}"
    }

    object KTX {
        const val CORE = "androidx.core:core-ktx:1.7.0"
        const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${LIFECYCLE_VERSION}"
        const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${LIFECYCLE_VERSION}"
        const val ACTIVITY = "androidx.activity:activity-ktx:${ACTIVITY_FRAGMENT_VERSION}"
        const val FRAGMENT = "androidx.fragment:fragment-ktx:${ACTIVITY_FRAGMENT_VERSION}"
    }

    object Google {
        const val MATERIAL = "com.google.android.material:material:1.4.0"
        const val GSON = "com.google.code.gson:gson:2.8.9"
    }

    object OkHttp {
        const val CORE = "com.squareup.okhttp3:okhttp:5.0.0-alpha.2"
        const val CONNECTION = "com.squareup.okhttp3:okhttp-urlconnection:4.9.2"
        const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2"
    }

    object Retrofit {
        const val CORE = "com.squareup.retrofit2:retrofit:2.9.0"
        const val CONVERT_GSON = "com.squareup.retrofit2:converter-gson:2.9.0"
    }

    object Hilt {
        const val CORE = "com.google.dagger:hilt-android:2.39.1"
        const val APT = "com.google.dagger:hilt-android-compiler:2.39.1"
    }
}