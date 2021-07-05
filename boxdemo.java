import java.util.Scanner;

class box{
	int width,height;
}

class boxdemo{
	public static void main(String args[]){
		box obj= new box();
		int c=obj.width=10;
		int d=obj.height=20;
		int a=c+d;
		System.out.println(a);
	}
}