/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("buildlogic.kotlin-application-conventions")
}

dependencies {
//    implementation("org.apache.commons:commons-text")
    implementation(project(":shared"))
}

application {
    mainClass = "ru.ttraum.server.voice.MainKt"
}
