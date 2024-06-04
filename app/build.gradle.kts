var lombokVersion = "1.18.32"
var checkstyleVersion = "10.12.4"

plugins {
    java
    application
    checkstyle
}

group = "hexlet.code"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    compileOnly("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")

    testCompileOnly("org.projectlombok:lombok:$lombokVersion")
    testAnnotationProcessor("org.projectlombok:lombok:$lombokVersion")
}

tasks.test { useJUnitPlatform() }

application { mainClass = "hexlet.code.App" }

checkstyle { toolVersion = checkstyleVersion }
