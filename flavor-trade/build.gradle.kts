plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "dev.essentials.flavor_trade"

    compileSdk = 35
    defaultConfig {
        minSdk = 21
    }
}

dependencies {
    implementation(libs.retrofit)
    implementation(libs.gson)

    testImplementation(libs.junit)
    testImplementation(libs.mockito)
}