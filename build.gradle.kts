plugins {
    java
    application
}

group = "ca.uqac.lif.bullwinkle"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

// Using default Gradle Java source directories (src/main/java and src/test/java)
// No need for custom sourceSets configuration unless using non-standard locations.

application {
    // Define your main class here if you have one, e.g.:
    // mainClass.set("ca.uqac.lif.bullwinkle.BullwinkleCli")
}
