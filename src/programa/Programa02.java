
package programa;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Programa02 {
public static void main(String[]args){
double radio,Areacirculo;
Scanner lectura = new Scanner ( System.in);  
DecimalFormat formato= new DecimalFormat("##.##");
System.out.print("Ingrese el radio del circulo:");
radio=lectura.nextDouble();
 Areacirculo=Math.PI*Math.pow(radio,2); 
 System.out.println("El area de circulo es:"+formato.format (Areacirculo));    
}
}