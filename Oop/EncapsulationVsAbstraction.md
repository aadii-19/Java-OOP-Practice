# 🔐 Encapsulation vs 🧊 Abstraction in Java

---

## 🔐 Encapsulation

### 📖 Definition:
Encapsulation is the process of **wrapping data (variables) and code (methods)** together into a single unit (class), and **restricting access** to the inner details of that class.

---

### ✅ Achieved By:
- Declaring variables as `private`
- Providing `public` getter and setter methods

---

### 📦 Example: Bank Account

```java
class BankAccount {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0) balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
```

---

## 🟢 Output:

    Balance: 1000

---

## 🧠 Key Points:
    balance is hidden from direct access using private

    User interacts only through methods like deposit() and getBalance()

    Prevents unauthorized changes

    Gives control over data

---

## 🧊 Abstraction

### 📖 Definition:
Abstraction means hiding complex internal logic and exposing only the necessary features to the user.

### ✅ Achieved By:
    Using abstract classes

    Using interfaces

---
### Example : Animal Sound
```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // Calls Dog's version
    }
}

// Output : Bark

```
---
Table

| Feature             | Encapsulation 🔐           | Abstraction 🧊                   |
|---------------------|-----------------------------|----------------------------------|
| 📌 Purpose          | Hide internal **data**      | Hide internal **logic**          |
| 🎯 Goal             | Protect the object          | Simplify system design           |
| 🔧 How Achieved     | `private` fields + methods  | `abstract` classes / interfaces  |
| 🔍 Focus            | **Access control**          | **Complexity hiding**            |
| 💡 Real-World Use   | Hide balance in BankAccount | Abstract sound in Animal         |
| 💬 Output Example   | `Balance: 1000`             | `Bark`                           |
