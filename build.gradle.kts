// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Dependencies.ClassPath.gradle)
        classpath(Dependencies.ClassPath.kotlinGradle)
        classpath(Dependencies.ClassPath.navArgs)
        classpath(Dependencies.ClassPath.hiltAndroid)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven { url = uri(Repositories.jitpackUrl) }
    }
}

tasks.register(Task.clean, Delete::class) {
    delete(rootProject.buildDir)
}