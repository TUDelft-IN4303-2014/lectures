public class Overriding {

	public static void main(String[] args) {

		A a  = new A(); 
		B b  = new B(); 
		A ab = b;
		F f  = new F(); 
		G g  = new G(); 
		H h  = new H(); 

		System.out.println("callee f");
		System.out.println("parameter b");
		f.m(b); 
		
		System.out.println("callee g");
		System.out.println("parameter a");
		g.m(a); 
		
		System.out.println("parameter b");
		g.m(b); 
        
		System.out.println("parameter ab");
		g.m(ab); 
        
		System.out.println("callee h");
		System.out.println("parameter a");
		h.m(a);
        
		System.out.println("parameter b");
		h.m(b);
        
		System.out.println("parameter ab");
		h.m(ab);
	}
}
