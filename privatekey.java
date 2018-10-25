
import java.io.*;
import java.math.*;
import java.security.*;

public class privatekey {
	public static void privatekey_generation(){
		
	BigInteger n = new BigInteger("6277101735386680763835789423176059013767194773182842284081");	
	SecureRandom rnd = new SecureRandom();
	BigInteger r = new BigInteger(n.bitLength(), rnd);
	
		
	System.out.println("private key: "+r);
	String s = new String(""+r);
	try {
		FileWriter prk = new FileWriter("E:\\ECDSA\\PrivateKey.txt");
		prk.write(s);
		prk.close();
	}
	catch (FileNotFoundException e) {
		System.out.print("File not found");
	} 
	catch (IOException e) {
		e.printStackTrace();
	}
	}
}

