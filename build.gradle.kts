plugins {
    kotlin("jvm") version "1.5.20"
}

group = "me.antonarhipov.kotlin"
version = "0.0.1"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
}

tasks.test {
    useJUnitPlatform()
}