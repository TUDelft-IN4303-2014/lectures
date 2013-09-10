public class SingleDispatch {

	public static void main(String[] args) {

		A a  = new A();
		B b  = new B(); 
		A ab = b;
		C c  = new C(); 
		A ac = c;
		D d  = new D(); 
		E e  = new E();
		D de = e;

		System.out.println("callee d");
		System.out.println("parameter a");
		d.m(a); 

		System.out.println("parameter b");
		d.m(b); 

		System.out.println("parameter ab");
		d.m(ab); 

		System.out.println("parameter c");
		d.m(c); 

		System.out.println("parameter ac");
		d.m(ac); 

		System.out.println("callee e");
		System.out.println("parameter a");
		e.m(a); 

		System.out.println("parameter b");
		e.m(b); 

		System.out.println("parameter ab");
		e.m(ab); 

		System.out.println("parameter c");
		e.m(c); 

		System.out.println("parameter ac");
		e.m(ac); 

		System.out.println("callee de");
		System.out.println("parameter a");
		de.m(a); 

		System.out.println("parameter b");
		de.m(b); 

		System.out.println("parameter ab");
		de.m(ab); 

		System.out.println("parameter c");
		de.m(c); 

		System.out.println("parameter ac");
		de.m(ac);      
	}

}
