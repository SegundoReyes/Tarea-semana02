
package programa;
import java.util.Scanner;
import java.lang.Math;
public class Programa03 {
 public static void main(String[] args) {
double diagonalMayor, diagonalMenor, area;
  Scanner lectura = new Scanner(System.in);
  System.out.print("Ingrese la diagonal mayor (en cm): ");
  diagonalMayor = lectura.nextDouble();
  System.out.print("Ingrese la diagonal menor (en cm): ");
  diagonalMenor = lectura.nextDouble();
  area = (diagonalMayor * diagonalMenor) / 2;
  System.out.println("El área del rombo es: " + area + " cm²");   
}
}