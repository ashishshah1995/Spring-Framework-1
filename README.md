# Spring-Framework-1

In this project I have created Spring project using Annotations and Java Code configuration

# Running the application

Step 1- Install Tomcat Server and connect it with IDE

Step 2- Adding the Jar files which are in lib folder -

        Right click on Main project -> Properties-> Java Build Path -> Libraries -> Add Jar- Apply

# Annotations

1. They are special labels/markers added to java classes. 
 
2. They provide meta-data about class, 
 
3. They can be processed at compile time or runtime

## Development process

1. Enable component scanning in Spring config file

2. Add the @Component Annotations to your java class

3. Retrieve bean from spring container

## Depending injection with dependency and autowiring

### Autowring
Spring can use auto wiring for dependency injection. Spring will look for a class that matches the property(matches by type : class or interface) and inject it automatically

### Autowiring injection types

1. Constructor injection

2. Setter injection

3. Field Injection

#### Development process for constructor injection 

1. Define the dependency interface and class

2. Create a constructor in your class for injections

3. Configure the depedency injection with @Autowired Annotation
 
### Field injection

1. Inject dependencies by setting field values on class directly, accomplished by using java reflection

If there are Multiple implementation for one interface then use *@Qualifier(bean id)* which iss ame name as class to resolve the issue

### Bean Scope with Annotations

1. @Scope("singleton")

### LIFECYCLE

1. @PostConstruct- This code will execute after the bean is being constructed

2. @PreDestroy- Before your beans destroy

# Spring Configuration using JAVA CODE

## Development process

1. Create java class and annotate as @Configuration

2. Add component scanning support : @ComponentScan(optional)

3. Read Spring Java configuration class

4. Retrieve bean from spring container

## Create bean with java configuration

1. Define method to expose bean

2. Inject bean dependencies

3. Read sping configuration class

4. Retrieve bean from spring container

## Inject value from property file

1. Creating prop file

2. Load properties file in spring config

3. Refrence values from properties file
