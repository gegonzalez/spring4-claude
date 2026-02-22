# Build Commands

Build the project:
```bash
./gradlew build
```

Run the Spring Boot application:
```bash
./gradlew bootRun
```

Build executable JAR:
```bash
./gradlew bootJar
```

Run the JAR:
```bash
java -jar build/libs/spring4-claude-1.0-SNAPSHOT.jar
```

Clean build artifacts:
```bash
./gradlew clean
```

Always use the Gradle wrapper (`./gradlew`) instead of a system-installed Gradle to ensure consistent builds across environments.
