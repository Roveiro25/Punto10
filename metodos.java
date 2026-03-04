
import java.util.Scanner;

public class metodos{
    public objProducto[][] llenar(objProducto[][] m, Scanner sc) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) 
            {


                objProducto o = new objProducto();

                System.out.print("Nombre: ");
                o.setNombre(sc.next());

                System.out.print("Precio: ");
                o.setPrecio(sc.nextDouble());

                String respuesta;
                boolean oferta;

                do {
                    System.out.print("¿Está en oferta? (true/false): ");
                    respuesta = sc.next().toLowerCase();

                    if (respuesta.equals("true")) {
                        oferta = true;
                    } else if (respuesta.equals("false")) {
                        oferta = false;
                    } else {
                        oferta = false; // valor temporal
                        System.out.println("Solo se permite true o false. Intente nuevamente.");
                    }

                } while (!respuesta.equals("true") && !respuesta.equals("false"));

                o.setEnOferta(oferta);

                m[i][j] = o;
            }
        }

        return m;    
    }
    public int contarOfertas(objProducto[][] m) {

        int contador = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j].isEnOferta()) {
                    contador++;
                }
            }
        }
        return contador;
    }
}