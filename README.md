# Calculator_in_Java
This project is a simple and efficient calculator built in Java. It provides core arithmetic operations alongside advanced mathematical features such as generating Fibonacci sequences and performing statistical analyses. The calculator is designed for interactive use, ensuring seamless input and output via the console.
# Variables and Functions in the Java Calculator  

This document provides a clear overview of the variables and functions used in the project, categorized by their roles and purposes.

## Variable List  

| **Variable Name** | **Data Type** | **Purpose**                                                                 |
|--------------------|---------------|------------------------------------------------------------------------------|
| `sc`              | `Scanner`     | Used to read user input from the console in the `UserInput` class.          |
| `first`           | `int`         | Stores the first operand for arithmetic operations.                         |
| `second`          | `int`         | Stores the second operand for arithmetic operations.                        |
| `arr`             | `int[]`       | Holds input values or arrays for operations in both `UserInput` and `Calculator`. |
| `size`            | `int`         | Represents the size of the array provided by the user.                      |
| `sum`             | `int`/`double`| Used for summing values during various operations.                          |
| `diff`            | `int`         | Stores the result of subtraction in `Calculator`.                           |
| `prod`            | `int`         | Stores the result of multiplication in `Calculator`.                        |
| `quotient`        | `double`      | Stores the result of division in `Calculator`.                              |
| `first_term`      | `int`         | Tracks the first term in the Fibonacci sequence.                           |
| `second_term`     | `int`         | Tracks the second term in the Fibonacci sequence.                          |

---

## Functions  

| **Function Name** | **Return Type** | **Parameters**           | **Purpose**                                                                                 |
|--------------------|-----------------|--------------------------|---------------------------------------------------------------------------------------------|
| `input`           | `int[]`         | None                     | Reads two numbers from the user and returns them as an array.                              |
| `inputSingle`     | `int`           | None                     | Reads a single integer from the user.                                                      |
| `inputArray`      | `int[]`         | None                     | Reads an array size and elements from the user.                                            |
| `addition`        | `int`           | None                     | Returns the sum of two numbers stored in `arr`.                                            |
| `subtraction`     | `int`           | None                     | Returns the difference of two numbers stored in `arr`.                                     |
| `multiplication`  | `int`           | None                     | Returns the product of two numbers stored in `arr`.                                        |
| `division`        | `double`        | None                     | Returns the quotient of two numbers stored in `arr`, with handling for division by zero.   |
| `fibonacci`       | `void`          | `int n`                 | Prints the first `n` terms of the Fibonacci sequence.                                      |
| `mean`            | `void`          | `int[] array`           | Calculates and prints the mean of the given array.                                         |
| `variance`        | `void`          | `int[] array`           | Calculates and prints the variance of the given array.                                     |
