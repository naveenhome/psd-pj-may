package psd.pj.may;

public class RPNCalc {

	public int calculate(String expr) {
		// TODO Auto-generated method stub
		String arr [] = expr.split(",");
		
		return Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
	}
	

}
