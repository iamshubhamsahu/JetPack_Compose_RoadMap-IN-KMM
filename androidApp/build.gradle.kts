import android.annotation.SuppressLint

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.jetpackcomposeroadmap.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.jetpackcomposeroadmap.android"
        minSdk = 29
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    val nav_version = "2.5.3"

    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.3.1")
    implementation("androidx.compose.ui:ui-tooling:1.3.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.3.1")
    implementation("androidx.compose.foundation:foundation:1.3.1")
    implementation("androidx.compose.material:material:1.3.1")
    implementation("androidx.activity:activity-compose:1.6.1")

    implementation("io.coil-kt:coil-compose:1.4.0")

    //for PickVisualMedia contract
    implementation ("androidx.activity:activity-ktx:1.7.0")

    //for rememberImagePainter and image loading functionality
    implementation("io.coil-kt:coil-compose:2.2.2")

    //for tap target view
    implementation ("com.getkeepsafe.taptargetview:taptargetview:1.13.3")

    // Java language implementation
    implementation("androidx.navigation:navigation-fragment:$nav_version")
    implementation("androidx.navigation:navigation-ui:$nav_version")

    // Kotlin
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    // Feature module Support
    implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")

    // Testing Navigation
    implementation("androidx.navigation:navigation-testing:$nav_version")

    // Jetpack Compose Integration
    implementation("androidx.navigation:navigation-compose:$nav_version")

    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("com.google.maps.android:maps-compose:2.11.2")

    // Make sure to also include the latest version of the Maps SDK for Android
    implementation("com.google.android.gms:play-services-maps:18.1.0")

    // Optionally, you can include the Compose utils library for Clustering, etc.
    implementation ("com.google.maps.android:maps-compose-utils:2.11.2")

    // Optionally, you can include the widgets library for ScaleBar, etc.
    implementation("com.google.maps.android:maps-compose-widgets:2.11.2")


}