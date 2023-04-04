# Spring Tutorial

_Spring makes Java simple, modern, productive, reactive, and cloud-ready._

## What Spring can do

- **Microservices**

  <img src="./doc-images/microservices.svg" alt="Microservice" width="80">

  Quickly deliver production‑grade features with independently evolvable microservices.

  [More >>](https://spring.io/microservices)

- **Reactive**

  <img src="./doc-images/reactive.svg" alt="Reactive" width="80">

  Spring's asynchronous, nonblocking architecture means you can get more from your computing resources.

  [More >>](https://spring.io/reactive)

- **Cloud**

  <img src="./doc-images/cloud.svg" alt="Cloud" width="80">

  Your code, any cloud—we’ve got you covered. Connect and scale your services, whatever your platform.

  [More >>](https://spring.io/cloud)

- **Web apps**

  <img src="./doc-images/web-apps.svg" alt="Web apps" width="80">

  Frameworks for fast, secure, and responsive web applications connected to any data store.

  [More >>](https://spring.io/web-applications)

- **Serverless**

  <img src="./doc-images/serverless.svg" alt="Serverless" width="80">

  The ultimate flexibility. Scale up on demand and scale to zero when there’s no demand.

  [More >>](https://spring.io/serverless)

- **Event Driven**

  <img src="./doc-images/event-driven.svg" alt="Event Driven" width="80">

  Integrate with your enterprise. React to business events. Act on your streaming data in realtime.

  [More >>](https://spring.io/event-driven)

- **Batch**

  <img src="./doc-images/batch.svg" alt="Batch" width="80">

  Automated tasks. Offline processing of data at a time to suit you.

  [More >>](https://spring.io/batch)

[🔼 Back to top](#spring-tutorial)

## Roadmap

Before jumping to the core of Spring and Spring Boot, let's have a look at the [roadmap](https://roadmap.sh/spring-boot) first.

## Sample Application with Spring Boot

```java
@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/helloworld")
    public String hello() {
        return"Hello World!";
    }
}
```

## What is Spring

Spring is a mature, powerful and highly flexible framework focused on building web applications in Java.

One of the core benefits of Spring is that it takes care of most of the low-level aspects of building the application to allow us to actually focus on features and business logic.

Another strong point is that, while the framework is quite mature and well-established, it's very actively maintained and has a thriving dev community. This makes it quite up to date and aligned with the Java ecosystem right now.

It was **developed** by **Rod Johnson** in `2003`.

## Features

- [Core technologies](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/core.html): dependency injection, events, resources, i18n, validation, data binding, type conversion, SpEL, AOP.
- [Testing](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/testing.html)
- [Data Access](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/data-access.html): transactions, DAO support, JDBC, ORM, Marshalling XML.
- [Spring MVC](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html) and [Spring WebFlux](https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html) web frameworks.
- [Integration](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/integration.html): remoting, JMS, JCA, JMX, email, tasks, scheduling, cache.
- [Languages](https://docs.spring.io/spring-framework/docs/current/spring-framework-reference/languages.html): Kotlin, Groovy, dynamic languages.

[🔼 Back to top](#spring-tutorial)

## Terminology

Spring Core is the foundation of the Spring Framework, which provides a comprehensive programming and configuration model for Java-based applications. Here are some key terms and concepts related to Spring Core:

- Beans: In Spring, a “bean” is a Java object that is managed by the Spring container. Beans are typically defined using configuration metadata, which can be specified in XML, Java annotations, or Java code.
- Inversion of Control (IoC): One of the main principles of Spring is Inversion of Control (IoC), which means that the Spring container is responsible for managing the lifecycle of beans and injecting their dependencies.
- Dependency Injection (DI): Spring uses Dependency Injection (DI) to manage the dependencies between beans. In DI, an object’s dependencies are provided to it by the container, rather than the object creating or looking up its own dependencies.
- Container: The Spring container is the core part of the Spring Framework, which creates and manages beans and their dependencies.
- ApplicationContext: An ApplicationContext is an implementation of the Spring container. It is responsible for loading and managing the configuration metadata and creating the beans defined in that metadata.
- Aspect-Oriented Programming (AOP): Spring supports Aspect-Oriented Programming (AOP), which allows you to separate cross-cutting concerns, such as logging or security, from the business logic of your application.
- Events: Spring provides an event model that allows beans to send and receive events. This is used to decouple the beans from each other, making the application more loosely coupled.
- ApplicationEvent and listener: Spring support publish subscribe model for event handling, ApplicationEvent defines event object, and the listener is a class that implements ApplicationListener interface, listening for the specific event and take the necessary action.
- Data Access: Spring provides a consistent, high-level abstraction for data access using various frameworks like JDBC, Hibernate, JPA.
- Transactions: Spring provides a flexible, consistent and easy way to declaratively manage transactions with different underlying technologies such as JPA, JDBC, and Hibernate.
- Task Execution and Scheduling: Spring provides a TaskExecutor and TaskScheduler, providing a convenient way to run tasks concurrently, on a scheduled basis or asynchronously.

[🔼 Back to top](#spring-tutorial)

### 📜 References

- [Spring Framework Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html)
- [Spring Framework from Javatpoint](https://www.javatpoint.com/spring-tutorial)
- [Spring Framework from Baeldung](https://baeldung.com/spring-tutorial)
- [Spring Boot Developer Roadmap](https://roadmap.sh/spring-boot)

### 🤝 Contributors

- Mengsreang-Chhoeung [@mengsreang_dev](https://twitter.com/mengsreang_dev)
