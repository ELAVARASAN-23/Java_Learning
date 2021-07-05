class reverse_digit{
	public static void main(String[] args){
		int num=1234;
		int rev_num=0;
		while(num!=0){
			System.out.println(rev_num+"\n");
			rev_num=(rev_num*10)+(num%10);
			num=num/10;
			//System.out.println(rev_num);
		}System.out.println(rev_num);
	}
}



