# General enterprise questions

## Software engineering

### Architectures

#### What is n-tier (or multi-tier) architecture?
N-tier architecture, also known as multi-tier architecture, is a client-server architecture where the application is divided into multiple logical layers or tiers, each responsible for a specific set of tasks.

#### What are microservices? Advantages and disadvantages?
Microservices are a software development approach where an application is built as a collection of small, independent services, each running its own process and communicating with each other through lightweight mechanisms like HTTP or messaging protocols. The advantages of microservices include scalability, flexibility, and the ability to adopt new technologies. The disadvantages include increased complexity, the need for a robust infrastructure, and potential communication overhead.

#### What is Separation of Concerns?
Separation of concerns is a design principle that suggests dividing a software system into distinct sections, each addressing a separate concern. This approach helps to improve the maintainability, scalability, and flexibility of the system.

#### What is a layered design and why is it important in enterprise applications?
Layered design is a software architecture pattern that organizes the system into horizontal layers, with each layer providing services to the layer above it and consuming services from the layer below it. This approach helps to improve the modularity, scalability, and maintainability of large enterprise applications.

#### What is Dependency Injection?
Dependency injection is a design pattern that allows the creation of objects with their dependencies supplied from outside the object. This approach helps to decouple the components of a system, making it easier to test and maintain the code.

#### What is the DAO pattern? When and how to implement?
The DAO pattern (Data Access Object) is a design pattern that separates the data persistence logic from the business logic of an application. This pattern provides a way to encapsulate the details of the data storage mechanism and allows for easier maintenance, testing, and scalability.

#### What is SOA? When to use?
Service-Oriented Architecture (SOA) is an architectural style that aims to create loosely coupled, reusable, and interoperable services that can be combined to create complex business processes. SOA is typically used in large-scale enterprise systems to improve agility and flexibility. It is recommended to use SOA when the system requires the integration of multiple applications or services, or when there is a need for flexibility and agility in the system.

### Testing

#### What are unit test, integration test, system test, regression test, acceptance test? What is the major difference between these?
- Unit test: Tests individual units or components of a system in isolation from other parts of the system.
- Integration test: Tests how individual units or components of a system work together and interact with each other.
- System test: Tests the complete system as a whole to verify that it meets the requirements and works as expected.
- Regression test: Tests to ensure that changes in the system do not introduce new defects or break existing functionality.
- Acceptance test: Tests to verify that the system meets the requirements and is ready for delivery to the customer.

The major difference between these types of tests is the scope of the system being tested and the purpose of the testing

#### What is code coverage? Why is it used? How you can measure?
Code coverage is a metric that measures the percentage of code that has been executed during testing. It is used to determine the effectiveness of a test suite in terms of how well it exercises the codebase and identifies areas that may require further testing. Code coverage can be measured using automated testing tools that track which lines of code are executed during test runs.

#### What does mocking mean? How would you do it 'manually' (i.e. without using any fancy framework)?
Mocking is a technique used in testing to replace a real object with a simulated object that can be controlled and manipulated during testing. This allows developers to isolate the behavior of individual components and test them in isolation. To do it manually, you can create a test double, which is a simplified version of the real object that mimics its behavior. For example, you can create a mock object for a database connection that returns predefined data instead of accessing a real database.

#### What is a test case? What is an assertion? Give examples!
A test case is a set of conditions or inputs that are used to test a specific aspect of a system's functionality. An assertion is a statement that checks whether a certain condition is met during testing. For example, a test case for a login page might include entering a valid username and password and asserting that the user is directed to the correct page. An assertion for this test case might be checking that the page URL contains the expected string.

#### What is TDD? What are the benefits?
Test-Driven Development (TDD) is a software development approach where developers write automated tests before writing the actual code. The benefits of TDD include improved code quality, faster feedback on defects, better maintainability, and reduced time spent on debugging.

#### What are the unit testing best practices? (e.g. how many assertion should a test case contain?)
Some best practices for unit testing include testing individual units in isolation, using descriptive test names, running tests frequently, and testing all possible code paths. The number of assertions in a test case should be kept to a minimum and should focus on testing a single aspect of the system's functionality. A good rule of thumb is to have one assertion per test case.

#### What is arrange/act/assert pattern?
The arrange/act/assert pattern is a software testing technique used to structure unit tests. It involves three steps:

Arrange: setting up the test by initializing any necessary objects or data.
Act: performing the actual action or operation being tested.
Assert: checking the results of the action against expected outcomes.
By following this pattern, developers can create more organized and effective unit tests that are easier to read and maintain.

### DevOps

#### What is continuous integration? Why is CI important?
Continuous Integration (CI) is the practice of frequently integrating small code changes into a shared repository, enabling early detection of integration issues. CI helps to reduce risks and costs associated with software development by automating the build and testing process, and by ensuring that the codebase is always in a working state.


#### Why are tests important in the CI workflow?
Tests are an essential part of the CI workflow because they ensure that each code change is thoroughly tested before it is integrated into the codebase. Automated tests enable developers to catch issues early and prevent them from being introduced into production, reducing the likelihood of bugs and errors.

#### Name some software that help the CI workflow!
Some examples of software that can help with the CI workflow include Jenkins, Travis CI, CircleCI, GitLab CI/CD, and TeamCity.

#### What is Continuous Delivery?
Continuous Delivery (CD) is the practice of continuously deploying software changes to production environments in a safe and reliable way. CD requires an automated deployment pipeline, where changes are automatically built, tested, and deployed to production with minimal manual intervention.

#### What is Continuous Deployment?
Continuous Deployment (CD) is the practice of automatically deploying every code change to production environments, without any manual intervention. Continuous Deployment is a step beyond Continuous Delivery, which requires human approval before deploying to production.

#### What is DevOps?
DevOps is a software development approach that combines software development (Dev) with IT operations (Ops) to improve collaboration and communication between development teams and operations teams. The goal of DevOps is to deliver software more rapidly and reliably, while maintaining high quality and stability.

### Software Methodologies

#### What kind of software-lifecycle models do you know?
Some examples of software-lifecycle models include Waterfall, Agile, Scrum, Kanban, and Lean.

#### What is a UML diagram? What kind of diagram types do you know?
UML (Unified Modeling Language) is a visual modeling language used to design and document software systems. There are several types of UML diagrams, including use case diagrams, class diagrams, activity diagrams, sequence diagrams, and state diagrams.

#### What is a UML class diagram? What are the typical elements?
A UML class diagram is a type of UML diagram that shows the static structure of a system by modeling its classes, attributes, methods, and relationships. Typical elements of a class diagram include classes, interfaces, associations, attributes, operations, and multiplicity.

#### What kind of design patterns do you know? Bring at least 3 examples.
Some examples of design patterns include the Singleton pattern, the Factory pattern, the Observer pattern, the Decorator pattern, and the Strategy pattern.

#### What is the purpose of the Iterator Pattern?
The Iterator Pattern is a design pattern that provides a way to access the elements of an aggregate object sequentially, without exposing the underlying representation of the object. The Iterator Pattern separates the traversal of an object from its data representation, making it easier to iterate over complex data structures.

#### What do you know about the SOLID principles?
The SOLID principles are a set of five design principles that are used to develop robust, scalable, and maintainable software systems. The principles are: Single Responsibility Principle, Open/Closed Principle, Liskov Substitution Principle, Interface Segregation Principle, and Dependency Inversion Principle.

#### How would you separate data storage code and business logic code (which uses stored data) in an application?
One approach to separate data storage code and business logic code in an application is to use a layered architecture. This involves dividing the application into different layers, where each layer has a specific responsibility. The data storage code can be placed in a separate layer, such as the data access layer, while the business logic code can be placed in a separate layer, such as the business logic layer. The layers can communicate with each other through well-defined interfaces, which help to ensure that the responsibilities of each layer remain separated.

---------------------------------

## Computer science

### Data Structures
#### What is the difference between Stack and Queue data structure?
A stack is a data structure that follows the Last-In-First-Out (LIFO) principle, where the last element added to the stack is the first one to be removed. A queue, on the other hand, follows the First-In-First-Out (FIFO) principle, where the first element added to the queue is the first one to be removed.

#### What is a graph? What are simple graphs? What are directed graphs? What are weighted graphs?
A graph is a data structure consisting of a set of vertices/nodes and a set of edges connecting them. Simple graphs are graphs that do not have any self-loops or multiple edges between two vertices. Directed graphs are graphs where each edge has a direction associated with it, indicating the direction in which it can be traversed. Weighted graphs are graphs where each edge has a weight or cost associated with it, indicating the cost of traversing that edge.

#### What are trees? What are binary trees? What are binary search trees?
A tree is a data structure consisting of a set of nodes connected by edges, where there is a single node called the root and every other node has exactly one parent, except the root. Binary trees are trees where each node has at most two children. Binary search trees are binary trees where the left subtree of a node contains only nodes with values less than the node's value, and the right subtree contains only nodes with values greater than the node's value. This property allows for efficient searching, insertion, and deletion of nodes.

#### How can you store graphs in programs? What are the advantages/disadvantages per each?
Graphs can be stored in programs using various data structures such as adjacency matrices, adjacency lists, and edge lists. Adjacency matrices store the graph as a matrix, where each element represents an edge between two nodes. Adjacency lists store the graph as a list of linked lists, where each node has a list of its adjacent nodes. Edge lists store the graph as a list of edges, where each edge has its associated vertices and weight (if applicable). The choice of data structure depends on the operations that need to be performed on the graph. Adjacency matrices are good for checking whether two nodes are adjacent, but can be memory-intensive for sparse graphs. Adjacency lists are memory-efficient for sparse graphs, but can be slower for certain operations. Edge lists are good for sorting and filtering edges, but can be slower for other operations.

#### What are graph traversal algorithms? What is BFS, how does it work? What is DFS, how does it work?
Graph traversal algorithms are used to visit all the vertices of a graph. Breadth-First Search (BFS) and Depth-First Search (DFS) are two commonly used graph traversal algorithms.

BFS starts at a specified vertex and visits all the vertices in the graph that are at the same distance from the starting vertex before moving to vertices that are further away. It uses a queue data structure to keep track of the vertices to be visited next.

DFS, on the other hand, explores as far as possible along each branch before backtracking. It uses a stack data structure to keep track of the vertices to be visited next.

#### How does dictionary work?
A dictionary is a data structure that stores a collection of key-value pairs. The key is used to retrieve the corresponding value from the dictionary. When a value is added to a dictionary, it is associated with a key that uniquely identifies it. When a value is retrieved from a dictionary, the key is used to find the corresponding value.

Dictionaries are commonly implemented as hash tables, which use a hash function to map keys to indices in an array. The value is then stored at the corresponding index.

#### Why is it important for keys in a hashmap to have an immutable type? (Consider string for example.)
Hashmaps use the hash code of the key to determine the index where the value is stored in the underlying array. If the key is mutable, its hash code may change, which would cause the key-value pair to become disassociated from its original index. This can lead to unexpected behavior, such as not being able to retrieve a value that was previously added to the hashmap.

Strings are commonly used as keys in hashmaps because they are immutable, meaning their value cannot be changed once they are created. This ensures that the hash code of a string key will remain the same, which is necessary for the key-value pair to be retrieved from the hashmap correctly.

### Algorithms
#### What is QuickSort? Describe the main logic of this sorting algorithm.
QuickSort is a divide-and-conquer sorting algorithm that works by selecting a pivot element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.

The main logic of QuickSort is as follows:

Choose a pivot element from the array.
Partition the other elements into two sub-arrays, according to whether they are less than or greater than the pivot.
Recursively sort the sub-arrays by repeating steps 1 and 2.
The base case of the recursion is an empty or single-element array, which is already sorted.

---------------------------------

## Software design

### Security

#### What is OAuth2?
OAuth2 is an authorization framework that allows third-party applications to access the resources of a user without needing to know the user's credentials. It provides a secure and standardized way for users to grant access to their resources on one website to another website, without sharing their password.

#### What is Basic Authentication?
Basic Authentication is a simple authentication scheme that allows a client to send a username and password to a server in an HTTP header for each request. The username and password are encoded in base64 format, but this encoding is not secure and should only be used over a secure connection like HTTPS.

#### What is CORS, why it’s needed in browsers?
CORS (Cross-Origin Resource Sharing) is a mechanism that allows a web page to make XMLHttpRequests to another domain, which would otherwise be prohibited by the Same-Origin Policy enforced by web browsers. CORS is needed in browsers because it enables web applications to interact with resources from different origins, while still maintaining a high level of security.

#### How can you initialize a CSRF attack?
A CSRF (Cross-Site Request Forgery) attack can be initialized by tricking a user into clicking a link or visiting a webpage that contains malicious code. The code will then send a request to a vulnerable website on behalf of the user, potentially causing unintended actions to occur.

#### What is JWT used for? Where to store it on client side?
JWT (JSON Web Token) is a compact and self-contained way of securely transmitting information between parties as a JSON object. JWTs are often used for authentication and authorization purposes. On the client side, JWTs can be stored in local storage, session storage, or cookies, but it is important to consider security implications and potential vulnerabilities.

### Threaded programming

#### When do you need to use threads in an application?
Threads are useful in applications when there are tasks that can be executed concurrently without blocking other tasks or the user interface. Examples include downloading files, processing large amounts of data, or performing background tasks while the user interacts with the application.

#### What is a daemon thread?
A daemon thread is a thread that runs in the background, providing services to other threads or the application as a whole. Unlike user threads, daemon threads do not prevent the application from exiting if there are no other user threads running.

#### What is the difference between concurrent and parallel execution of code?
Concurrent execution means that multiple tasks are being executed in overlapping time periods, but not necessarily simultaneously. Parallel execution means that multiple tasks are being executed at the same time, such as on multiple CPU cores.

#### What is the most important problem developers are faced when using threads?
The most important problem developers face when using threads is the risk of race conditions and deadlocks, which can cause unexpected behavior, crashes, or security vulnerabilities.

#### In what kind of situations can deadlocks occur?
Deadlocks can occur when two or more threads are blocked, each waiting for a resource that the other thread holds. This can happen when resources are not released properly or when threads are blocked for a long time.

#### What are possible ways to prevent deadlocks from occurring?
Possible ways to prevent deadlocks include implementing proper locking protocols, avoiding circular dependencies, using timeouts, and reducing the number of locks used.

#### What does critical section or critical region mean in the context of concurrent programming?
A critical section or critical region is a section of code that requires mutual exclusion, meaning that only one thread can execute the code at a time. This is typically achieved through the use of locks or other synchronization mechanisms to prevent race conditions and ensure thread safety.
