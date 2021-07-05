import java.util.Scanner;

class a{
	int a=10,b=20;
	public void get(){
		
		System.out.println(a+" "+b);	
	}
}
class b extends a{
	void display(){
		int c=a+b;
		System.out.println(c);
	}
}

class single_inheritance{
	public static void main(String[] args){
		b obj=new b();
		
		obj.display();
		Scanner a=new Scanner(System.in);
		System.out.println("Would you like to see variable enter yes or no");
		int a1=a.nextInt();
		if(a1==1){
		a obj1= new a();
		obj1.get();
		}
		else{
			System.exit(0);
		}
	}
}