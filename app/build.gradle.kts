import dependencies.Versions
import dependencies.Versions.Deps

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.example.composeapp"
        minSdk = 28
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.AndroidX.compose
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.8.0")
    implementation(Deps.AndroidX.composeUI)
    implementation(Deps.AndroidX.composeMaterial)
    implementation(Deps.AndroidX.composeUIToolingPreview)
    implementation(Deps.AndroidX.lifecycleRuntimeKtx)
    implementation(Deps.AndroidX.activityCompose)
    testImplementation(Deps.AndroidX.junit)
    androidTestImplementation(Deps.AndroidX.extJunit)
    androidTestImplementation(Deps.AndroidX.textEspressoCore)
    androidTestImplementation(Deps.AndroidX.uiTextJunit4)
    debugImplementation(Deps.AndroidX.composeUITooling)
}
