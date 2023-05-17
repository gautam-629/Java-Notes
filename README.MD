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

In Java, an array is a data structure used to store a fixed-size sequence of elements of the same type. 
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