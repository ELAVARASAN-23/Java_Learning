import java.util.Scanner;

class add_user {
	public static void main(String[] args){
		int a,b,sum;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the a value");
		a=obj.nextInt();
		System.out.println("Enter the b value");
		b=obj.nextInt();

		sum=a+b;

		System.out.println("sum is ="+sum);

	}
}