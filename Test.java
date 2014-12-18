package lab27;

public class Test {

	//Zadatak sa predavanja
	
	public static void main(String[] args)
	{
		Prikaza priki = new Prikaza("Priki");
		Vukodlak vuki = new Vukodlak("Farkas");
		Vampir draki = new Vampir("Drakula");
		Prikaza noviVukodlak = new Vukodlak("Vilkas");
		vuki.kreciSe();
		vuki.zavijaj();
		priki.kreciSe();
		((Prikaza)noviVukodlak).kreciSe();
		((Vukodlak)noviVukodlak).zavijaj();
		
	}
}
