# Commit Convention

This project uses semantic commit messages following the Conventional Commits specification. Use only the header line — no body or footer:

```
<type>(<scope>): <subject>
```

## Types

- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `style`: Code style changes (formatting, missing semicolons, etc)
- `refactor`: Code refactoring without changing functionality
- `test`: Adding or updating tests
- `build`: Changes to build system or dependencies
- `ci`: CI/CD configuration changes
- `chore`: Other changes that don't modify src or test files

## Examples

- `feat(auth): add user login functionality`
- `fix(api): handle null response from endpoint`
- `docs: update README with setup instructions`
- `test(utils): add corner case tests for string parser`
