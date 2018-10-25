import java.math.*;

public class ECPoint {
    private BigInteger x,y;
	boolean point_at_infinity;
	
	ECPoint(BigInteger value_x,BigInteger value_y){
		x = value_x;
		y = value_y;
		point_at_infinity = false;
	}
	BigInteger get_x(){
		return this.x;
	}
	BigInteger get_y(){
		return this.y;
	}
	boolean ECPoint_equals(ECPoint P){
		if (this.x.equals(P.get_x())&& this.y.equals(P.get_y())){
			return true;
		}
		else
			return false;
	}
	
}




