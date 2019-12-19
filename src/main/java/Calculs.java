package main;

public class Calculs

{

	private final int operande1;

	private final int operande2;

	public Calculs(int operande1, int operande2)

	{

		this.operande1 = operande1;

		this.operande2 = operande2;

	}

	public int multiplier()

	{

		return operande1 * operande2;

	}

	public int additionner()

	{

		return operande1 + operande2;

	}

	public int diviser()

	{
	//	if(this.operande2 == 0) {
	//	System.out.println("DIVISION PAR 0 !");
	//	return 0;
	//	}
	//	else {
		return operande1 / operande2;	
	//	}
		

	}

	public int soustraire()

	{

		return operande1 - operande2;

	}
	
	public static void main(String[] args) {
		Calculs calculs = new Calculs(-8454, 0);
		
		System.out.println(calculs.multiplier());
		System.out.println(calculs.additionner());
		System.out.println(calculs.diviser());
		System.out.println(calculs.soustraire());
		
	}

}
