package IT7320.MockitoA3;

public class CalcImplementation  {
	
	CalcInterface intobj;
	
	public CalcImplementation() {
		// TODO Auto-generated constructor stub
	}

	public int addTwosNums(int a, int b) 
	{
		return intobj.add(a, b);
	}
	
	public int subtractTwoNums(int a, int b)
	{
		return intobj.subtract(a, b);
	}
	
	public int multiplyTwoNums(int a, int b)
	{
		return intobj.multiply(a, b);
	}
	
	public double divideTwoNums(int a, int b) 
	{
		return intobj.divide(a, b);
	}
	
	public void setIntobj(CalcInterface intobj) {
		this.intobj = intobj;
	}
	
	
	
}
