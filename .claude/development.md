# Development Practices

## Code Quality

- Follow clean code principles: meaningful names, small functions, single responsibility
- Apply SOLID principles when designing classes and modules
- Practice Test-Driven Development (TDD): write tests before implementation

## Naming Conventions

- **Modules**: camelCase (e.g., `integrationTests`)
- **Classes**: PascalCase (e.g., `SampleAcceptanceTest`)
- **Functions/Variables**: camelCase (e.g., `getUserName`)

## Code Structure

- **Package**: `org.example`
- **Main entry point**: `src/main/kotlin/Main.kt`
- **JVM Target**: Java 21
- **Test Framework**: JUnit Platform (configured via `useJUnitPlatform()`)
- **Integration Tests**: Separate `integrationTests` module for acceptance tests
