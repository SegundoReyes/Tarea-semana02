
package programa;
import java.util.Scanner;
import java.lang.Math;
public class Programa01 {
 public static void main(String[] args) {
  Scanner lectura= new Scanner(System.in);  
  System.out.print("Ingrese la base del triángulo (cm): ");  
  double base = lectura.nextDouble();  
  System.out.print("Ingrese la altura del triángulo (cm): ");  
  double altura = lectura.nextDouble();   
  double area = (base * altura) / 2;    
  System.out.println("Área de un triángulo");  
  System.out.println("El área del siguiente triángulo con base " + base + " cm y altura de " + altura + " cm es:");  
  System.out.println("Área = (b × h) / 2 = (" + base + " × " + altura + ") / 2 = " + area + " cm²");    
    }
    
}
