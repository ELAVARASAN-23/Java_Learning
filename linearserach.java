import java.io.*;

public class linearserach{
	public static void main(String args[]) {
		int[] a={1,7,4,2,6,9,23,6,8};
		System.out.println("the locations of element"+Find(a,20));
	}

public static int Find(int[] a,int key){
	int i;
	for(i=0;i<a.length;i++){
		if(a[i]==key)
			return i;
	}
		return -1;
}
}