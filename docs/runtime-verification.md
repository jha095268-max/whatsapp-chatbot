## Verified checks

- `mvnw.cmd -s maven-settings.xml clean package` completed successfully
- Tests passed for:
  - `Hi` -> `Hello`
  - `Bye` -> `Goodbye`
- Live API responses verified:
  - `POST /webhook` with `Hi` returned `{"reply":"Hello"}`
  - `POST /webhook` with `Bye` returned `{"reply":"Goodbye"}`

## Log behavior

Console logs confirmed that incoming messages are logged by `WebhookController`.
