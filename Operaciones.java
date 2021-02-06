
/***************************************************************
* Calculadora.java
* Autor: Alejandro Gómez
* Universidad del Valle de Guatemala
*
* Fecha creacion: 29/01/21
* Ultima modificacion: 6/02/21
***************************************************************/

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Operaciones implements calculadora{



    @Override
    /**
     * Devuelve la suma de dos números
     * @param x valor 1 que se suma 
     * @param y valor 2 que se suma
     * @return Resultado de suma x+y
     * @author Alejandro Gomez
     */
    public int suma(int x, int y) {
        
        int retorno = x+y;
        return retorno;
    }

    @Override
       /**
     * Brinda la resta de dos números
     * @param x El valor al que sera restado otro
     * @param y El valor a restar
     * @return El resultado de x-y
     */
    public int resta(int x, int y) {
        int retorno = x-y;
        return retorno;
    }

    
    @Override
        /**
     * Método para multiplicar
     * 
     * @param int x
     * @param int y
     * @return int
     * @author Alejandro Gomez
     **/
    public int multiplicacion(int x, int y) {
        int retorno = x*y;
        return retorno;
        

    }
    /** */
    
    @Override
    /**
     * Método para dividr
     * 
     * @param int x,y
     * @return int
     * @author Alejandro Gomez
     **/
    public int division(int x, int y) {
        int retorno = x/y;
        return retorno;
    }
    /** */
    
    @Override
    public int operar(stack x) {
       
        
        return 0;
    }
    /** */
    

    @Override
       /**
     * Método que hace proceso de decodificar
     * 
     * @param String a
     * @return String
     * @author Alejandro Gomez
     **/
    public String decode(String a) {

        //Referencias: https://stackoverflow.com/questions/13185727/reading-a-txt-file-using-scanner-class-in-java
        //Referencias: https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file

        //----------------------INSTANCIAS---------------------------

        /* Se crean todas las instancias
            a utilizar en este metodo*/
        Scanner f = new Scanner(System.in);
        Stack<String> l = new Stack<String>();
        Stack<String> iL = new Stack<String>();
        Stack<String> iD = new Stack<String>();
        String resultadoLineas = "";
        
        int opsR = 0;

        //-------------------------PROGRA DEFENSIVA----------------------

        /* Se usa un trycatch para asegurarse
            que exista un archivo, y asi 
            accesarlo de forma correcta     */
        try{f = new Scanner(new File(a)); } 
        catch(FileNotFoundException e){
            return("No se ha encontrado un archivo"+ "\n Ingresa un archivo correcto");
        } f.useDelimiter("\n");

        //--------------------------CICLOS------------------------

        /* Se crea un ciclo para revisar el numero
            de lineas, y agregarlas al stack
            con los procesos necesarios para efectuarlas 
        */ 
        while(f.hasNext()){ String fileLines = f.next(); l.push(fileLines);}
        while(!l.empty()){il.push(l.pop());}
        while(il.size()>0){String line = il.pop(); Stack<String> Dat = new Stack<String>(); Scanner lineaS = new Scanner(line);
            while(lineaS.hasNext()){ String datoCrack = lineaS.next(); dat.push(datoCrack);}
            while(!iD.empty()){iD.push(dat.pop());}
            int result = operar(iD);
            opsR++;
            resultadoLineas = resultadoLineas + "Operacion# " + opsR +":"+ Integer.toString(result)+"\n\n";
        }

        return resultadoLineas;

    }
    
}