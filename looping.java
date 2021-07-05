import java.io.*;
class looping{
	public static void main(String args[]){
		int i=1,j=10;
		do{
			if(i>j){
				break;
			}
			System.out.println(j);
			j--;
		}
		while(++i<5);
		{
			System.out.println(i+":"+j);
		}
	}
}