plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "mx.gob.sapalapaz.lyf"
    compileSdk = 34

    defaultConfig {
        applicationId = "mx.gob.sapalapaz.lyf"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.6"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation("com.google.dagger:hilt-android:2.51")
    implementation(libs.androidx.foundation.android)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.ui.tooling.preview.android)
    implementation(libs.androidx.datastore.preferences.core.jvm)
    implementation(libs.androidx.room.common)
    implementation(libs.androidx.room.ktx)
    implementation(libs.play.services.location)
    debugImplementation(libs.androidx.ui.tooling)

    val navigation_compose_version = "2.5.3"
    implementation ("androidx.navigation:navigation-compose:$navigation_compose_version")
    kapt("com.google.dagger:hilt-android-compiler:2.51")
    implementation(libs.androidx.hilt.navigation.compose)
    kapt("androidx.hilt:hilt-compiler:1.2.0")
    implementation(libs.androidx.ui.tooling.preview.android)
    coreLibraryDesugaring(libs.desugar.jdk.libs)

    val retrofit_version = "2.9.0"
    implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation ("com.squareup.retrofit2:converter-moshi:$retrofit_version")
    implementation ("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")
    implementation ("androidx.datastore:datastore-preferences:1.0.0")
    implementation ("com.google.maps.android:maps-compose:1.0.0")
    implementation ("com.google.android.gms:play-services-maps:19.0.0")
    implementation ("com.google.maps.android:android-maps-utils:2.4.0")
    implementation(libs.accompanist.permissions)

    val room_version = "2.6.1"
    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
    kapt("androidx.room:room-compiler:$room_version")

    implementation(fileTree(mapOf(
        "dir" to "libs\\zebra",
        "include" to listOf("*.jar")
    )))

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(kotlin("script-runtime"))
}