import java.util.Scanner;

//1: Grade Classification
class Question1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a >= 90){
			System.out.println("A");
		}
		else if(a <= 89 && a >=80){
			System.out.println("B");
		}
		else if(a <= 79 && a >=70){
			System.out.println("C");
		}
		else if(a <= 69 && a >=60){
			System.out.println("D");
		}
		else{
			System.out.println("F");
		}
	}
}

//2: Days of the Week
class Question2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		switch(a){
			case 1:
				System.out.println("Monday");
				System.out.println("Its a weekday");
				break;
			case 2:
				System.out.println("Tuesday");
				System.out.println("Its a weekday");
				break;
			case 3:
				System.out.println("Wednesday");
				System.out.println("Its a weekday");
				break;
			case 4:
				System.out.println("Thrusday");
				System.out.println("Its a weekday");
				break;
			case 5:
				System.out.println("Friday");
				System.out.println("Its a weekday");
				break;
			case 6:
				System.out.println("Saturday");
				System.out.println("Its a weekend");
				break;
			default:
				System.out.println("Sunday");
				System.out.println("Its a weekend");
			
		}
	}
}

//3: Calculator
class Question3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter First Number:");
		int a = s.nextInt();
		System.out.print("Enter Second Number:");
		int b = s.nextInt();
		String op = """
		Enter a number to choose operator:
		1. +
		2. -
		3. *
		4. /
		""";
		System.out.println(op);
		System.out.print("Enter the operator number:");
		int ope = s.nextInt();
		switch (ope){
			case 1:
				System.out.println(a + b);
			case 2:
				System.out.println(a - b);
			case 3:
				System.out.println(a * b);
			case 4:
			    try {
					int result = a/b;
					System.out.println(result);
				} catch (ArithmeticException e) {
					System.err.println("Error: Division by zero is not allowed.");
				}
		}
	}
}

//4: Discount Calculation
class Question4{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter tital purchase amount:");
		double a = s.nextDouble();
		System.out.print("Do you have membership? --> True/False : ");
		boolean mem = s.nextBoolean();
		double k;
		if(a >= 1000){
			if(mem){
				k = 0.25;
			}
			else{
				k = 0.20;
			}
		}
		else if(a > 500 && a <= 999){
			if(mem){
				k = 0.15;
			}
			else{
				k = 0.10;
			}
		}
		else{
			if(mem){
				k = 0.10;
			}
			else{
				k = 0.05;
			}
		}
		double res = (double)(a = a - (a*k));
		System.out.println("Discount " + " = " + res);
		
	}
}


//5: Student Pass/Fail Status with Nested Switch
class Question5{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the score of Maths:");
		int m = s.nextInt();
		System.out.print("Enter the score of Science:");
		int c = s.nextInt();
		System.out.print("Enter the score of English:");
		int e = s.nextInt();
		
		int count = 0;
		if(m <= 40){
			count++;
		}
		if(c <= 40){
			count++;
		}
		if(e <= 40){
			count++;
		}
		
		if(count == 0){
			System.out.println("Passed!");
		}
		else{
			System.out.println("Failed in " + count + " subjects.");
		}
		
	}
}