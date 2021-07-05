class class_demo{
	public void add(){
		System.out.println("this hello world");
	}
	static void add1(){
		System.out.println("This Static hello world");
	}


	public static void main(String[] args){
		class_demo obj= new class_demo();
		obj.add();
		//add();
		add1();
	}
}