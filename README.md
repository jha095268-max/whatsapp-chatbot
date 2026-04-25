# WhatsApp Chatbot Backend 

This is a simple Java + Spring Boot backend project built for an internship assignment.

## Features

- `POST /webhook` endpoint to simulate WhatsApp webhook messages
- Accepts JSON input
- Returns predefined responses:
  - `Hi` -> `Hello`
  - `Bye` -> `Goodbye`
- Logs every incoming message in the console
- Includes unit/integration tests
- Includes Docker support for optional Render deployment

## Tech Stack

- Java 17
- Spring Boot 3
- Maven

## Project Structure

```text
src/
  main/
    java/com/example/whatsappbot/
    resources/
  test/
    java/com/example/whatsappbot/
```

## JSON Request Example

```json
{
  "from": "919999999999",
  "message": "Hi"
}
```

## JSON Response Example

```json
{
  "reply": "Hello"
}
```

## How to Run Locally

1. Open terminal inside the project folder.
2. Run the Maven Wrapper command:

```bash
./mvnw spring-boot:run
```

For Windows PowerShell or Command Prompt:

```bat
mvnw.cmd spring-boot:run
```

You can also use the helper script:

```bat
run-project.bat
```

To run the packaged jar directly after building:

```bat
run-jar.bat
```

3. The app will start at:

```text
http://localhost:8080
```

## Test the API

Use curl or Postman:

```bash
curl -X POST http://localhost:8080/webhook \
  -H "Content-Type: application/json" \
  -d "{\"from\":\"919999999999\",\"message\":\"Hi\"}"
```

Expected response:

```json
{
  "reply": "Hello"
}
```


## Bonus: Deploy on Render

This project includes a `Dockerfile` and `render.yaml`.

Basic steps:

1. Push the code to GitHub.
2. Create a new Web Service on Render.
3. Connect your GitHub repository.
4. Choose Docker deployment.
5. Deploy and test the `/webhook` endpoint.

## Notes

- Matching is case-insensitive for `Hi` and `Bye`.
- Any other message returns a default fallback reply.
- To create the packaged jar, run `mvnw.cmd clean package`.
- The packaged jar is available at `dist/whatsapp-chatbot-simulator.jar`.
