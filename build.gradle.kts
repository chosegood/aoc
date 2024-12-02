plugins {
    kotlin("jvm") version "2.1.0"
}

group = "com.github.chosegood"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.strikt:strikt-core:0.34.0")
}

tasks {
    test { useJUnitPlatform() }
    wrapper { gradleVersion = "8.11.1" }
}

kotlin {
    jvmToolchain(21)
}