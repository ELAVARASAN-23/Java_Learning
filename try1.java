import java.util.Scanner;

class add{
	
	void cal(int a){
		try{
		int age=a;
			if(age>=18){
				System.out.println("Your eligible for the vote");
			}
			else {
				System.out.println("not eliegible for vote");
			}
		}

		catch(Exception e){
			System.out.println("not eligible");
		}
	}
}

class try1{
	public static void main(String[] args){

		add obj=new add();

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the age");
		int age1=s.nextInt();
		obj.cal(age1);
	}
}
