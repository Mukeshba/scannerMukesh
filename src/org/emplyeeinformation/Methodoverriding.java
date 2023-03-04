package org.emplyeeinformation;

public class Methodoverriding extends Poly {
	
	private void Kundhi() {
System.out.println("Nava");
	}
	
	@Override
	public void sports(long L, char M) {
		System.out.println("Nava is playboy");
	}
	
	public static void main(String[] args) {
		Methodoverriding M = new Methodoverriding();
		M.Kundhi();
		M.sports(2234, 'B');
		
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("N");
			
		}
		
	}
	
}
 