# 🧠 Polymorphism in Java (Super Simple Guide)

---

## 🚀 What is Polymorphism?

> **Polymorphism** means **"many forms"**.  
In Java, it lets you use **the same method name** but **do different things** depending on the object.

✅ You write one method, but it behaves **differently** for different objects.

---

## 🧩 Real-Life Analogy

Imagine you have a **remote** with a button labeled "Start".

- If it's a **TV**, it starts a show 📺
- If it's a **Fan**, it starts spinning 🌪️
- If it's a **Washing Machine**, it starts washing 🧺

➡️ **Same button** → **Different behavior** = Polymorphism!

---

# 🧬 Types of Polymorphism in Java

---

## 1️⃣ Compile-Time Polymorphism (Method Overloading)

> Same method name, but **different parameters** (in the same class).

### ✅ Example:
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));       // Output: 30
        System.out.println(c.add(5, 10, 15));    // Output: 30
    }
}
``` 

### 🧠 Key Point:
Method is resolved at **compile time** based on parameters.

---

## 2️⃣ Runtime Polymorphism (Method Overriding)

> A child class overrides a method of the parent class.

---

### ✅ Example:
```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // Parent reference, child object
        a.sound();             // Calls Dog's sound()
    }
}
``` 

## Output
#### Dog barks

---
### How Does Java know Which method to choose in method Overriding??

--> This process is known as "Dynamic Method Dispatch" & this is why this method is known as dynamic polymorphism

--> So in this the call to a method is resolved at the runtime rather than at the compile time 

---
#### * A SuperClass reference variable can refer to a SubClass Object!!

---
### Note* Every Class Extends the Object class which basically means the object class is the topmost superclass.

---
#### Static methods cannot be Overridden but can be Inherited
#### Override depends on objects & Static doesn't depend on objects hence static can't be overridden

--- 
#### Final keyword in methods can provide a performance enhancement coz the compiler knows that this cannot be overridden
Since Final resolves at compile time it is known as *Early Binding* and during the runtime is known as *Late Binding*

Also, final can be used to prevent *Inheritance*. When a class is declared final then it implicitly declares all of it's *methods* as *final* too.
