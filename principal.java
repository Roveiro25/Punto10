
import java.util.Scanner;

public class principal{
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        metodos met = new metodos();

        System.out.print("Ingrese dimensión n de la matriz: ");
        int n = sc.nextInt();

       objProducto[][] productos = new objProducto[n][n];

        productos = met.llenar(productos, sc);

        int totalOfertas = met.contarOfertas(productos);

        System.out.println("\nTotal de productos en oferta: " + totalOfertas);
    }
}