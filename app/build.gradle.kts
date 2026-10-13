plugins {
    id("com.android.application")
}

android {
    namespace = "com.ourx.irishtunes"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ourx.irishtunes"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    constraints {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.22")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.8.22")
        because("Aligner kotlin-stdlib-jdk7/jdk8 avec kotlin-stdlib 1.8.22")
    }
}
