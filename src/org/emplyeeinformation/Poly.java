package org.emplyeeinformation;

public class Poly {
	public void sports() {
		System.out.println("No of player per team in Cricket is 11 ");
	}
	public void sports(int U) {
		System.out.println("Number of umpires : " + U);
	}
	public void sports(String S, int U) {
		System.out.println("Msd Dhoni's Jersey number is " + U);	
	}
	public void sports(float A) {
		System.out.println("Ms dhoni's average in cricket is "+A);
	}
	public void sports(String S, int U, char L) {
		System.out.println("Number of players participate in football is " + U +" " +", We can call football as "+ L);
	}
	public void sports(long L, char M) {
	System.out.println("Ronaldo's overall asset is "+ L + M);	
	}
	public void sports(boolean B) {
		System.out.println("All the inputs provided above is " + B);
	}
public static void main(String[] args) {
	Poly P = new Poly();
	P.sports();
	P.sports(2);
	P.sports("Ms dhoni is the best finisher in the game", 7);
	P.sports(44.27f);
	P.sports("Football is a hard game of all games", 22, 'F');
	P.sports(5667865l,'B');
	P.sports(true);
}	
}
