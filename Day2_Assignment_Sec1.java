//-----------------Section 1: Error-Driven Learning in Java ----------------------------



/*
Snippet 26:
Error: Duplicate case label
Solution: Eliminating duplicacy

-------------------------------------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 int number = 5;
 switch(number) {
 case 5:
 System.out.println("Number is 5");
 break;
 case 6:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }
}
*/

/*
Snippet 25:
Type Mismach error
Error: constant label of type int is not compatible with switch selector type double
Solution: Explicitly declered score as "int" so that it can match with
the data type in switch cases.

--------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 double score = 85.0;
 switch((int)score) {
 case 100:
 System.out.println("Perfect score!");
 break;
 case 85:
 System.out.println("Great job!");
 break;
 default:
 System.out.println("Keep trying!");
 }
 }
}
*/

/*
Snippet 24:
Solution: The break statement will help to move out of the switch
statement once the case matches the vaule to be compared.
*/

/*
Snippet 23:
Solution: By adding break after each case
--------------------------------------------------------------------
public class Main{
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 break;
 case 2:
 System.out.println("Value is 2");
 break;
 case 3:
 System.out.println("Value is 3");
 break;
 default:
 System.out.println("Default case");
 break;
 }
 }
}

*/

/*
Snippet 22:
Compilation Error
Error:  illegal start of expression; class, interface, enum, or record expected
Solution: Using local class
--------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 //local class
 class Innerclass {
	static void displayMessage() {
		System.out.println("Message");
	}
 }
 Innerclass inner = new Innerclass();
 inner.displayMessage();
 }
}
--------------------------------------------------------------------

Alternate Solution: Using lambda expression

--------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
	Runnable displayMessage = () -> System.out.println("Message");
	displayMessage.run();
 }
 }
 -------------------------------------------------------------------

*/

/*
Snippet 21:
Compilation error
Error: reached end of file while parsing }
Solution: added missing closing brace

*/

/*
Snippet 20:
Compilation Error
Error: error: ';' expected
Solution: added ';' at the end

How ';' affects compilation?
-Compiler will not know where the syntax ended/terminated.
*/

/*
Snippet 19:
Compiled successfully but exception is thrown
Exception: ArithmeticException: / by zero
Solution: Use try-catch block

--------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 0;
 try {
	int result = a / b;
	System.out.println(result);
 }catch (ArithmeticException e) {
	 System.err.println("Error: Division by zero is not allowed for integers.");
 }
 }
} 
--------------------------------------------------------------------
why division by zero cause an issue?
-Results in infinity


*/

/*
Snippet 18:
Compiled Successfully
Output: 20
Since, * has a higher precedence than + therfore (a + (b*2)) --> (10 + (5*2)) = 20
*/

/*
Snippet 17:
Compilation Error
Error:  illegal start of expression
Solution: Since, ** operator is not valid in java we use Math.pow(a,b)

--------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = (int)Math.pow(a,b);
 System.out.println(result);
 }
}

*/

/*
Snippet 16:
Compiled Successfully
Output: 2.0
Expected: 2.5
-No, Output != Expected

Solved: Explicitly convert data type form "int" to "double"

--------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 int num = 10;
 double result = (double)num / 4;
 System.out.println(result);
 }
} 
--------------------------------------------------------------------
*/

/*
Snippet 15:
Compilation Error
Error:  incompatible types: possible lossy conversion from double to int
Solution: Explicitly convert data type from "double" to "int"

--------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 int result = (int) (num1 + num2);
 System.out.println(result);
 }
}
--------------------------------------------------------------------

Why handle different data types?
- Explicitly convert data types to ensure compatibility.

*/

/*
Snippet 14:
Compilation Error
Error:  incompatible types: String cannot be converted to double
Solution: correct type error by substituting "double" with "String"

--------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 String num = "Hello";
 System.out.println(num);
 }
}
--------------------------------------------------------------------

Why data type constraints?
- type safety, prevent errors and improve maintainability
*/

/*
Snippet 13:
Compiled Successfully but exception is thrown
Exception:Cannot invoke "String.length()" because "<local1>" is null
Solution: replaced null(keyword) with allowed string literals 
i.e. "Hello I am Khushi!"

--------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 String str = "Hello I am Khushi!";
 System.out.println(str.length());
 }
} 
--------------------------------------------------------------------
Allowed string literals:
"Hello, world!", "", "!@#$%^&*()_+=-`~[]\{}|;':\",./<>?"
*/

/*
Snippet 12:
Compiled Successfully but got into infinite loop
Error: Infinite Loop
Solution: Providing termination condition -->reachable condition

--------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 int i = 9;
 while (i > 5) {
 System.out.println("Infinite Loop");
 i--;
 }
 }
}
*/

/*
Snippet 11:
Compiled successfully but encountered Runtime exception
Exception: Index 5 out of bounds for length 3
Solution: substituted 5 with arr.length-1

Why does it occur?
-because, arr.length < 5

-------------------------------------------------------------------
public class Main {
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[arr.length-1]);
 }
}

*/

/*
Snippet 10:
Compilation error
Error: non-static method display() cannot be referenced from a static context
Solution: Added static keyword to both display() methods

--------------------------------------------------------
public class Main {
 public static void display() {
 System.out.println("No parameters");
 }
 public static void display(int num) {
 System.out.println("With parameter: " + num);
 }
 public static void main(String[] args) {
 display();
 display(5);
 }
}
--------------------------------------------------------------
Is method overloading allowed?
-Yes,
Method overloading = same class --> multiple methods with same name --> different parameters
Ex. display() and display(int num)
*/

/*
Snippet 9:
Compilation Error
Error: not a statement, <identifier> expected --> int class = 10;
Solution: class is a keyword thus cannot be used as variablr name(identifier)
-------------------------------------------
public class Main {
 public static void main(String[] args) {
 int a = 10;
 System.out.println(a);
 }
} 
------------------------------------------
*/

/*
Snippet 8:
Compilation Error 
Error:')' expected (Syntax error)
Solution: Added ')' and ';'
*/

/*
Snippet 7:
Compilation Error
Error: incompatible types: String cannot be converted to int
Solution: Go with the type safety protocol

Why type safety?
-reliabality and robust code
*/

/*
Snippet 6:
Compilation error
Error: cannot find symbol
Solution: Variables must be declared and initialised
i.e. int y = 6;
*/

/*
Snippet 5:
Code compiled and executed successfully
Observed: Only the first main method is executed 
i.e. "Main method with String[] args"
*/

/*
Snippet 4:
Compiled successfully but encountered Runtime error
Error: Main method not found in class Main
Solution: added "String args[]" as argument in main method
*/

/*
Snippet 3:
Error1: Main method must return a value of type void in class Main
Solution: Added void keyword 
(In Java the "main" method is always declared with a "void" return type)
Error2: incompatible types: unexpected return value
Solution: Commented return 
*/

/*
Snippet 2:
Compiled Successfully but encountered runtime error
Error: Main method not found in class Main
Solution: Added public keyword
*/

/* 
Snippet 1:
Compile Error
Error: class Main is public, should be declared in a file named Main.java
Solution: Renamed file as Main.java

Compiled successfully but encountered Runtime error
Error:  Main method is not static in class Main
Solution: Added static keyword
*/