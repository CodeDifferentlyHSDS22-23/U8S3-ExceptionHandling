# U7S3 ExceptionHandling

* Part A - Foundations 8.3
* Part B - Algorithm Challenge

## Part A

### Exercise 01

#### Step 01

In the package `partA.ex01` look at the file `Exception`.

#### Step 02

* Examine `Exception` :
    * Execute the program and observe the output:
    * ArrayIndexOutOfBoundsException Occurs
    * Is it a good practice to handle the exception for this program?
    * Modify the program to compute the sum of the array

Your program is working correctly, if when run, the following is the output:

```
Sum:12

```

### Exercise 02

#### Step 01

In the package `partA.ex02` look at the files `Calculator` and `ShoppingCart`.

#### Step 02

* Modify the programs to implement exception handling:
    * `Calculator`
      * Identify the exception that might occur
      * Change the divide method signature to indicate that it throws an exception
    * `ShoppingCart`
      * Catch the exception in the class that calls the divide method
      
 Your program is working correctly, if when run, the following is the output:

```
Add Result: 122
java.lang.ArithmeticException: / by zero

```

## Part B
### Problem 1
Starting at index 1, we need to see if the word "del" appears.
If "del" appears at that index then we need to delete the word "del".

Return a new string where "del" has been deleted if appeared at index 1;
return the string unchanged if "del" doesn't appear.

Example:
```java
deleteDel("adelbc") --> "abc"
deleteDel("adelHello") --> "aHello"
deleteDel("adedbc") --> "adedbc"
```
### Problem 2
Out of the given 3 int values, we need to find the max number.

Return the largest int value out of the given 3.

Example:
```java
maxNumber(1, 2, 3) --> 3
maxNumber(1, 3, 2) --> 3
maxNumber(3, 2, 1) --> 3
```

