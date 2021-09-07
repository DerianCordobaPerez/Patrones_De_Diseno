public class Goma extends Pato 
{
	public Goma()
	{
		comportamientoVolar = new NoVolar();
		comportamientoGraznar = new NoGraznar();
	}
	
	public String dibujar()	
	{
		return "- Soy un pato de Goma -";
	}
} 