# spring4-claude

A Spring Boot 4.0 backend application built with Kotlin and Gradle for managing products.

## Tech Stack

- **Kotlin** 2.2.0
- **Spring Boot** 4.0.0
- **JVM** 21
- **Gradle** (Kotlin DSL)

## Project Structure

```
spring4-claude/
├── src/
│   └── main/
│       ├── kotlin/org/example/   # Application source code
│       └── resources/            # Configuration files
├── integrationTests/             # Acceptance / E2E tests module
├── build.gradle.kts
└── settings.gradle.kts
```

## Getting Started

### Prerequisites

- JDK 21+

### Run the application

```bash
./gradlew bootRun
```

The server starts on port **8080**.

### Build

```bash
./gradlew build
```

Build an executable JAR:

```bash
./gradlew bootJar
java -jar build/libs/spring4-claude-1.0-SNAPSHOT.jar
```

## Testing

Run all tests (unit + integration):

```bash
./gradlew test
```

Run only unit tests:

```bash
./gradlew :test
```

Run only integration/acceptance tests:

```bash
./gradlew :integrationTests:test
```
