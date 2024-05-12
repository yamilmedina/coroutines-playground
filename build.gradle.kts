val coroutines_version by extra("1.8.1")

plugins {
    kotlin("jvm") version "2.0.0-RC3"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version")

    testImplementation("app.cash.turbine:turbine:1.1.0")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutines_version")
    testImplementation("junit:junit:4.13.1")
}

tasks {
    val jvmTargetVersion = "17"
    compileJava {
        targetCompatibility = jvmTargetVersion
    }
    compileKotlin {
        kotlinOptions.jvmTarget = jvmTargetVersion
    }
    compileTestJava {
        targetCompatibility = jvmTargetVersion
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = jvmTargetVersion
    }
}