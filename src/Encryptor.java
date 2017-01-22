import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encryptor{
	DebugHelper d=new DebugHelper();
	
	
    FileInputStream in = null;
    FileInputStream key=null;
    FileOutputStream out = null;
    int c;

 
    String inputFileName;
    String prefixDecrypted="Encrypted-";
    String suffixDecrypted="";
    String outputFilename;
    
    Encryptor(int method,String input) throws IOException{
    	d.o("Encrypting \""+input+"\"");
    	fileStreamOpen(input);
    	switch(method){
    	case 1:
    		negative();
    		break;
    		
    	}
    	
    	
    	fileStreamClose();
    	d.o("Finished. Encrypted file is \""+outputFilename+"\"");
    }
    
    void fileStreamOpen(String input) throws IOException{
    		this.inputFileName=input;
            in = new FileInputStream(input);
            this.outputFilename=prefixDecrypted+inputFileName+suffixDecrypted;
            out = new FileOutputStream(outputFilename);
    }
    
    void fileStreamClose() throws IOException{
    	in.close();
    	out.close();
    }
    //really simple "encryption"
    void negative() throws IOException{
        while ((c = in.read()) != -1) {
        	c*=-1;
            out.write(c);
        }
    }
}