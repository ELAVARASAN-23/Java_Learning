import java.io.*;

class outerclass{
	int x=10;
	class innerclass{
		int y=10;
	}
}
class InnerClass{
	public static void main(String[] args) {
		outerclass outer=new outerclass();
		outerclass.innerclass myinner= outer.new innerclass();
		System.out.println(outer.x+myinner.y);
	}
}