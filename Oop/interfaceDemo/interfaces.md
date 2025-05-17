## Interfaces in Java

### What is an Interface?

An **interface** in Java is a blueprint of a class. It is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. The methods in an interface are abstract by default, meaning they do not have a body and must be implemented by the classes that use the interface.

### Key Characteristics of Interfaces:
1. **Abstract Methods**: All methods in an interface are implicitly `public` and `abstract` (except default and static methods).
2. **No Instance Variables**: Interfaces cannot have instance variables, but they can have `public static final` constants.
3. **Multiple Inheritance**: A class can implement multiple interfaces, allowing Java to achieve multiple inheritance.
4. **Default and Static Methods**: Interfaces can have `default` methods (with a body) and `static` methods (introduced in Java 8).
5. **No Constructors**: Interfaces cannot have constructors because they cannot be instantiated.

### Why Use Interfaces?

1. **Achieving Abstraction**: Interfaces allow you to define a contract for what a class should do, without specifying how it should do it.
2. **Multiple Inheritance**: Since Java does not support multiple inheritance with classes, interfaces provide a way to achieve it.
3. **Loose Coupling**: Interfaces help in designing loosely coupled systems by separating the definition of behavior from its implementation.
4. **Polymorphism**: Interfaces allow objects to be referenced by their interface type, enabling polymorphic behavior.

### How to Define and Use an Interface

#### Defining an Interface:
An interface is defined using the `interface` keyword.

```java
public interface Animal {
    void eat(); // Abstract method
    void sleep(); // Abstract method
}
```

Implementing an Interface:
A class implements an interface using the implements keyword and must provide implementations for all abstract methods.
```java
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}
```