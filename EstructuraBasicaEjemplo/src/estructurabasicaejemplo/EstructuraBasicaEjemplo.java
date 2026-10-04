/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurabasicaejemplo;

/**
 *
 * @author jocab
 */
public class EstructuraBasicaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre = "Jocabed";
       int edad = 19;
       double salario = 45000.50;
       boolean esEmpleado = true;
       
       double SalarioAnual = salario * 12;
       int edadProxima = edad + 1;
       
       System.out.println("=== INFORMACION DEL EMPLEADO ===");
       System.out.println("Nombre; "+ nombre);
       System.out.println("Edad actual: "+ edad);
       System.out.println("Edad proximo año: "+ edadProxima);
       System.out.println("Salario mensual: $" + salario);
       System.out.println("Salario Anual: $" + SalarioAnual);
       System.out.println("¿Es empleado activo? " + esEmpleado);
    }
    
}
