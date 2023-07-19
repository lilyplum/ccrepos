# software-testing
## Why the heck do we write tests?
Your application is working fine, you have already tested it manually. So what can be the reason to spend quite a lot of time with writing test code? What do you think?

Here you can find some hint (you can stop at "Writing our first test" heading):

https://docs.djangoproject.com/en/1.10/intro/tutorial05/#introducing-automated-testing

Even though it is about testing in Django, the beginning of the documentation is an awesome intruduction to the topic.

## Testing in general
Tests are simple routines that check the operation of your code.

Testing operates at different levels. Some tests might apply to a tiny detail ( does a particular method return values as expected? ) while others examine the overall operation of the software ( does a sequence of user inputs on the site produce the desired result? ).

### Testing methods
* [Black-box testing](https://www.softwaretestingclass.com/what-is-black-box-testing/) **** testing the functionality of the software without knowing it's internal code structure.
* [White-box testing](https://www.softwaretestingclass.com/white-box-testing/) **** testing the software itself with the knowledge of its internal structure. Basically you know the code and write the tests to test the code.

### Levels of testing
![levels of testing](https://www.test-institute.org/test_images/overview_of_Software_testing_levels.png)

You can find these short answers [here](https://stackoverflow.com/questions/520064/what-are-the-differences-between-unit-tests-integration-tests-smoke-tests-and).

* [Unit test](https://www.softwaretestingclass.com/unit-testing-test-case-preparation-guidelines/) Specify and test one point of the contract of single method of a class. This should have a very narrow and well defined scope. Complex dependencies and interactions to the outside world are stubbed or mocked (we will talk about stubbing and mocking later).
* [Integration](https://www.softwaretestingclass.com/what-is-difference-between-unit-testing-and-integration-testing/) test Test the correct inter-operation of multiple subsystems. There is whole spectrum there, from testing integration between two classes to testing integration with the production environment.
* [System test](https://www.softwaretestingclass.com/system-testing-what-why-how/) Test that tests a system as a black box. Dependencies on other systems are often mocked or stubbed during the test (otherwise it would be more of an integration test).
* [Acceptance test](https://www.softwaretestingclass.com/user-acceptance-testing-what-why-how/) Test that a feature or use case is correctly implemented. It is similar to an integration test, but with a focus on the use case to provide rather than on the components involved.

### Types of testing
* [Functional testing vs non Functional testing](https://www.softwaretestingclass.com/functional-testing-vs-non-functional-testing/) **** these are two main umbrella terms of testing. Basically all of the testing types are Functional of non Functional.
* [Smoke test (aka Sanity check)](https://www.softwaretestingclass.com/smoke-testing/) A simple integration test where we just check that when the system under test is invoked it returns normally and does not blow up. It is an analogy with electronics, where the first test occurs when powering up a circuit: if it smokes, it's bad. People claim smoke testing comes from plumbing where smoke is pumped in the system of pipes before it's connected to the water supply. If any smoke comes out, the pipes are not properly sealed. It might be more historically accurate, but I find it is less funny.
* [Regression test](https://www.softwaretestingclass.com/regression-testing-definition/) A test that was written when a bug was fixed. It ensures that this specific bug will not occur again. The full name is "non-regression test". It can also be a test made prior to changing an application to make sure the application provides the same outcome.
* etc. (check out more testing types)
But don't stop here. All of the bullet points are links, check them out. Here is a more detailed explanation about testing:

https://www.softwaretestingclass.com/basic-concepts-of-system-testing-a-beginners-guide/

Also check out the difference between [verification and validation](https://softwaretestingfundamentals.com/verification-vs-validation/). What are we doing with the tests we are writing? Verification or validation?

The point is to know about testing types and be able to say a few sentences about what they are for. You don't have to know every single detail but if a question comes to you on an interview, be able to answer it in 3-4 sentences.

## Code coverage
[Code Coverage](https://stackoverflow.com/questions/195008/what-is-code-coverage-and-how-do-you-measure-it) is a measurement of how many lines/blocks/arcs of your code are executed while the automated tests are running.

Code coverage is collected by using a specialized tool to instrument the binaries to add tracing calls and run a full set of automated tests against the instrumented product. A good tool will give you not only the percentage of the code that is executed, but also will allow you to drill into the data and see exactly which lines of code were executed during particular test.

While code coverage is a good metric of how much testing you are doing, it is not necessarily a good metric of how well you are testing your product. There are other metrics you should use along with code coverage to ensure the quality.

## Usefulness of testing
Keep in mind: you can choose any kind of testing method, it won't be useful if you are using it wrong. For example if you are writing a code coverage test but not checking the results well in your test, the test is worthless. Here are some points without the sake of completeness:

* Never push a failing test to the repository. (Use @Ignore if really necessary.)
* Use separate folder for tests as you might not want to deliver (ie. give to the user) your test along with the production code.
* Give descriptive names to test methods so that you can see what fails easier (note: underscore is allowed in JUnit test method's name)
* Write tests for the error cases and corner cases.
* Check only a single thing in one test method (practically: use 1 assert per test method)
* Use assert (or expected exception) in all of the test methods.
* Use the expected result as the first argument of assertEquals(expected, actual)
* There is no sense of assert if you expect exception