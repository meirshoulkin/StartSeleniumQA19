plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation group: 'org.testng', name: 'testng', version: '7.4.0'
}

tasks.test {
    useJUnitPlatform()
}