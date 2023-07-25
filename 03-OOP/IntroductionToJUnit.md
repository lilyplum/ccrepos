# Introduction to JUnit

JUnit is a unit testing framework for most languages on JVM (Java, Kotlin, Groovy). For testing our Java programs, we
will use the latest version, JUnit 5.

Note, that during your studies, when you are looking for any information on the internet, it is easy to encounter JUnit4
examples, please be aware of using JUnit5. Some organizations still use it for unit testing, but most of them have
already migrated their tests to JUnit 5. If you are interested to read more about the differences and the migration
process, [click here](https://www.baeldung.com/junit-5-migration).

## JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

JUnit 5 is composed of several modules:

* The JUnit Platform serves as a foundation for launching testing frameworks on the JVM.
* JUnit Jupiter contains the tools for writing tests and extensions in JUnit 5.
    * When you will write your unit tests, you will have to import from this package. For example: import static
      org.junit.jupiter.api.Assertions.assertEquals;
* JUnit Vintage provides a TestEngine for running JUnit 3 and JUnit 4 based tests on the platform. It requires JUnit
  4.12 or later to be present on the class path or module path.

## Getting started

In order to use JUnit Jupiter, you will need to include it as a dependency in your pom.xml. Find the latest, most used
version on [Maven Repository](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api) website.

Example dependency:

```xml

<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.9.0</version>
    </dependency>
</dependencies>
```

Note: Make sure your Maven version is matching with your Java version!

### Writing your first tests

```java
import static org.junit.jupiter.api.Assertions.assertEquals;

import example.util.Calculator;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(4, calculator.add(2, 2));
    }

}
```

In order to run this test case, we need a Calculator class for that with an add() function, but you don't need to create
it, we use this test only for the example. Let's break it down a little bit, especially the assertEquals(4,
calculator.add(2, 2)); line. Let's see what the assertEquals means.

### Assertions

Assert is a method useful in determining Pass or Fail status of a test case, The assert methods are provided by the
class org.junit.Assert which extends java.lang.Object class.

* assertEquals: Use this if you want to test the equality of two objects.
* assertArrayEquals: The assertArrayEquals assertion verifies that the expected and the actual arrays are equal.
* assertTrue and assertFalse: If you want to test the boolean conditions (true or false), you can use these methods.
* assertNull and assertNotNull: When we want to assert that an object is not null we can use the assertNotNull
  assertion,
  in the opposite way, we can use the assertNull assertion to check if the actual is null.

These are the most common assertions that you will use in the future, if you are interested in the rest of them, you can
read them [here](https://www.baeldung.com/junit-assertions#assertions-junit5).

Since we learned what the assertions are, let's see what is that strange @Test part at the beginning of our example test
case.

Annotations
JUnit Annotations are a special form of syntactic meta-data that can be added to Java source code for better code
readability and structure. Let's dig through the most common annotations.

* @Test: This annotation denotes that a method is a test method. Note this annotation does not take any attributes.
* @BeforeAll: This annotation executes a method before all tests.
* @AfterAll: The @AfterAll annotation is used to execute the annotated method, only after all tests have been executed.
* @BeforeEach: The @BeforeEach annotation denotes that the annotated method should be executed before each test method.
* @AfterEach: This annotation denotes that the annotated method should be executed after each test method.

After we learned what Annotations and Assertions are, you are free to go to write your first own test!