import java.util.Scanner;
class UserInput{
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int a = s.nextInt();
		
		System.out.println("Enter your 2nd number");
		int b = s.nextInt();	
		
		int quotient = a/b;
		int remainder = a%b;
		
		
		System.out.println("_________");
		System.out.println("the Quotient is "+ quotient);
		System.out.println(remainder);
		System.out.println("=========");
		System.out.println("Thank You!!!");
	
	}
}
