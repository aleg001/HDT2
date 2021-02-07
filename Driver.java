/***************************************************************
* Driver.java
* Autor: Alejandro Gómez
* Universidad del Valle de Guatemala
*
* Fecha creacion: 29/01/21
* Ultima modificacion: 6/02/21
***************************************************************/
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        //Se crea un scanner
        Scanner s = new Scanner(System.in);
        //Se crea instancia de operaciones
        Operaciones calcu = new Operaciones();
        //Se presenta mensaje de bienvenida
        System.out.println("Simulador de calculadora:");
        System.out.println("Bienvenido");
        System.out.println("Escriba el nombre de su archivo");
        System.out.println("Pro tip: Solo puede ser datos.txt :)");
        String fileUsada = s.nextLine();
        System.out.println(calcu.decode(fileUsada));  
    }
}
