import java.util.Scanner;

class add{
	
	int get(){
		int a,b,c;
		Scanner h=new Scanner(System.in);
		System.out.println("enter the a");
		a=h.nextInt();
		System.out.println("enter the b");
		b=h.nextInt();
		c=a+b;
		return c;
	}
}

class add_class{
	public static void main(String[] args){
		add obj=new add();

		System.out.println("\n"+obj.get());
	}
}