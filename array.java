import java.io.*;

class array{
	public static void main(String args[]){
		int k=0;
		int a[][]= new int [3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=k+10;  
				k=k+10;
			}
		}
		System.out.println("you stored datas are");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}
