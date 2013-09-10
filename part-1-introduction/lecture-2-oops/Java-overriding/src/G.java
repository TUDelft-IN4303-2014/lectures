public class G extends F {
	
	/*
	 * In theory, this method can override F.m(B) 
	 * because it has an invariant return type
	 * and contravariant parameter types.
	 * 
	 * However, you will get a compile error
	 * if you enable the @Override annotation.
	 * In Java, overrding requires invariant parameter types.
	 * Instead, G.m is overloaded.
	 * G.m(B) is inherited from F and
	 * G.m(A) is defined in G itself.
	 */
	
	//@Override
	public A m(A a) { System.out.println("G.m(A a)"); return a; }
}
