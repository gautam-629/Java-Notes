## 1. Data types
> Two types primitive types and Non-primitive types
1. primitive types refer to the basic data types that are built into the language itself and are used to represent simple values
``` java
1. byte :1 byte
2. short : 2 byte
3. char : 2 byte
4. boolean : 1 byte
5. int :4 byte
6. long : 8 byte
7. float :4 byte
8. double : 8 byte
```
2. Non-primitive types are created by the programmer.These are also called reference types because they refer to an object in memory.
```java
1. String
2. Array
3. Class
4. Object
5. Interface
```
## 2. To overload a method, you need to ensure that the methods have:
1. The same name: The overloaded methods must have the same name.
2. Different parameters: The methods must have different parameter lists, either in terms of the number of parameters, the types of parameters, or both.
```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

```
# 3. Heap Memory and Stack Memory
In short, stack memory is used for method invocations and local variables(**compile time**), while heap memory is used for storing objects and data structures(**run time**). Stack memory is allocated and deallocated automatically and is faster but limited in size.
Heap memory allows for dynamic memory allocation and is slower but larger than stack memory.
![stackandheap](https://res.cloudinary.com/dbvr3bxyv/image/upload/v1684295453/java/headandstack_isct3j.png)

## 4 Array , Multidimensional array and Jagged array
> **Array**

In Java, an array is a data structure used to store a fixed-size sequence of elements of the same type. or
List of items of the same type placed in continguous Memory Location
    
```java
        int nums[]={3,2,4,3};  // static
        int nums[]=new int [4]; 
        for(int value:nums)
        System.out.println(value);
```
> **Multidimensional array**

In Java, a multidimensional array is an array that contains other arrays as its elements
![multidimensional array](https://res.cloudinary.com/dbvr3bxyv/image/upload/v1684295453/java/headandstack_isct3j.png)

``` java
  int nums[][]=new int [3][4];

        // set ramdom value 
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]= (int) (Math.random()*10);
            }
        }
  
        //get value
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        // enhance for loop not required to specify size 
        for(int num[]:nums){
            for(int ele:num){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        
```
> **Jagged array**

A jagged array is an array of arrays, where each sub-array can have a different length.
``` java
 int nums [][]=new int[3][];
        nums[0]=new int[4];
        nums[1]=new int [3];
        nums[2]=new int[5];

        // set ramdom value
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]= (int) (Math.random()*10);
            }
        }
    // get value using Enhance for loop
    for(int num[]:nums){
        for (int ele:num){
             System.out.print(ele + " ");
        }
        System.err.println();
    }
```
## 5. Array of object
```java
package Array;

class Student{
    int rollno;
    String name;
    int marks;
}
public class ArrayOfObject {
       public static void main(String[] args) {
          Student s1=new Student();
          s1.rollno=1;
          s1.name="Binod";
          s1.marks=45;

          Student s2=new Student();
          s2.rollno=1;
          s2.name="Binod";
          s2.marks=45;

          Student s3=new Student();
          s3.rollno=1;
          s3.name="Binod";
          s3.marks=45;
         
          // array of object
          Student students []= new Student[3];
          students[0]=s1;
          students[1]=s2;
          students[2]= s3;

          for(int i=0;i<students.length;i++){
               System.out.println(students[i].name +" : " + students[i].marks);
          }

        // Enhance for loop
        for(Student stu:students){
            System.out.println(stu.name + ": "+ stu.marks);
        }
       }
}

```
## 6. String
1. In Java, the String class is a built-in class that represents a sequence of characters. 
2. **Immutable**: Strings in Java are immutable, which means that once a String object is created, its value cannot be changed. If you perform any operation on a String object, such as concatenation or substring, a new String object is created.

``` java
      String name= new String("navin");
       String s1="Navin";
       String s2="Navin";
       System.out.println(s1==s2);
       name=name + "reddy";

       //Immutable
       name.toUpperCase(); // cannot be change
```
> **In Memory**
![stringMemory](https://res.cloudinary.com/dbvr3bxyv/image/upload/v1684321793/java/string_zubaci.png)

## 7. StringBuffer and StringBuilder.
In Java, both StringBuffer and StringBuilder are classes that provide **mutable** sequences of characters. They are designed for efficient **string manipulation** when you need to modify the contents of a string frequently.
> **The main difference between them lies in their synchronization behavior**
1. **StringBuffer** is a thread-safe class, which means it provides built-in synchronization to ensure multiple threads can safely access and modify its contents concurrently.
``` java
StringBuffer sb = new StringBuffer("Hello");
sb.append(", World!"); // Modifying the StringBuffer object
System.out.println(sb.toString()); // Output: Hello, World!

StringBuffer sb = new StringBuffer("Hello");
sb.append(", World!"); // Modifying the StringBuffer object
System.out.println(sb.toString()); // Output: Hello, World!
```

## 8. Static variable, Static scope and Static method.

> **Static variable**

Static variables, also known as **class variables**, are shared among all instances of a class. Each instance does not have its own copy of a static variable; instead, they all share the same memory location.

``` java
package staticKeyword;

public class Demo {
   static int count;

   public void incrementCount(){
      count++;
   }
    public static void main(String[] args) {
         Demo obj1=new Demo();
         Demo obj2=new Demo();

         obj1.incrementCount();
         System.out.println(obj1.count);

         Demo.count=10;
         System.out.println(Demo.count);
    }
}

```
> **in Memory**
![staticexmple](https://res.cloudinary.com/dbvr3bxyv/image/upload/v1684329224/java/static_keyword_vgjbf0.png)

> **Static block**

 It is used to initialize static variables or perform other one-time initialization tasks for a class. It is executed when the class is loaded into memory, before the execution of any static methods or the creation of any instances. 

 ```java
package staticKeyword;

 class Mobile{
    static int count;

    static {
        // Static block
        count = 0;
        System.out.println("Static block executed");
    }
}

public class Block {
   public static void main(String[] args) throws ClassNotFoundException {
         Class.forName("Mobile");     // load the class
   }
}

 ```
 > **Static method**

 In Java, a static method is a method that belongs to a class itself rather than to any specific instance of the class.

 ```java
public class method {
    private static final double PI = 3.14159;
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
    public static void main(String[] args) {
           add(4, 7);
    }
}

}

 ```
 ## 9. Encapsulation, Getters and Setters and this keyword
 >**Encapsulation**

 It aims to hide the internal details of an object and provide access to its properties and behaviors through well-defined interfaces.

 >**Getters and Setters**

 Usually inside a class, we declare a data field as private and will provide a set of public **SET** and **GET** methods to access the data fields.

 ```java
 
class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human obj1=new Human();
        obj1.setAge(4);
        obj1.getAge();
    }
}

 ```

 ## 10 This keyword 
1. In Java, the this keyword is a reference to the current object within a non-static method or constructor.
2. **this()** will execute the constructor of the same class.

``` java

package ThisKeyword;

public class Demo {
   public int age;

   // it assign itSelf not assign a instance variable 
    public void setAge(int age){
         age=age;                    // describe in figure
    }

   // solution 1
    public void setAge(int age, Demo obj){
        Demo obj1= obj;
        obj.age=age;
   }
 
// best solution using this keyword
      public void setAge(int age){
           this.age=age;
       }

    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Demo obj= new Demo();
        // obj.setAge(5,obj);
        obj.setAge(7);
        System.out.println(obj.getAge());
    }
}

```
![thisKeyword](https://res.cloudinary.com/dbvr3bxyv/image/upload/v1684426211/java/thisKeyword_v06o9l.jpg)

## 11. Constructor
1. In Java, a constructor is a special method that is used to initialize objects of a class. It is called when an instance of a class is created using the "new" keyword.
2.  Constructors are used to set the initial values for the instance variables of an object.
3. Constructor does not return anything
4. Every Constructor have default **super()** Method.

```java
package constructor;

public class Demo {
    String name;
    int age;

    public Demo() {
     // Work like DataBase connection
    }

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
        getName();  // also call method inside it
    }

    public Demo(String name) {
        this.name = name;
    }

    public void getName(){
        System.out.println("My name is "+ this.name);
    }
    public static void main(String[] args) {
        Demo obj=new Demo("Binod", 6);
    }
}

```
## 12.super Keyword
1. In Java, the super keyword is used to refer to the superclass (parent class) of a subclass (child class). It is typically used to access the superclass's members (fields or methods) or to invoke the superclass's constructor. 
2. Every class extends **Object** class by default.
```java
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // invoking superclass constructor
        this.breed = breed;
    }

    @Override
    void makeSound() {
        super.makeSound(); // invoking superclass method
        System.out.println("Dog barks");
    }

    void display() {
        System.out.println("Name: " + super.name); // accessing superclass field
        System.out.println("Breed: " + this.breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Labrador");
        dog.makeSound();
        dog.display();
    }
}

```
## 13.Anonymous Object
In Java, an anonymous object refers to an object that is created without assigning it to a variable. Instead, it is used directly at the point of creation. 
```java
public class MyClass {
    public void doSomething() {
        System.out.println("Doing something...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an anonymous object of MyClass and invoking the doSomething() method
        new MyClass().doSomething();
        
        // Another example: Using an anonymous object to call a method with parameters
        new MyClass().someMethod("Hello, world!");
    }
}

```
## 14. Access modifiers
In Java, access modifiers are keywords used to set the accessibility or visibility of classes, methods, variables, and constructors. 
![accessmodifier](https://res.cloudinary.com/dbvr3bxyv/image/upload/v1684918977/java/accessmodifier_kjoy45.png)

## 15. Polymerphism

![accessmodifier](https://res.cloudinary.com/dbvr3bxyv/image/upload/v1684920670/java/polymerphism_kmvvox.png)
