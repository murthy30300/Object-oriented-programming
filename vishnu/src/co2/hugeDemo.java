package co2;

public class hugeDemo 
{
	
}
class HugeInteger
{
	BigInteger value;
	HugeInteger(String value)
	{
		this.value=new BigInteger(value);
	}
	HugeInteger(BigInteger value)
	{
		this.value=value;
	}
	void input(String value)
	{
		this.value=value;
	}
	void output()
	{
		System.out.println(value);
	}
	HugeInteger add(Integer another)
	{
		return new
		HugeInteger(this.value.add(another.value));
	}
	HugeInteger subtract(HugeInteger another)
	{
		return new
	    HugeInteger(this.value.subtract(another.value))
	}
	
	
}
