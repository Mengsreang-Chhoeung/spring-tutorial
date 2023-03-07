# Spring Tutorial

_Spring makes Java simple, modern, productive, reactive, and cloud-ready._

## What Spring can do

- **Microservices**

  <img src="./doc-images/microservices.svg" alt="Microservice" width="80">

  Quickly deliver production‑grade features with independently evolvable microservices.

- **Reactive**

  <img src="./doc-images/reactive.svg" alt="Reactive" width="80">

  Spring's asynchronous, nonblocking architecture means you can get more from your computing resources.

- **Cloud**
  <img src="./doc-images/cloud.svg" alt="Cloud" width="80">

  Your code, any cloud—we’ve got you covered. Connect and scale your services, whatever your platform.

- **Web apps**
  <img src="./doc-images/web-apps.svg" alt="Web apps" width="80">

  Frameworks for fast, secure, and responsive web applications connected to any data store.

- **Serverless**
  <img src="./doc-images/serverless.svg" alt="Serverless" width="80">

  The ultimate flexibility. Scale up on demand and scale to zero when there’s no demand.

- **Event Driven**
  <img src="./doc-images/event-driven.svg" alt="Event Driven" width="80">

  Integrate with your enterprise. React to business events. Act on your streaming data in realtime.

- **Batch**
  <img src="./doc-images/batch.svg" alt="Batch" width="80">

  Automated tasks. Offline processing of data at a time to suit you.

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

### 📜 References

- [Spring Framework Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html)
- [Spring Framework from Javatpoint](https://www.javatpoint.com/spring-tutorial)
- [Spring Framework from Baeldung](https://baeldung.com/spring-tutorial)

### 🤝 Contributors

- Mengsreang-Chhoeung [@mengsreang_dev](https://twitter.com/mengsreang_dev)
