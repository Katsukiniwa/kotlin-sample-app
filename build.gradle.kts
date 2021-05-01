import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import nu.studer.gradle.jooq.JooqEdition
import org.jooq.meta.jaxb.ForcedType
import org.jooq.meta.jaxb.Property

plugins {
	id("org.springframework.boot") version "2.4.5"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("nu.studer.jooq") version "5.2.1"
	kotlin("jvm") version "1.4.32"
	kotlin("plugin.spring") version "1.4.32"
	kotlin("plugin.jpa") version "1.4.32"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-mustache")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.springframework.boot:spring-boot-starter-jooq")
	implementation("org.jooq:jooq-meta")
	implementation("org.jooq:jooq-codegen")
	implementation("org.flywaydb:flyway-core")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	jooqGenerator("mysql:mysql-connector-java")
	runtimeOnly("mysql:mysql-connector-java")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

jooq {
	edition.set(JooqEdition.OSS)

	configurations {
		create("main") {
			jooqConfiguration.apply {
				logging = org.jooq.meta.jaxb.Logging.WARN
				jdbc.apply {
					driver = "com.mysql.cj.jdbc.Driver"
					url = "jdbc:mysql://127.0.0.1:3306/kotlin_sample_app"
					user = "root"
					password = "password"
					properties.add(Property().withKey("PAGE_SIZE").withValue("2048"))
				}
				generator.apply {
					name = "org.jooq.codegen.KotlinGenerator"
					database.apply {
						name = "org.jooq.meta.mysql.MySQLDatabase"
					}
					generate.apply {
						isDeprecated = false
						isRecords = false
						isImmutablePojos = false
						isFluentSetters = false
					}
					target.apply {
						packageName = "nu.studer.sample"
						directory = "src/generated/jooq"
					}
					strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"
				}
			}
		}
	}
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.named<nu.studer.gradle.jooq.JooqGenerate>("generateJooq") { allInputsDeclared.set(true) }
