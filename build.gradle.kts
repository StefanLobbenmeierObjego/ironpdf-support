import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "17"
        }
    }
}

dependencies {
    val ironPdfVersion = "2025.2.8"
    implementation("com.ironsoftware:ironpdf:$ironPdfVersion")
    implementation("com.ironsoftware:ironpdf-engine-macos-x64:$ironPdfVersion")
    implementation("org.slf4j:slf4j-simple:2.0.7")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("de.objego.content.pdfgeneration.business.MainKt")
}
