buildscript {
    extra.apply {
        set("compose_version", "1.1.1")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${findProperty("kotlin_version")}")
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.1.3" apply false
    id("com.android.library") version "7.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.5.21" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
