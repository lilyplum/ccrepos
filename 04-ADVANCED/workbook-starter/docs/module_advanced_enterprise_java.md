# Enterprise module (Java branch)

### Java Enterprise and Spring

#### What are the possible uses of reflection?
Reflection in Java allows for dynamic examination and modification of classes, interfaces, and objects at runtime. Possible uses of reflection include introspection, gaining access to private fields and methods, creating new objects, and invoking methods dynamically.

#### What is Spring?
Spring is a popular open-source application framework for building enterprise-level Java applications. It provides a comprehensive programming and configuration model for modern Java-based enterprise applications, simplifying development and increasing productivity.

#### What is Spring Boot?
Spring Boot is an extension of the Spring framework that simplifies the process of building and deploying stand-alone, production-ready applications. It comes with a variety of pre-built components and modules that make it easy to configure, build, and run Spring-based applications.

#### What is the major difference between the Standard edition (JSE) and Enterprise edition (JEE)? You can choose Spring (Spring Boot) instead of JavaEE. Focus on comparing them.
The Standard edition (JSE) is a basic platform that provides core functionality for developing standalone applications, while the Enterprise edition (JEE) is a set of specifications for developing large-scale, distributed, multi-tiered applications. Spring (Spring Boot) provides a lightweight, flexible alternative to JEE, offering many of the same features and capabilities while being easier to use and more customizable.

#### What are the advantages of the Spring Framework? Focus on the Core part.
The Spring Framework offers many advantages, including dependency injection, aspect-oriented programming, and robust support for enterprise-level applications. Its core features include lightweight containers, integration with various frameworks and technologies, and support for testing and debugging.

#### What is a servlet? What is the purpose of DispatcherServlet in Spring?
A servlet is a Java class that dynamically generates web content in response to client requests. The DispatcherServlet is a key component of the Spring Framework's web framework, responsible for managing the web request/response cycle and delegating requests to specific handler components.

#### When do you use RestControllers, when just simple Controllers?
RestControllers are used to handle RESTful web service requests, while simple Controllers are used to handle traditional web application requests. RestControllers return data in a format that is easily consumed by other web applications or devices, while simple Controllers return view-based responses that are rendered by the web application.

#### What is Spring Application Context?
The Spring Application Context is a container that manages the lifecycle of Spring beans and provides support for dependency injection and inversion of control. It provides a central registry for configuring and managing all the objects in a Spring-based application, ensuring that they are properly configured and wired together.

#### What are the main ways to define a bean in the Application Context?
The main ways to define a bean in the Spring Application Context are:
XML-based configuration: where beans are defined in an XML file and are managed by the Spring container.
Annotation-based configuration: where beans are defined using Java annotations such as @Component, @Service, @Repository, etc.
Java-based configuration: where beans are defined using Java classes annotated with @Configuration, @Bean, etc.

#### Difference between .jar and .war files.
A .jar file is a Java archive file that contains Java class files, resources, and metadata. It is typically used to package and distribute Java libraries or standalone applications.
A .war file is a web application archive file that contains all the necessary components of a web application, including Java classes, JSP pages, HTML pages, JavaScript files, and other resources. It is typically used to package and deploy web applications to a web server.

#### What are the major differences between Maven, Ant and Gradle?
Maven, Ant, and Gradle are all build automation tools used for compiling, testing, and packaging software applications. The major differences between them are:

Maven is focused on managing dependencies and simplifying project builds through a declarative approach using a Project Object Model (POM) file.
Ant is more flexible and customizable, allowing developers to define build processes using XML files and custom tasks.
Gradle combines the best features of both Maven and Ant, providing a flexible, powerful, and easy-to-use build system that uses Groovy-based scripts.

#### What is Maven used for?
Maven is a build automation tool used for managing dependencies and building software projects. It provides a declarative way to describe a project's build process, including its dependencies, plugins, and other configuration details. Maven uses a Project Object Model (POM) file to define the project structure and build process.

#### What does a pom.xml file contains in Maven?
The pom.xml file in Maven contains information about the project, including its name, version, description, dependencies, build process, and other metadata. It provides a declarative way to define the project structure, configure the build process, and manage dependencies. The pom.xml file is the heart of a Maven project, and it is used by Maven to automate the build process and manage the project's lifecycle.

### Object Relational Mapping, JPA

#### What is an ORM? What are the benefits, when to use?
ORM stands for Object-Relational Mapping, which is a programming technique that maps objects from an object-oriented programming language to relational database tables. The benefits of using an ORM are:
Increased productivity and reduced development time
Simplified database access and management
Reduced development costs and maintenance efforts
Improved application performance
ORMs are useful when dealing with complex data structures and when writing code that needs to interact with a database.

#### What is the difference between JDBC and JPA? Which are the advantages and disadvantages of each? Give a general overview.
JDBC (Java Database Connectivity) is a low-level API for accessing and manipulating relational databases from Java code. It provides a set of classes and interfaces that allow Java applications to interact with databases using SQL queries. JPA (Java Persistence API) is a higher-level API that provides an abstraction layer on top of JDBC, allowing Java developers to interact with databases using Java objects instead of SQL queries. The advantages and disadvantages of each are:
JDBC:
Advantages: Provides direct access to the database, allowing for fine-grained control over SQL queries and database interactions.
Disadvantages: Requires writing a lot of boilerplate code and can be error-prone.
JPA:
Advantages: Provides a high-level API for managing database interactions using Java objects, reducing the amount of boilerplate code required.
Disadvantages: Can hide the underlying SQL queries, making it harder to optimize database performance.

#### What is Hibernate? What are the advantages, limitations?
Hibernate is a popular ORM framework for Java that provides a set of libraries and tools for mapping Java objects to relational databases. The advantages of Hibernate are:
Reduced development time and effort by eliminating the need to write SQL queries
Increased portability and maintainability by abstracting the database layer from the application code
Improved performance through caching and lazy loading of data
The limitations of Hibernate are:
Increased complexity and learning curve compared to JDBC or plain SQL
Potential performance issues due to the overhead of object-relational mapping

#### Name 3 different annotations used in JPA, what can they do for you?
@Entity: Marks a Java class as an entity, which can be persisted in a relational database
@Table: Specifies the name of the database table to which the entity is mapped
@Id: Specifies the primary key field of the entity

#### What is object-relational impedance mismatch?
Object-relational impedance mismatch is a term used to describe the differences between object-oriented programming languages and relational databases. The main issues arise from the differences between how objects and relational data are structured and how they represent relationships between entities. Object-relational impedance mismatch can lead to difficulties in mapping objects to database tables and in maintaining consistency between the two.

#### What is a JpaRepository? What are the 2 main methods to define queries in them?
JpaRepository is an interface provided by Spring Data JPA that extends the CrudRepository interface and provides additional methods for managing JPA entities. The two main methods to define queries in a JpaRepository are:

Method names: Spring Data JPA provides a convention for generating SQL queries based on the names of methods defined in the repository interface.
Query annotations: Spring Data JPA provides a set of annotations that can be used to define custom SQL queries for repository methods.

#### Why is the Set preferred over List when we want to store OneToMany relations?
The Set collection is preferred over the List collection when we want to store OneToMany relations because it ensures that there are no duplicates and maintains the insertion order. In the case of a OneToMany relationship, having duplicates in the collection doesn't make sense, and maintaining the order is not required. Using a Set instead of a List can improve performance by avoiding the overhead of maintaining an ordered list and checking for duplicates.

#### What kind of inheritance strategies are available? Which annotations are used to solve this?
There are four inheritance strategies available in JPA:

Single Table Strategy: where all the classes in the inheritance hierarchy are mapped to a single database table.
Joined Table Strategy: where each class in the inheritance hierarchy is mapped to a separate database table, and a join operation is used to retrieve data from related tables.
Table Per Class Strategy: where each class in the inheritance hierarchy is mapped to a separate database table.
Mapped Superclass Strategy: where the superclass is not mapped to a database table, and the subclasses inherit its attributes and mappings.
To implement these strategies, JPA provides the following annotations:

@Inheritance: to specify the inheritance strategy to use.
@DiscriminatorColumn: to specify the name of the column used to differentiate between the subclasses in the single table strategy.
@DiscriminatorValue: to specify the value used in the discriminator column for a specific subclass.
@PrimaryKeyJoinColumn: to specify the primary key column in the joined table strategy.
@MappedSuperclass: to specify that the class is a mapped superclass and not to be mapped to a database table.
