package javasessions;

public class Users {
	// methods is the same as functions
	//methods should be independent, method can't be created inside method
	// methods is a piece of code which is reusable
	// method can not be duplicated but can be overloaded
	// method is part of class data member just as variable
	// Method names should start with small letter (came casing)
	
	//1. no input and no return:
	// void: cannot return anything
	public void test() {
		System.out.println("test method");
	}
	// 2. return
	public int getNumber() {
		System.out.println("get number");
		return 100;
	}
	public boolean isForgotPasswordExist() {
		System.out.println("checking forgot password link");
		return true;
	}
	//3. some input and some return
	public int add(int a, int b)//parameter
	{
		System.out.println("add method");
		int c = a+b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		Users obj = new Users();
		obj.test();
		int num = obj.getNumber();
		System.out.println(num);
		boolean flag = obj.isForgotPasswordExist();
		if(flag) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		int sum = obj.add(10, 20);//arguments
		System.out.println(sum+(5/100));
		
		int s = obj.add(30, 40);
		System.out.println(s+40);
	
			

	}

}
