public abstract class Pato 
{
	//comportamientos
	IVuelo comportamientoVolar;
	IGraznido comportamientoGraznar;

	//volamos
	public String realizarVuelo() 
	{
		return comportamientoVolar.volar();
	}
	
	//graznamos
	public String  realizarGraznido() 
	{
		return comportamientoGraznar.graznar();
	}
	
	//establecemos un nuevo comportamiento
	public void setComportamientoVolar(IVuelo compv) 
	{
		comportamientoVolar = compv;
	}
	
	public void setComportamientoGraznar(IGraznido compg) 
	{
		comportamientoGraznar = compg;
	}
	
	public String nadar() 
	{ 
		return "* Nado *";
	}
	
	public abstract String dibujar();
}
