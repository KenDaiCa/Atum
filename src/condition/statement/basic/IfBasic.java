package condition.statement.basic;


public class IfBasic {
	
	public void demo01() {
		int age = 19;
		if (age > 19) {
			System.out.println("Demo 1 - Above: " + age);
		}else if (age == 19) {
			System.out.println("Demo 1 - Equal: " + age);
		}else {
			System.out.println("Demo 1 - Below: " + age);
		}
		System.out.println("---------------");
	}
	
	public void demo02() {
		boolean result;
		int a = 10;
		int b = 5;
		if (a%b ==0){
			result = true;
			System.out.println("Demo 2 - " + result);
		}else {
			result = false;
			System.out.println("Demo 2 - " + result);
		}
		System.out.println("---------------");
	}
	
	public static void main(String[] args) {
		IfBasic i = new IfBasic();
		i.demo01();
		i.demo02();
	}
	
}
