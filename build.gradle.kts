//plugins {
//	java
//	id("org.springframework.boot") version "3.2.2"
//	id("io.spring.dependency-management") version "1.1.4"
//}

plugins {
	java
	id("org.springframework.boot") version "2.7.1"
	id("io.spring.dependency-management") version "1.0.11.RELEASE" // fin version which is compatible with Spring Boot 2.7.1
}


group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.1")
	implementation("org.springframework.boot:spring-boot-starter-data-rest:2.7.1")
	implementation("org.springframework.boot:spring-boot-starter-web:2.7.1")
	compileOnly("org.projectlombok:lombok:1.18.24")
	annotationProcessor("org.projectlombok:lombok:1.18.24")
	testImplementation("org.springframework.boot:spring-boot-starter-test:2.7.1")
	runtimeOnly("com.h2database:h2")

	implementation("com.fasterxml.jackson.datatype:jackson-datatype-hibernate5:2.13.4")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

