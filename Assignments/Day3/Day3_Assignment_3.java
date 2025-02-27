//----------SECTION 3: Lamborghini Exercise:----------------------->

// 1. Write a program to calculate the sum of the first 50 natural numbers. 
class Problem1{
	public static void main(String args[]){
		int sum = 0;
		for(int i=1; i<=50; i++){
			sum += i;
		}
		System.out.println(sum);
	}
}


// 2. Write a program to compute the factorial of the number 10.
class Problem2{
	public static void main(String args[]){
		int fact = 1;
		for(int i=1; i<=10; i++){
			fact *= i;
		}
		System.out.println(fact);
	}
}

// 3. Write a program to print all multiples of 7 between 1 and 100. 
class Problem3{
	public static void main(String args[]){
		int count = 0;;
		for(int i=1; i<=100; i++){
			if(i%7 == 0){
				System.out.print(i + " ");
			}
		}
	}
}

// 4. Write a program to reverse the digits of the number 1234. The output should be 4321. 
class Problem4{
	public static void main(String args[]){
		int n = 1234;
		int k = 0;
		while(n > 0){
			k = k*10 + n%10;
			n = n/10;
		}
		System.out.println(k);
	}
}

// 5. Write a program to print the Fibonacci sequence up to the number 21.
class Problem5{
	public static void main(String args[]){
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b + " ");
		for(int i=0; i<=21; i++){
			i = a+b;
			a = b;
			b = i;
			System.out.print(i+ " ");
		}
	}
}

// 6.Write a program to find and print the first 5 prime numbers.
class Problem6{
	public static void main(String args[]){
		int count = 0;
		int a = 2;
		do{
			for(int i=2; i<= Math.sqrt(a); i++){
				if(a%i == 0){
					break;
				}
				else{
					System.out.print(a + " ");
					count++;
				}
			}
		}while(count != 5);
	}
}

// 7.Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6). 
class Problem7{
	public static void main(String args[]){
		int a = 9876;
		int sum = 0;
		while(a > 0){
			sum += a%10;
			a = a/10;
		}
		System.out.println(sum);
	}
}

// 8.Write a program to count down from 10 to 0, printing each number. 
class Problem8{
	public static void main(String args[]){
		for(int i=10; i>=0; i--){
			System.out.println(i);
		}
	}
}

// 9.Write a program to find and print the largest digit in the number 4825. 
class Problem9{
	public static void main(String args[]){
		int a = 4825;
		int l = 0;
		while(a > 0){
			if(l < a%10){
				l = a%10;
			}
			a = a/10;
		}
		System.out.println(l);
	}
}

//10. Write a program to print all even numbers between 1 and 50. 
class Problem10{
	public static void main(String args[]){
		for(int i=0; i<=50; i++){
			if(i%2 == 0){
				System.out.print(i + " ");
			}
		}
	}
}

// 11.Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression 
class Problem11{
	public static void main(String args[]){
		int a = 5;
		System.out.println(++a + a--); // 6 + 6 = 12
	}
}

/*
12. Write a program to draw the following pattern:
*****
*****
*****
*****
***** 
*/
class Problem12{
	public static void main(String args[]){
		int[][] arr = new int[5][5];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
13. Write a program to print the following pattern:
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/
class Problem13{
	public static void main(String args[]){
		int[][] arr = new int[6][6];
		for(int i=0; i < arr.length; i++){
			for(int j=0; j<i; j++){
				if(j==i-1){
					System.out.print(i);
				}
				else{
					System.out.print((i) + "*");
				}
			}
			System.out.println();
		}
		
		for(int i=0; i < arr.length-1; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(j==(arr.length-1-i)-1){
					System.out.print(arr.length-1-i);
				}
				else{
					System.out.print((arr.length-1-i) + "*");
				}
			}
			System.out.println();
		}
	}
}

/*
14. Write a program to print the following pattern
 *
 **
 ***
 *****
 *******
 *********
 
 */
 
 class Problem14{
	 public static void main(String args[]){
		 int[][] arr = new int[6][9];
		 for(int i=0; i<arr.length; i++){
			 for(int j=0; j<i+1; j++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
	 }
 }
 
 /*
 15.Write a program to print the following pattern:
  *
 **
 ***
 ****
*****
*/
class Problem15{
	public static void main(String args[]){
		int[][] arr = new int[5][5];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				if(j < (arr.length-1)-i){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}

/*
 16. Write a program to print the following pattern:
    *
   ***
  *****
 *******
*********
*/
class Problem16{
	public static void main(String args[]){
		int[][] arr = new int[9][9];
		int k = arr.length/2;
		for(int i=0; i<5; i++){
			for(int j=0; j<arr[i].length; j++){
				if(j <= k+i && j >= k-i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

/* 17. Write a program to print the following pattern:
 *****
  ****
   ***
    **
     *
 
 */
 
class Problem17{
	public static void main(String args[]){
		String[][] arr = new String[5][9];
		
		for(int l=0; l<arr.length; l++){
			for(int m=0; m<arr[l].length; m++){
				arr[l][m] = " ";
			}
		}
		
		for(int i=0; i<arr.length; i++){
			if(i%2 == 0){
				for(int j=i; j<arr[i].length-i; j+=2){
					arr[i][j] = "*";
				}
			}
			else{
				for(int k=i; k<arr[i].length-i; k+=2){
					arr[i][k] = "*";
				}
			}
		}
		
		for(int l=0; l<arr.length; l++){
			for(int m=0; m<arr[l].length; m++){
				System.out.print(arr[l][m]);
			}
			System.out.println();
		}
		
	}
}


/*
18. Write a program to print the following pattern:
 *
 ***
 *****
 *******
 *****
 ***
 *
 
 */
class Problem18{
	public static void main(String args[]){
		String[][] arr = new String[7][7];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				arr[i][j] = " ";
			}
		}
		
		for(int i=0; i<arr.length; i++){
			int start = (arr.length/2) -i;
			int end = (arr.length/2) + i;
			if(i <= arr.length/2){
				for(int j=start; j<=end; j++){
					arr[i][j] = "*";
				}
			}
			else{
				for(int j= Math.abs(start); j<=arr.length-i+2; j++){
					arr[i][j] = "*";
				}
			}
		}
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
 
 /*
 19. Write a program to print the following pattern:
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5 
*/

 class Problem19{
	public static void main(String args[]){
		String[][] arr = new String[5][9];
		for(int i=0; i<arr.length; i++){
			int count = 0;
			for(int j=0; j<=i*2; j++){
				if(j%2 == 0){
					arr[i][j] = ++count + "";
				}
				else{
					arr[i][j] = "*";
				}
			}
		}
		 
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<=i*2; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
 }
 
 /*
 20. Write a program to print the following pattern:
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1 

*/

 class Problem20{
	 public static void main(String args[]){
		 String[][] arr = new String[5][9];
		 for(int i=0; i<arr.length; i++){
			  int count = 5;
			 for(int j=0; j<=i*2; j++){
				 if(j%2 == 0){
					 arr[i][j] = count-- + "";
				 }
				 else{
					 arr[i][j] = "*";
				 }
			 }
		 }
		 
		 for(int i=0; i<arr.length; i++){
			 for(int j=0; j<=i*2; j++){
				 System.out.print(arr[i][j]);
			 }
			 System.out.println();
		 }
	 }
 }
 
/*
21. Write a program to print the following pattern:
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9

*/

class Problem21{
	 public static void main(String args[]){
		 String[][] arr = new String[5][9];
		 for(int i=0; i<arr.length; i++){
			 int count = 1;
			 for(int j=0; j<=i*2; j++){
				 if(j%2 == 0){
					 arr[i][j] = count + "";
					 count+=2;
				 }
				 else{
					 arr[i][j] = "*";
				 }
			 }
		 }
		 
		 for(int i=0; i<arr.length; i++){
			 for(int j=0; j<=i*2; j++){
				 System.out.print(arr[i][j]);
			 }
			 System.out.println();
		 }
	 }
 }

/*
22. Write a program to print the following pattern:
*********
 *******
 *****
 ***
 *
 ***
 *****
 *******
*********

*/

class Problem22{
	public static void main(String args[]){
		String[][] arr = new String[9][9];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = " ";
			}
		}
		
		for(int i=0; i<arr.length; i++){
			int start = i;
			int end = arr.length-i;
			if(i<=arr.length/2){
				for(int j=start; j<end; j++){
					arr[i][j] = "*";
				}
			}
			else{
				for(int j=end-1; j<=start; j++){
					arr[i][j] = "*";
				}
			}
		}
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
/*
23. Write a program to print the following pattern:
11111
22222
33333
44444
55555
*/

class Problem23{
	public static void main(String args[]){
		int[][] arr = new int[5][5];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}

/*
24. Write a program to print the following pattern:
1
22
333
4444
55555
*/
class Problem24{
	public static void main(String args[]){
		int[][] arr = new int[5][5];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<=i; j++){
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}

/*
25. Write a program to print the following pattern:
1
12
123
1234
12345 
*/

class Problem25{
	public static void main(String args[]){
		int[][] arr = new int[5][5];
		for(int i=0; i<arr.length; i++){
			int count= 1;
			for(int j=0; j<=i; j++){
				System.out.print(count++);
			}
			System.out.println();
		}
	}
}

/*
26. Write a program to print the following pattern:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

class Problem26{
	public static void main(String args[]){
		int[][] arr = new int[5][5];
		int count = 1;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<=i; j++){
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
}


//----------SECTION 2: Guess the Output----------------------------->

public class Lab_Assignment_3{
	 public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			count += i++ - ++i;
			System.out.println(count);
		}
		System.out.println(count);
	}
}
/*
Snippet 8:
Expected Output:
-4

Observed: same

Dry run:------------------------------------------------------------
i=0 c = 0 + (0 -2)= -2; i= 2
i=2 c = -2 + (2 - 4)=-4; i=4
(i < 4) != true ---> loop will break;
count = -4;

thus 

*/

 /*
 Snippet 7:
 Expected Output:
 48
 
 Observed:
 49
 
 Dry run:-----------------------------------------------------------
 res = 11 * 5 - 10 + 4 = 49
 */
 
/*
Snippet 6:
Expected Output:
12

Observed:
8

Dry run:------------------------------------------------------------
y = 6 - 6 + 4 + 4 = 8
*/

/*
Snippet 5:
Expected Output:
2

Observed:
3

Dry run:------------------------------------------------------------
n=1 i=1 n=1-1=0
n=0 i=2 n=0+2=2
n=2 i=3 n=2-3=-1
n=-1 i=4 n=-1+4=3
*/

/*
Snippet 4:
Expected Output:
1 2 3 4 5 6

Observed:
1 2 3 4 5

Why?
-The code will terminate at i=4 bcs i++ == 5 and while(i < 5) will
get false
*/

/*
Snippet 3:
Expected Output:
0 1 2 
3

Observed:
0 1 2 3

Why?
- println() adds the line after the end therefore output will be on
the same line

*/

/*
Snippet 2:
Expected output:
1

Observed:
11

dry run:------------------------------------------------------------
i=5  total = 5
     total = 5 -1 = 4;
i=4  total = 4 + 4 = 8
     total = 8 -1 = 7;
i=3  total = 7 + 3 = 10;
i=2  total = 10 + 2 = 12
     total = 12 -1 = 11;
i=1  total = 11 + 1 = 12;
     total = 12 -1 = 11;
*/

/*
Snippet 1:

Expected Output:
1 1 1 2
2 1 2 2
3 1 3 2

Observed: same
*/


//---SECTION 1 : Error-Driven Learning Assignment: Loop Errors -----------------------


/*
Snippet 12:
Expected: compilation error--> x is not defined in the main method
          and only valid inside for loop.
Observed: 'x' is not accessible here

Corrected code:-----------------------------------------------------
public class Lab_Assignment_3{
	public static void main(String[] args) {
		int x = 1;
		for (int i = 0; i < 5; i++) {
			x = i * 2;
		}
		System.out.println(x); // Error: 'x' is not accessible here
	} 
}

*/

/*
Snippet 11:
Expected Output:
0
2
4

Observed: same

Corrected code:-----------------------------------------------------
public class Lab_Assignment_3{
	public static void main(String[] args) {
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i += 1; // Error: This may cause unexpected results in output
		}
	} 
}

*/

/*
Snippet 10:

Expected: Compilation error--> Condition should be boolean value
Observed: incompatible types: int cannot be converted to boolean

Corrected code:-----------------------------------------------------
public class Lab_Assignment_3{
	public static void main(String[] args) {
		int num = 10;
		while (num == 10) {
			System.out.println(num);
			num--;
		}
	} 
}
(This code can be written in many ways to eliminate getting compilation error)
*/

/*
Snippet 9:
Expected Output:
0
2
4

Observed: same
Nothing to be corrected!
*/

/*
Snippet 8:
Expected: Loop will execute once and 1 will be printed
Observed: same

Corrected code:-----------------------------------------------------
public class Lab_Assignment_3{
	public static void main(String[] args) {
		int num = 1;
		do {
			System.out.println(num);
			num++;
		} while (num < 6);
	}
}

*/

/*
Snippet 7:
Expected: Compilation error--> count is not intialized
Observed: variable count might not have been initialized

Corrected code:-----------------------------------------------------
public class Lab_Assignment_3{
	public static void main(String[] args) {
		int count = 0;
		while (count < 10) {
			System.out.println(count);
			count++;
		}
	}
}

*/

/*
Snippet 6:
Expected:Compilation error--> statements in for loop aren't enclosed properly
Observed: No error

Output:
0
1
2
3
4
Done

why?
-Even without curly braces the for loop will execute and only the 
immediate statement will be considered part pf the loop body.

Corrected code:-----------------------------------------------------
public class Lab_Assignment_3{
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++){
			System.out.println(i);
			System.out.println("Done");
		}
	} 
}

*/

/*
Snippet 5:

Expected: Runtime error---> infine loop bcz termination condition (i >= 10)
          is forever true if i++
Observed: same

Corrected code:-----------------------------------------------------
public class Lab_Assignment_3{
	public static void main(String[] args) {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	} 
}

*/

/*
Snippet 4:
The code is correct.
*/

/*
Snippet 3:

Expected: It will print 0 only once since condition (num > 0)
		  will be true (1 > 0)
Observed: goes into infinite loop

Corrected code:-----------------------------------------------------
public class Lab_Assignment_3{
	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println(num);
			num--;
		} while (num > 0);
	} 
}

*/

/*
Snippet 2:

Expected: Compliation error, bcz condition inside while loop should be boolean
Observed: incompatible types: int cannot be converted to boolean

Corrected code:-----------------------------------------------------
public class Lab_Assignment_3{
	public static void main(String[] args) {
		int count = 5;
		while (count > 0) {
			System.out.println(count);
			count--;
		}
	}
}

/*
Snippet 1:

Expected: runtime error--->infinite loop
Observed: same --> loop tending to -infinity

Why?
- terminating condition (i < 10) is unreachable bcz i will be forever
decresing.

Corrected code:-----------------------------------------------------
public class Lab_Assignment_3{
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		System.out.println(i);
		}
	}
}
*/