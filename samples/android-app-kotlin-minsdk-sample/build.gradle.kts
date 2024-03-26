plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
  id("com.squareup.wire")
}

wire {
  kotlin {
    android = true
  }
}

dependencies {
  implementation(libs.androidx.appcompat)
  implementation(libs.androidx.constraintLayout)
  implementation(libs.moshi)
  implementation(projects.wire)
  implementation(projects.wireMoshiAdapter)
}

buildscript {
  repositories {
    mavenCentral()
    google()
  }
  dependencies {
    classpath(libs.pluginz.android)
    classpath("com.squareup.wire:wire-gradle-plugin")
  }
}

android {
  namespace = "com.squareup.wire.android.app.kotlin.minsdk"
  defaultConfig {
    minSdk = 24
  }
}
