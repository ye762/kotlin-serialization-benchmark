plugins {
    kotlin("jvm") version "2.1.21"
    kotlin("plugin.serialization") version "1.9.24"
    kotlin("kapt") version "2.1.21"
}

group = "org.ye.serialization.benchmark"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("org.openjdk.jmh:jmh-core:1.37")
    kapt("org.openjdk.jmh:jmh-generator-annprocess:1.37")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
    implementation("com.google.code.gson:gson:2.13.1")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.15.0")
}

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}