plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "com.rarnu.ws"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("com.rarnu.ws.MainKt")
}