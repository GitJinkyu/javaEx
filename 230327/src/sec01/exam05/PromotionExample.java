package sec01.exam05;


class A{};
class B extends A{};
class C extends A{};
class D extends B{};
class E extends C{};


public class PromotionExample {
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		A a = new A();
		
	}
}


