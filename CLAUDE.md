# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Kotlin JVM project built with Gradle, using Kotlin 2.3.0 and JVM toolchain 21. The project uses the standard Kotlin project structure with source files in `src/main/kotlin/`.

## Build Commands

Build the project:
```bash
./gradlew build
```

Run the application:
```bash
./gradlew run
```

Clean build artifacts:
```bash
./gradlew clean
```

## Code Quality Checks

Run ktlint to check code style:
```bash
./gradlew ktlintCheck
```

Auto-format code with ktlint:
```bash
./gradlew ktlintFormat
```

## Testing

Run all tests:
```bash
./gradlew test
```

Run tests with verbose output:
```bash
./gradlew test --info
```

Run a single test class:
```bash
./gradlew test --tests "ClassName"
```

Run a single test method:
```bash
./gradlew test --tests "ClassName.testMethodName"
```

## Code Structure

- **Package**: `org.example`
- **Main entry point**: `src/main/kotlin/Main.kt`
- **JVM Target**: Java 21
- **Test Framework**: JUnit Platform (configured via `useJUnitPlatform()`)

## Development Practices

### Code Quality
- Follow clean code principles: meaningful names, small functions, single responsibility
- Apply SOLID principles when designing classes and modules
- Practice Test-Driven Development (TDD): write tests before implementation

### Testing Strategy
- **End-to-End Tests**: Write comprehensive E2E tests covering happy path scenarios
- **Unit Tests**: Focus on testing corner cases and edge conditions in critical units of code
- **Pragmatic Coverage**: Not every class requires tests - focus testing effort on business logic, complex algorithms, and critical paths
- Test behavior, not implementation details
- **Always run tests after each change**: Execute `./gradlew test` to verify changes haven't broken existing functionality
- Run linter checks with `./gradlew ktlintCheck` before committing code

## Commit Convention

This project uses semantic commit messages following the Conventional Commits specification:

```
<type>(<scope>): <subject>

<body>

<footer>
```

**Types**:
- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `style`: Code style changes (formatting, missing semicolons, etc)
- `refactor`: Code refactoring without changing functionality
- `test`: Adding or updating tests
- `build`: Changes to build system or dependencies
- `ci`: CI/CD configuration changes
- `chore`: Other changes that don't modify src or test files

**Examples**:
- `feat(auth): add user login functionality`
- `fix(api): handle null response from endpoint`
- `docs: update README with setup instructions`
- `test(utils): add corner case tests for string parser`

## Gradle Wrapper

Always use the Gradle wrapper (`./gradlew`) instead of a system-installed Gradle to ensure consistent builds across environments.
