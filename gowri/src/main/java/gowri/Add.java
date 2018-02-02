package gowri;

public class Add {
	int a,b;
	String c="Hello";
	String d="Hello";
	int x=21;
//constructor
	public Add(int p, int q) {
		// TODO Auto-generated constructor stub
		this.a = p;
		this.b = q;
	}

	public Add(String string, String string2) {
		// TODO Auto-generated constructor stub
		this.c =string;
		this.d =string2;
	}




	public int addition(){
		return a+b;
	}
	public int subtraction(){
		return a-b;
	}
	public String combine(){
		return c+d;
	}
	public static void main(String arg[]){
		Add obj = new Add(5,7);
		Add obj1 = new Add(9,2);
		Add obj2 = new Add("HE","LLO");
		System.out.println("Addition value is "+obj.addition());
		System.out.println("Subtraction value is "+obj1.subtraction());
		System.out.println("Combined String value is "+obj2.combine());
		System.out.println("END");

	}
}