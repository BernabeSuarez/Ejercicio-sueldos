import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double sueldo = 0;
        int cantidad;

        Scanner seleccion = new Scanner(System.in);
        System.out.println("Ingrese un numero para seleccionar categoria: ");
        cantidad = seleccion.nextInt();

        if (cantidad == 1) {
            sueldo = 15860 + (15860 * 0.10);
        } else {
            if (cantidad == 2) {
                sueldo = 25750.82;
            } else {
                if (cantidad == 3) {
                    sueldo = 32630.80 - (32630.80 * 0.15);
                } else {
                    System.out.println("Ingrese un numero valido entre 1-3: ");
                }
            }
        }

        if (cantidad == 1 || cantidad == 2 || cantidad == 3) {
            System.out.println("El sueldo correspondiente a  la categorioa: " + cantidad + " es de: " + sueldo + "pesos");
        }
    }
}