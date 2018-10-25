
import java.io.*;
import java.math.*;

public class publickey {
	
	public Elliptic_Curve E;
	public ECPoint P, Q;
	public BigInteger n;
	
	private BigInteger d; //this the private key
	
	
	public publickey(Elliptic_Curve E1, ECPoint P1, BigInteger n1){
	E = E1;
	P = P1;
	n = n1;
	
	try{
	FileReader fpr = new FileReader("E:\\ECDSA\\PrivateKey.txt");
	BufferedReader bpr = new BufferedReader(fpr);
	String spr;
	spr = bpr.readLine();
	fpr.close();
	d = new BigInteger(""+spr);
	}
	catch (FileNotFoundException e) {
		System.out.print("File not found");
	} 
	catch (IOException e) {
		e.printStackTrace();
	}
	Q = E1.point_multiplication(d, P1, E1);	
	}
}
