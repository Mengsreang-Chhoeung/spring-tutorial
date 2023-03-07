# Spring Tutorial

_Spring makes Java simple, modern, productive, reactive, and cloud-ready._

## What Spring can do

- **Microservices**

  ![Microservice](/doc-images/microservices.svg)

  Quickly deliver production‑grade features with independently evolvable microservices.

- **Reactive**

  ![Reactive](/doc-images/reactive.svg)

  Spring's asynchronous, nonblocking architecture means you can get more from your computing resources.

- **Cloud**
  ![Cloud](/doc-images/cloud.svg)

  Your code, any cloud—we’ve got you covered. Connect and scale your services, whatever your platform.

- **Web apps**
  ![Web apps](/doc-images/web-apps.svg)

  Frameworks for fast, secure, and responsive web applications connected to any data store.

- **Serverless**
  ![Serverless](/doc-images/serverless.svg)

  The ultimate flexibility. Scale up on demand and scale to zero when there’s no demand.

- **Event Driven**
  ![Event Driven](/doc-images/event-driven.svg)

  Integrate with your enterprise. React to business events. Act on your streaming data in realtime.

- **Batch**
  ![Batch](/doc-images/batch.svg)

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
