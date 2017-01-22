import java.awt.Color;
import java.io.IOException;

public class Main {
	static DebugHelper d=new DebugHelper();
	public static void main(String[] args){
		try {
			Encryptor instance=new Encryptor(1,"Encrypted-test.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
