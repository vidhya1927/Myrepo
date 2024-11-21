package accessmodifierpkg;

public class Accessmodifiersample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accessmodifiersample obj = new Accessmodifiersample();
		obj.add();
		obj.sub();
		obj.mul();
		obj.display();
	}
	
	public void add()
	{
	int a=30;
	int b=20;
	int c= a+b;
	System.out.println(c);
	}
	
	private void sub()
	{
	int c=30;
	int d=20;
	int e= c+d;
	System.out.println(e);
	}
	
	protected void mul()
	{
		int  f= 2;
		int  g=3;
		int  h= f*g;
		System.out.println(h);
		
	}
	
	void display()
	{
		System.out.println("Hello");
	}
	}


