# Spring Boot From Basics to Advanced (Shrayansh Jain)

---
# Video 1 :
- **Title:** Spring Boot Roadmap 2024 | Spring Boot with Microservices from Basics to Advanced
- **URL:** [Watch on YouTube](https://youtu.be/90hAvj0A8C8?si=-QwbjOoY_n4Bu5CI)

## Topics Covered
- Introduction
- Roadmap

---
# Video 2 :
- **Title:** Introduction to Spring boot | Its Advantage over Spring MVC and Servlets based Web applications
- **URL:** [Watch on YouTube](https://youtu.be/TMX1kQ4W4hI?si=TcJKpEg6aGmjfykR)

## Topics Covered
- api development using servlets and challenges before spring
- api request handling flow by servlets
- benefits of spring over servlets,
- api request handling flow by spring MVC
- what spring challenges spring boot solves

---
# Video 3 :
- **Title:** Spring boot Project setup and Layered Architecture Introduction
- **URL:** [Watch on YouTube](https://youtu.be/4QWW4v2u_ZI?si=KurisnWxWQLF0Up6)

## Topics Covered
- Spring boot project setup
- Spring Boot Layered Architecture

---
# Video 4 :
- **Title:** Introduction to Maven and its Lifecycle | Spring boot Maven project
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=1e4jNP8iKLo&list=PL6W8uoQQ2c60g6_fcjDCLHSx1LBeVYqyZ&index=4)

## Topics Covered
- pom.xml structure
    - super pom.xml and parent pom.xml
- Build Lifecycle
    - validate, compile, test, package, verify, install, deploy

---
# Video 5 :
- **Title:** Spring boot Annotations (Controller Layer) | Controller, RestController, RequestMapping etc.
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=ndSUJYNa8T8&list=PL6W8uoQQ2c60g6_fcjDCLHSx1LBeVYqyZ&index=5)

## Topics Covered
- @Controller
- @ResponseBody
- @RestController (@Controller+@ResponseBody)
- RequestMapping
- GetMapping, PostMapping, PutMapping, PatchMapping, DeleteMapping
- @RequestParam
- Custom Modification during Binding using PropertyEditor
- @PathVariable
- @requestBody
- ResponseEntity object

---
# Video 6 :
- **Title:** Spring boot: Bean and its Lifecycle | Inversion of Control (IOC)
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=Wd15hxveyME&list=PL6W8uoQQ2c60g6_fcjDCLHSx1LBeVYqyZ&index=6)

## Topics Covered
- What is Bean
- How to create bean
    - using @Component
    - using @Bean
- How SpringBoot find Beans
    - find @Component inside @ComponentScan package
    - find @Bean inside @configuration classes
- Bean Initialisation - Lazy and Eager
- Bean Lifecycle
    - Application Start
    - IOC Container Stated
    - Construct Bean
    - Inject Dependency into constructed Bean
    - @PostConstruct
    - Use the Bean
    - @PreDestroy
    - Bean destroyed

---
# Video 7 :
- **Title:** Dependency Injection in Spring boot | With Advantages and Disadvantages
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=W-TgmKAnGG0&list=PL6W8uoQQ2c60g6_fcjDCLHSx1LBeVYqyZ&index=7)

## Topics Covered
- Problem Dependency injection tried to solve
  - Tight coupling
  - facilitate Dependency inversion (SOLID Principle)
- DI using @Autowired
  - Field Injection
    - Advantage and Disadvantage with Field Injection
  - Setter Injection
    - Advantage and Disadvantage with Setter Injection
  - Constructor Injection
    - Advantage and Disadvantage with Constructor Injection
- Common Issues With DI
  - Circular Dependency
  - Unsatisfied Dependency
- Solutions to resolve circular dependency error
  - code refactoring
  - @Lazy on @Autowired annotation
  - using @PostConstruct
- Solutions to remove unsatisfied dependency error
  - using @Primary annotation
  - using @Qualifier annotation

---
# Video 8 :
- **Title:** Spring boot : Bean Scopes | Singleton, Prototype, Request, Session Scopes with Examples in Java
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=JGFNn6Eqp64&list=PL6W8uoQQ2c60g6_fcjDCLHSx1LBeVYqyZ&index=8)

## Topics Covered
- Bean Scopes
  - Singleton
    - default initialisation - Eager
    - @Lazy for lazy initialisation
  - Prototype
    - default initialisation - Lazy
  - Request
    - default initialisation - Lazy
    - proxyMode with request scope (create proxy object in case of eager initialisation)
  - Session
    - default initialisation - Lazy
  - Application
    - one object across all IOC containers

---
# Video 9 :
- **Title:** Spring boot: Dynamically Initialized Beans | Value Annotation
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=eZfT5yKm2Xg&list=PL6W8uoQQ2c60g6_fcjDCLHSx1LBeVYqyZ&index=9)

## Topics Covered
- @Qualifier breaks dependency inversion principle
- Solution
  - using bean based on user input
  - Using @Configuration+@Bean and @Value to create bean dynamically

---
# Video 10 :
- **Title:** Spring boot @ConditionalOnProperty Annotation
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=HN-IX8Rl8Do&list=PL6W8uoQQ2c60g6_fcjDCLHSx1LBeVYqyZ&index=10)

## Topics Covered
- bean creation based on value of property available in config using @ConditionalOnProperty
- similar kind of other conditional annotations also available and we can create custom also

---
# Video 11 :
- **Title:** Spring boot @Profile annotation | How Profiling works in Spring boot
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=czkTdFHHz_4&list=PL6W8uoQQ2c60g6_fcjDCLHSx1LBeVYqyZ&index=11)

## Topics Covered
- application-{profile}.properties file for different profiles
- activate profile using {spring.profiles.active}
- set active profile during application build dynamically
- @Profile annotation
- multiple profiles can be set at the same time, last one will be prioritized
- spring boot loads properties in active profiles order, and it will override values according to order
  - default profile -> active01 profile -> active02 profile ...

---
# Video 12 :
- **Title:** Spring boot AOP (Aspect Oriented Programming)
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=HhsAw8GVogQ&list=PL6W8uoQQ2c60g6_fcjDCLHSx1LBeVYqyZ&index=12)

## Topics Covered
- Advantage of AOP
- Pointcut Expression
  - execution
    - use of (*) and (..) in Pointcut Expression
  - within
  - @within
  - @annotation
  - args
  - @args
  - target
- combining pointcuts using && and ||
- Named Pointcuts
- Advice
  - @Before
  - @After
  - @Around
- Aspect/Pointcut processing flow in Spring during application startup

---
# Video 13 :
- **Title:** Spring boot @Transactional Annotation - Part1
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=Kf-gAW8hGQA&list=PL6W8uoQQ2c60g6_fcjDCLHSx1LBeVYqyZ&index=13)

## Topics Covered
- ACID Properties
- @EnableTransactionalManagement (optional , spring boot automatically configure it)
- Transaction Management in Spring Boot use AOP
  - target methods and classes with @Transactional using @within Pointcut Expression
  - apply @Around advice on methods which satisfied Pointcut Expression
  - Commit and Rollback logic available in Advice method

---
# Video 14 :
- **Title:** Spring boot @Transactional Annotation - Part2 | Declarative, Programmatic Approach and Propagation
- **URL:** [Watch on YouTube](https://www.youtube.com/watch?v=u4kRFypRmHA&list=PL6W8uoQQ2c60g6_fcjDCLHSx1LBeVYqyZ&index=14)

## Topics Covered
- TransactionManager Hierarchy
- Ways to do transaction management
  - Declarative
  - Programmatic
- Transaction Propagation
  - REQUIRED
  - REQUIRES_NEW
  - SUPPORTS
  - NOT_SUPPORTED
  - MANDATORY
  - NEVER
  - NESTED (not supported by all jpa)
- Transaction Isolation
  - READ_UNCOMMITED
  - READ_COMMITED
  - REPEATABLE_READ
  - SERIALIZATION

---
# Video 15 :
- **Title:** Spring boot @Transactional Annotation - Part3 | Isolation Level and its different types
- **URL:** [Watch on YouTube](https://youtu.be/W1YSG-MrX1c?si=aOodV7kli01k-kBh)

## Topics Covered
- Transaction Isolation
    - READ_UNCOMMITED
    - READ_COMMITED
    - REPEATABLE_READ
    - SERIALIZATION

---
# Video 16 :
- **Title:** Spring boot @Async Annotation - Part1 | ThreadPoolExecutor
- **URL:** [Watch on YouTube](https://youtu.be/1qf5yqfInzY?si=PxwbA0WIEwC4HJia)

## Topics Covered
- SimpleAsyncTaskExecuter
- ThreadPoolTaskExecuter vs ThreadPoolExecuter
- Execution Pool Selection
  - if no bean present it will create default ThreadPoolTaskExecuter bean
  - create custom ThreadPoolTaskExecuter Bean, it will set it default
  - create custom ThreadPoolExecuter Bean but don't pass so it will use SimpleAsyncTaskExecuter and if pass it will use that
- 

---
# Video 17 :
- **Title:** Spring boot @Async Annotation - Part2 | Async Annotation Important Interview questions
- **URL:** [Watch on YouTube](https://youtu.be/xADtTuyLyYM?si=OEhKyqzoSEAi4KXn)

## Topics Covered
- Limitations of @Async due to AOP
- issues with Transaction management during @Async
- return Future and CompletableFuture from @Async methods
- Exception Handling of @async method
  - when method return something, handle where we are fetching result
  - when return type is Void
    - use try catch
    - Implement AsyncUncaughtExceptionHandler

---
# Video 43 :
- **Title:** Spring boot Actuator in depth
- **URL:** [Watch on YouTube](https://youtu.be/mnISCe3HL2E?si=_bAzeKKhv9f8Dphl)

## Topics Covered
- change actuator endpoint
- expose specific or all actuator endpoints
- /metrics and /metrics/** endpoint to check application metrics 
- /health endpoint
- customise /health endpoint status based on status of no. of services 
- customise /health endpoint, show status of no. of services and show /health endpoint status based on status of no. of services
- /mappings, /beans, /threaddump, /env, /env/**
- expose /shutdown and /heapdump endpoint (not activated via *)
- custom actuator endpoint using @Endpoint
- @ReadOperation (GET), @WriteOperation (POST), @DeleteOperation (DELETE)
- Custom Actuator endpoints cannot consume JSON reliably:
  - Actuator’s custom endpoints use a very lightweight serialization system, not the full Spring MVC engine.
  - If you need complex / nested JSON, validation, headers, auth, etc., you should use a regular Spring MVC controller instead of a custom Actuator endpoint.

---
# Video 44 :
- **Title:** Spring Boot: ConfigurationProperties in-depth
- **URL:** [Watch on YouTube](https://youtu.be/8IoR4AGf8xc?si=fGKa_2koTEBNu3-J)

## Topics Covered
- access configuration using @ConfigurationProperties