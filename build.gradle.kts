plugins {
    kotlin("jvm") version "2.0.0"
    id("me.champeau.jmh") version "0.7.2"
}

group = "com.forketyfork"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    jmh("commons-io:commons-io:2.7")
}

kotlin {
    jvmToolchain(17)
}

jmh {
    fork = 1
    iterations = 5
}
