import java.io.File;
import java.io.IOException;

public class file{
	public static void main(String[] args){
		try{
			File obj= new File("E:/hello.txt");
			if(obj.createNewFile()){
				System.out.println("File created"+obj.getName());
			}
			else{
				System.out.println("File already exits");
			}
		}
		catch(IOException  e){
			System.out.println("An error ocuued");
			e.printStackTrace();
		}
	}
}