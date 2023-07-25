# Introduction to Java Interfaces
## About Inheritance
In this chapter, we will examine one way of using Inheritance in Java, and how we do that using interfaces. Inheritance is a good way to organize our code and collect certain characteristics (like methods and fields) that we want to apply to multiple other classes.

## Introduction to Interfaces
Let's say we have a Cat class and these cats can meow in our application.
```java
public class Cat {
    public String meow(){
        return "meow";
    }
}
```
In the main method, we will instantiate a few cats and make them meow.
```java
public static void main(String[] args) {
    Cat tricky = new Cat();
    Cat whiskers = new Cat();

    System.out.println(tricky.meow());
    System.out.println(whiskers.meow());
}
```
But our friend Robi prefers dogs, we want to include him, so we will also create a Dog class. The dogs will not meow, but they can bark!
```java
public class Dog {
    public String bark(){
        return "woof";
    }
}
```
We add a few dogs into the main method to make him happy!
```java
public static void main(String[] args) {
    Cat tricky = new Cat();
    Cat whiskers = new Cat();
    Dog max = new Dog();
    Dog clifford = new Dog();

    System.out.println(tricky.meow());
    System.out.println(whiskers.meow());
    System.out.println(max.bark());
    System.out.println(clifford.bark());
}
```
This code would be nicer if we could store all of our animals in a list, so we can keep track of them. That is the first occasion where interfaces will help us. If I make both the Dog and the Cat classes implement an interface, for example, the Pet interface, then we can add them to the same list. Interfaces are great to group multiple classes together and mark them to be similar, so we can handle their instances together later.
```java
public interface Pet{
}

public class Dog implements Pet{
    public String bark(){
        return "woof";
    }
}

public class Cat implements Pet{
    public String meow(){
        return "meow";
    }
}

public static void main(String[] args) {
    Cat tricky = new Cat();
    Cat whiskers = new Cat();
    Dog max = new Dog();
    Dog clifford = new Dog();

    List<Pet> pets = List.of(tricky, whiskers, max, cliffor
    for (Pet pet : pets) {
        if(pet instanceof Cat){
            System.out.println( (Cat)pet.meow() );
        } else if(pet instanceof Dog){
             System.out.println( (Dog)pet.bark() );
        }
    }
}
```
This solution is not the best-looking one, because casting these pets to another class is usually not very safe, but at least it saves us a few lines of code repetition. The Pet interface would be more useful for us if we could also use it to make these animals talk in their own way. For this reason, I will add the method that Cat and Dog have in common and declare it in Pet.

```java
public interface Pet{
    public String talk();
}

public class Dog implements Pet{
    @Override
    public String talk(){
        return "woof";
    }
}

public class Cat implements Pet{
    public String talk(){
        return "meow";
    }
}
```
In interfaces, we only declare the methods, but we do not give them a method body. Their purpose is to function as contracts. If a class implements my interface, it promises to make all the necessary methods work, just as Cat and Dog implement talk() and make it work in their own way. I don't mind that their implementation is different, the important thing is that they can both run the method. Now I can run a loop and call .talk() on each pet, instead of having to call it separately on each Cat or Dog instance.

```java
public static void main(String[] args) {
    Cat tricky = new Cat();
    Cat whiskers = new Cat();
    Dog max = new Dog();
    Dog clifford = new Dog();

    List<Pet> pets = List.of(tricky, whiskers, max, clifford);
    
    for (Pet pet : pets) {
        System.out.println(pet.talk());
    }
}
```
Using interfaces like this will also help in making our application easily extendable. Now if anyone wants to add a new Pet, like a Cow or a Duck, they only have to write their own class and implement Pet with it and the previously written pets list can already accommodate them. If we would have left the version with the casting, then we would also need to modify all of those places with "if else" where we make the pets meow and bark separately.

Another example here might be the USB port on a computer. You can connect any device that uses USB and it will be able to communicate with the computer you plug it into. Hard drives, chargers, keyboards, mouse it doesn't matter which one because they all "implement" the USB "interface" and you'll be able to switch between them freely.

## Interface Segregation
A class implementing an interface must implement all methods from it. When a class is forced to implement methods that are not useful to it, it is wasteful and may produce unexpected bugs if the class does not have the ability to perform those actions.

For example, we have a banking application with two kinds of accounts. With the Basic Account, we have the ability to deposit money and also withdraw from our balance. With the Savings Account, we can only deposit money but we cannot take money out of the account.
```java
public interface MoveMoney{
    public void deposit(int amount);
    public void withdraw(int amount);
}

public class BasicAccount implements MoveMoney{
    private int balance;

    @Override
    public void deposit(int amount){
        this.balance = this.balance + amount;
    }
    
    @Override
    public void withdraw(int amount){
       this.balance = this.balance - amount;
    }
}

public class SavingsAccount implements MoveMoney{
    private int savings;

    @Override
    public void deposit(int amount){
        this.savings = this.savings + amount;
    }
    
    @Override
    public void withdraw(int amount){
       // ??? not allowed
    }
}
```
A class should only implement methods that are needed to fulfill its role. Since a class can implement multiple interfaces at the same time, we have the ability to divide the functionality into smaller parts. We recommend splitting the methods between smaller interfaces so that your classes are only required to implement the ones useful to them. In this example, we can also split the two methods between two interfaces to fix the problem.
```java
public interface WithdrawMoney{
    public void withdraw(int amount);
}

public interface DepositMoney{
    public void deposit(int amount);
}

public class BasicAccount implements DepositMoney, WithdrawMoney{
    private int balance;

    @Override
    public void deposit(int amount){
        this.balance = this.balance + amount;
    }
    
    @Override
    public void withdraw(int amount){
       this.balance = this.balance - amount;
    }
}

public class SavingsAccount implements DepositMoney{
    private int savings;

    @Override
    public void deposit(int amount){
        this.savings = this.savings + amount;
    }
}
```