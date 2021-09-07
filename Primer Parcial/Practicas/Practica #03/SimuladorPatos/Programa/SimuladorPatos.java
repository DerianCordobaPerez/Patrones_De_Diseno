public class SimuladorPatos
{
	public static void main( String args[] )
	{
		//Los patos		
		Pato p1 = new Mergo();
		Pato p2 = new Goma();	
		//comportamientos
		NoVolar nv = new NoVolar();
		GraznarAlto ga = new GraznarAlto();
			
		System.out.println("\n### Simulador de patos ###\n");
		//Pato Mergo
		System.out.println(p1.dibujar()+"\n");
		System.out.println(p1.realizarVuelo()+"\n");
		System.out.println(p1.realizarGraznido()+"\n");
		//cambiamos el comportamiento
		System.out.println("El pato 1 se estrella...\n");		
		p1.setComportamientoVolar(nv);
		System.out.println(p1.realizarVuelo()+"\n");
		
		//Pato de Goma
		System.out.println(p2.dibujar()+"\n");
		System.out.println(p2.realizarVuelo()+"\n");
		System.out.println(p2.realizarGraznido()+"\n");
		//cambiamos el comportamiento
		System.out.println("El pato 2 puede graznar...\n");		
		p2.setComportamientoGraznar(ga);
		System.out.println(p2.realizarGraznido()+"\n");											
	}
}