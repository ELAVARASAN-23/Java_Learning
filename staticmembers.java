import java.io.*;

class staticprog{
	static int a=10;
	static void show(int b){
		System.out.println("b="+(b+5)) ;
	}
}
class staticmembers{
	public static void main(String args[]){
		System.out.println("Access a in class"+staticprog.a);
		staticprog.show(30);
	}
}