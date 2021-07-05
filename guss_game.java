import java.util.  Scanner;

class guss_game{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		double rand=Math.random()*10;
		int convert2int= (int)rand;
		System.out.println(convert2int);
		int i=1,j=3;
		while(i<=3){
			System.out.println("Enter the guss number");
			int user=obj.nextInt();
			if(user==convert2int){
				System.out.println("you matched correct number  "+convert2int);
				break;
			}
			else if(user>convert2int){
				System.out.println("you above the guss number");
				System.out.println("your "+(j--)+"chance over\n");
				i++;
	

				continue;
			}
			else if(user<convert2int){
				System.out.println("you less than the guss number");
				System.out.println("your"+(j--)+"chance over\n");
				i++;
				continue;
			}
			else{
				System.out.println("please enter the number");
				continue;
			}
		}
	}
}