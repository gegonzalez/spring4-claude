# Testing

## Commands

Run all tests (including integration tests):
```bash
./gradlew test
```

Run only unit tests from main module:
```bash
./gradlew :test
```

Run only integration/acceptance tests:
```bash
./gradlew :integrationTests:test
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

## Strategy

- **End-to-End Tests**: Write comprehensive E2E tests covering happy path scenarios
- **Unit Tests**: Focus on testing corner cases and edge conditions in critical units of code
- **Pragmatic Coverage**: Not every class requires tests — focus testing effort on business logic, complex algorithms, and critical paths
- Test behavior, not implementation details
- **Always run tests after each change**: Execute `./gradlew test` to verify changes haven't broken existing functionality
