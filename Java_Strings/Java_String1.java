class Java_String1{
	public static void main(String[] args) {
		char chars[] = {'E','L','A','V','A'};
		//Coverting char to String
		String a = new String(chars,1,3);
		System.out.println(a);
		
		//convert the Ascii to String

		byte ascii[] = {64,65,66,67,68,69,70};

		String bb = new String(ascii);
		// System.out.println(b);

		//Find the lenght of the String
		System.out.println(a.length());

		String name="Elavarasan";//String literals

		String lastname="S";
		
		// System.out.println(name+" "+lastname);

		// System.out.println("Output: "+(4+4)); //mixing with String with other datatypes

		char cd;
		cd= "abv".charAt(1);
		// System.out.println(cd);

		//matches the string
		String n1="Hello",n2="HELLO",n3="Good",n4="good";

		// System.out.println(n1.equalsIgnoreCase(n2));


		/*checking with the start and end string values
			"hello".startsWith("llo",2) output: true
			"helo".endsWith("lo") output: true
		*/
		// System.out.println( "Goodbye".startsWith("bye"));
		
		String a6= "Hello";
		String n7= new String(a6);
		/*
			The variable s1 refers to the String instance created by "Hello". The object referred to by
			s2 is created with s1 as an initializer. Thus, the contents of the two String objects are identical,	
			but they are distinct objects. This means that s1 and s2 do not refer to the same objects and
			are, therefore, not ==, as is shown here by the output of the preceding example:
		*/
		// System.out.println(a6==n7);		
		// System.out.println(a6.equals(n7));

		//Replace String
		n1.replace('l','e');
		// System.out.println(n1);

		StringBuffer s9= new StringBuffer("I Java");
		s9.insert(2,"Love ");
		// System.out.println(s9);
		System.out.println(s9.reverse());

		StringBuffer h1 = new StringBuffer("How Are You");
		h1.delete(4,8);
		System.out.println(h1);
		StringBuffer h2= new StringBuffer("I like Ruby");
		h2.replace(7,11,"Java");
		System.out.println(h2);


		
		
	}
}






