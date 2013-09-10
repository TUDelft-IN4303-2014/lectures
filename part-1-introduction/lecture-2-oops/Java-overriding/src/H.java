public class H extends G {
	
	/*
	 * This method overrides F.m(B) which is inherited from G.
	 * H.m is still overloaded, 
	 * because H.m(A) is also inherited from G.
	 */
	@Override
	public B m(B b) { System.out.println("H.m(B b)"); return b; }
}
