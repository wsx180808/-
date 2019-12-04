package web01;

public class Test01 {
	private int count=0;//成员变量 
	
	public void show() {
		int number = 0;//局部变量
		
		count++;
		number++;
		System.out.println("number:"+number);
		System.out.println("count:"+count);
		
	}
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.show();
		t.show();
		t.show();
		t.show();
		t.show();
	}
}
