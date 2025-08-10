plugins {
    kotlin("jvm") version "2.1.21"
    kotlin("plugin.serialization") version "1.9.24" // Use the relevant Kotlin version
}

group = "org.ye.serializtion.benchmark"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // kotlinx
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
    // jmh
    testImplementation("org.openjdk.jmh:jmh-core:1.37")
    testAnnotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:1.37")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}