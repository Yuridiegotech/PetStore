plugins {
    id("java")
}

group = "br.com.ntconsult"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.rest-assured:rest-assured:5.3.0")
    testImplementation("org.testng:testng:7.1.0")





}

tasks.test {
   useTestNG()
}