import java.util.Scanner;

public class Math_Fun {

	static int hello(){
			System.out.println("Hello World");
			return 0;
		}

	//Algorithm for largest number in array
		static int largest(){
		 	int arr[] = {1,2,3,444,5,67,8};
			int max=arr[0];

				for(int i=1;i<arr.length;i++){
					if(arr[i]>max){
						max=arr[i];
					}
				}
			return max;
			}
		

	public static void main(String[] args){
		//System.out.println(Math.max(5,10));
		System.out.println(largest());
		System.out.println("The Math.min() function "+Math.min(2,10));
		System.out.println("The Math.sqrt() function "+Math.sqrt(25));
		System.out.println("The Math.abs() function "+Math.abs(-15));
		System.out.println("The Math.random() function "+Math.round(Math.random() * 101));

	}
}  