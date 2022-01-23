@file:Suppress("UnstableApiUsage")

plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
val gradleVersion = libs.findVersion("gradle").get().requiredVersion.toString()
val kotlinVersion = libs.findVersion("kotlin").get().requiredVersion.toString()
val detektVersion = libs.findVersion("detekt").get().requiredVersion.toString()
val hiltVersion = libs.findVersion("hilt").get().requiredVersion.toString()
val dependencyCheckerVersion =
    libs.findVersion("dependency-checker").get().requiredVersion.toString()

dependencies {
    implementation("com.android.tools.build:gradle:${gradleVersion}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${detektVersion}")
    implementation("com.google.dagger:hilt-android-gradle-plugin:${hiltVersion}")
    implementation("com.github.ben-manes:gradle-versions-plugin:${dependencyCheckerVersion}")
}