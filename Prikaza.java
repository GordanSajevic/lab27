package lab27;

public class Prikaza {
	
	//Zadatak sa predavanja
	
	public int brojOciju;
	public int brojUdova;
	public String ime;
	
	public Prikaza(int b, int bu, String ime)
	{
		brojOciju = b;
		brojUdova = bu;
		this.ime = ime;
	}
	
	public Prikaza (String ime)
	{
		this(100, 100, ime);
	}
	
	public void kreciSe()
	{
		System.out.println("Krećeš se kao prikaza");
	}
	
	public void prepadni()
	{
		System.out.println("Imaš uopšteno prepadanje");
	}
	
	public void prepadni (Object osoba)
	{
		System.out.println("Prepadni " + osoba);
	}
}
