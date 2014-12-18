package lab27;

import java.awt.Color;

//Zadatak sa predavanja

public class Vukodlak extends Prikaza{

	public Color bojaDlake;

	public Vukodlak(String ime)
	{
		super(ime);
	}
	
	public void zavijaj()
	{
		System.out.println( "AUUUUUUU!!!");
	}
	
	public void kreciSe()
	{
		System.out.println("Hodaj kao vukodlak");
	}
}
