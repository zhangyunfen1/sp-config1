package zyf.tets1;

public class A {
	
	public A() {
		System.out.println("���췽��");
	}
	public static void main(String[] args) {
		new A();
	}
	static {
		System.out.println("��̬�����");
	}
}
class F{
	public F() {
		System.out.println("F");
	}
}
