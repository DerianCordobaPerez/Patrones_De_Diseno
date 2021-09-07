public class Mergo extends Pato 
{
	public Mergo()
	{
		comportamientoVolar = new VolarAlto();
		comportamientoGraznar = new GraznarAlto();
	}
	
	public String dibujar()	
	{
		return "- Soy un pato Mergo -";
	}
} 