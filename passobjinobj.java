import java.io.*;
import java.lang.*;

class add{
	int height,width;
	add(int h,int w){
		height=h;
		width=w;
	}
	void area(add o){
		int result=(height+o.height)*(width+o.width);
		System.out.println("The result is"+ result);
	}
}
class passobjinobj{
	public static void main(String args[]){
		add obj1=new add(2,3);
		add obj2=new add(10,20);
		obj1.area(obj2);
	}
}