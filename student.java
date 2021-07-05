import java.io.*;
import java.util.*;

/*class stud{
	String name;
	int roll_no,sub1,sub2,sub3,sub4,sub5,total;
	float avg;
	stud(){
		roll_no=0;
		sub1=sub2=sub3=sub4=sub5=0;
		total=0;
		avg=0;
	}
	void getdata() throws NullPointerException{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the student name");
		name=sc.next();
		System.out.println("Enter rollo no");
		roll_no=sc.nextInt();
		System.out.println("mark 1");
		sub1=sc.nextInt();
		System.out.println("mark 2");
		sub2=sc.nextInt();
		System.out.println("mark 3");
		sub3=sc.nextInt();
		System.out.println("mark 4");
		sub4=sc.nextInt();
		System.out.println("mark 5");
		sub5=sc.nextInt();
	}
	void show(){
		total=sub1+sub2+sub3+sub4+sub5;
		avg=total/5;
		System.out.println(roll_no+"\t"+name+"\t"+sub1+"\t"+sub2+"\t"+sub3+"\t"+sub4+"\t"+sub5+"\t"+total+"\t"+avg);
	}
}
class student{
	public static void main(String args[])throws NullPointerException{
		int i;
		stud[] s= new stud[4 ];
		System.out.println("Enter the marks of students");
		for(i=0;i<5;i++){
			s[i]=new stud();
			s[i].getdata();
		}
		for(i=0;i<5;i++){
			s[i].show();
		}
	}
}*/

class quiz{
	private String name;
	private int total_score;
	private int count;
	quiz(String n){
		name=n;
		total_score=0;
		count=0;
	}
	public String getname(){
		return name;
	}
	public void addscore(int score){
		total_score=total_score+score;
		count=count+1;
	}
	public int showscore(){
		return total_score;
	}
	public int showavgscore(){
		return total_score/count;
	}
}

class student{
	public static void main(String args[]){
		quiz obj= new quiz("elavarasan");
		int no_of_quiz=5;
		int score[]={50,70,60,55,68};
		for(int i=0;i<no_of_quiz;i++){
			obj.addscore(score[i]);
		}
		System.out.println("your name "+obj.getname());
		System.out.println("no of quiz "+no_of_quiz);
		System.out.println("your Score "+obj.showscore());
		System.out.println("your avergae score "+obj.showavgscore());

 
	}
}