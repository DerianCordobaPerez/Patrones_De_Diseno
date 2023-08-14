package com.derian;

public class Main {

    public static void main(String[] args) {
        try {
            FechaHora fh = new FechaHora(1, 6, 2010, 10, 30);
            Reunion r = new Reunion("Proyecto", "Roberto, María, Javier", "Sala reunión 1",fh);

            System.out.println("\n- Antes de ejecutar los comandos:" + r.toString());

            ComandoDeshacer comando = new ComandoCambiarLocalizacion();
            comando.setReunion(r);

            Invocador inv = new Invocador();
            inv.setComando(comando);
            inv.ejecutaComando("Sala de reunion 2");
            System.out.println("\n- Después de ejecutar el comando localización:" + r.toString());
            inv.deshacerComando();System.out.println("\n- Deshacer:" + r.toString());
            inv.rehacerComando();
            System.out.println("\n- Rehacer:" + r.toString());
            comando = new ComandoCambiarFecha();
            comando.setReunion(r);

            inv.setComando(comando);
            inv.ejecutaComando("5/6/2010/12:30");
            System.out.println("\n- Después de ejecutar el comando fecha:" + r.toString());
            inv.deshacerComando();
            System.out.println("\n- Deshacer:" + r.toString());
            inv.rehacerComando();
            inv.rehacerComando();
            System.out.println("\n- Rehacer:" + r.toString());

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
