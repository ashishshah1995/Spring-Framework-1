# Spring-Framework-1

In this project I created Java project using Annotations and Java Code configuration
Java Spring using Annotations and Java source code configuration

# Annotations
 They arespecial labesls/markers added to java classes, provide meta-data about class, they can be processed at compile time or 
runtime

## Development process
1- Enable component scanning in Spring config file
2- Add the @Component Annotations to your java class
3- retrieve bean from spring container


In above step 2 instead of adding bean in component, spring supports default bean ids - eg class name is TennisCoach then default bean id will be tennisCoach(Will take 1st letter of class and make it lowercase)

Depending injection with dependency and autowiring
Autowring-  4 dependency injectionn, spring can use auto wiring. Spring will look for a class that matches the property(matches by type : class or interface). Spring will iinject it automatically and hence autowiring

Autowiring imjection types
1- Constructor injection
2- Setter injection
3- Field Injection

Development process for constructor injection 
1- define the depedency interface and class
2-create a costructor in your class for injections
3- configure the depedency injection with @Autowired Annotation
 
Field injection- Inject dependenceis by setting field values on class directly- accomplish by using java reflection
Development process -
1- configure the dependency injection with autowired annotation applied directly to the field
- no need for setter method

Multiple fortuneService implementation then which one spring will pick? (1 interface - many class which implements it)
To resolve - We have to give a unique / sepcific bean using annotation(@Qualifier)
Use bean id which is same name as class in Qualifier

Bean Scope with Annotations
@Scope("singleton")

LIFECYCLE
@PostConstruct- This code will execute after the bean is being constructed
@PreDestroy- Before your beans destroy

# Spring Configuration using JAVA CODE
- There is no requiremet for XML

## Development process-
1- Create java class and annotate as @Configuration
2- add component scanning support : @ComponentScan(optional)
3- Read Spring Java configuration class
4- Retrieve bean from spring container

## Create bean with java configuration - (Not suing @ComponentScan as we define each bean individually)
1- define method to expose bean
2-inject bean dependencies
3- read sping configuration class
4- retrieve bean from spring container

## Inject value from property file
Steps
1- creating prop file
2- load properties file in spring config
3- refrence values from properties file
