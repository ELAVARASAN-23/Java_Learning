public class RowColSum{
	public static void main(String[] args) {
		int a[][]={
			{10,20,30},
			{40,50,60},
			{70,80,90},
		};

		int rsum[]=new int[3];
		int csum[]=new int[3];
		int i,j;

		for(i=0;i<3;i++){

			

			for (j=0;j<3;j++) {
					rsum[i]=rsum[i]+a[i][j];
			}
		}

		for(i=0;i<3;i++){

			

			for (j=0;j<3;j++) {
					csum[i]=csum[i]+a[j][i];
			}
		}
	
			for (i=0;i<3;i++ ) {
				System.out.print(rsum[i]+" ");
			}
			for (i=0;i<3;i++ ){
				System.out.println("this coloumn"+csum[i]);
			}
			
	}

}