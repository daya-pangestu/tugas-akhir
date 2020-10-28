import org.gradle.kotlin.dsl.`kotlin-dsl`
plugins {
    `kotlin-dsl`
}

repositories{
    jcenter()
    google()

}

buildscript {
    repositories { jcenter() }
    dependencies {
        classpath("org.jacoco:org.jacoco.core:0.8.5")
    }
}
