# beginner-spring-boot

## 1. Set up Main Config
1. Annotate class with `@Configuration`
2. `@Import` the `PrinterConfig`

## 2. Create an implementation of "StringPrinter"
* Let IntelliJ do the work for you
    1. Open StringPrinter interface
    2. Place the text cursor on the interface name in file
    3. Alt + Enter -> Select "Implement Interface"
    4. Name it
    
## 3. Set up Printer Config
1. Annotate class with `@Configuration`
2. Create a `@Bean` that returns your implementation of `StringPrinter`
    * Make sure your method return type is `StringPrinter`

## 4. Set up ExampleComponent to call `stringPrinter.print()`
1. Annotate class with `@Component`
2. Create a constructor that takes in `StringPrinter stringPrinter` as a parameter
3. Add `@Autowire` to the constructor
4. Call `stringPrinter.print()` in the constructor
5. Open MainConfig, add `@ComponentScan(basePackages = {"com.example"})` so your `@Component` is seen by Spring

## 5. Use Spring Boot to initialize the application
1. Open `SpringApplicationRunner`
2. Instantiate a new `SpringApplication`, passing in `MainConfig.class`
3. Call `.setWebEnvironment(false)` on the object
    * This isn't a web project, but Spring Boot defaults to thinking it is
4. Call `.run()`