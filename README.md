# Serving Web Content (Spring Boot 2.6.15)

A working copy of the [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content) getting started guide, pinned to **Spring Boot 2.6.15** with a Java 8 target.

For the latest version of this example (current Spring Boot, updated setup steps), see the [guide](https://spring.io/guides/gs/serving-web-content).

## What it does

- Serves a static home page at `/` (`src/main/resources/static/index.html`)
- Accepts `GET /greeting` (and `GET /greeting/`) and renders a Thymeleaf page:
  - `/greeting` → "Hello, World!"
  - `/greeting?name=User` → "Hello, User!"

## Requirements

- Java 8 or later (built and verified with Java 21, targeting Java 8 bytecode)
- Maven (the included `mvnw` wrapper downloads Maven 3.9.16 automatically)

## Build and test

```
./mvnw clean test
```

## Run

```
./mvnw spring-boot:run
```

or build the executable jar:

```
./mvnw clean package
java -jar target/greetings-0.0.1-SNAPSHOT.jar
```

The app listens on port 8080 by default. If the port is already in use, pick another:

```
java -jar target/greetings-0.0.1-SNAPSHOT.jar --server.port=9090
```
