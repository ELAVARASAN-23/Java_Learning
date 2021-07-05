class a{
	int a=10;
}
interface b{
	int b=20;
}
class c extends a implements b{
	int c;
	int mul(){
		c=a*b;
		return c;
	}
}
class d extends c{
	void sum(){
		System.out.println("adding the all three variables");
		int d=a+b+mul();
		System.out.println(d);
	}
}

class multiple_inheritance{
		public static void main(String[] args) {
				d obj =new d();
				System.out.println("multipling the two numbers "+obj.mul());
				obj.sum();
			}	
}