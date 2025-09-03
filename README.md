# Spring Boot From Basics to Advanced (Shrayansh Jain)

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
    - proxyMode with request scope
  - Session
    - default initialisation - Lazy
  - Application
    - one object per IOC

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

---