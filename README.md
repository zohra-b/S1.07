
<p align="center"><h1 align="center">S1.07. Annotations </h1></p>

<br>

---

## 📍 Objectives

Learn how Java annotations work.
---

## 👾 Exercises
### 📌 Level 1

### 📌 Level 1 - ex 1
Create an object hierarchy with three classes: Worker, Online Worker and Face-to-face Worker.
The Worker class has the attributes name, surname, price/hour, and the calculateSalary() method that receives the number of hours worked as a parameter and multiplies it by the price/hour. Child classes must override it, using @Override.
From the main() of the Main class, make the necessary invocations to demonstrate the operation of the @Override annotation.
For face-to-face workers, the method to calculate their salary will receive the number of hours worked per month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the price/hour, plus the value of a static attribute called gasoline that we will add to this class.
For online workers, the method to calculate their salary will receive the number of hours worked per month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the price/hour and the price of the flat Internet rate will be added, which will be a constant of the TreballadorOnline class.### 📌 Level 1 - ex 2
Create a class called Person with the attributes first name, last name and age. Then create a class called GenericMethods with a generic method that accepts three arguments of generic type. This method should only print the arguments it has received to the screen. In the main() of the main class, call the generic method with different types of parameters.
Example: an object of the Person class, a String and a primitive type.
In this way you have verified that any type of parameter can be passed to it and in any order.
### 📌 Level 1 - ex 2
Add some obsolete methods to the child classes (deprecated), and use the corresponding annotation. Invoke the obsolete methods from an external class, suppressing the “warnings” for being obsolete using the corresponding annotation.

### 📌 Level 2 

### 📌 Level 2 - ex 1
Create a custom annotation that should allow serializing a Java object into a JSON file. The annotation should receive the directory where the resulting file will be placed.



---
## 🚀 Getting Started

### ☑️ Prerequisites

Before getting started with S1.07, ensure your runtime environment meets the following requirements:

- **Programming Language:** Java 23SE
- IntelliJ or Eclipse IDE (with Maven)


### ⚙️ Installation

Clone the S1.07 repository:
```sh
❯ git clone https://github.com/zohra-b/S1.07
```
