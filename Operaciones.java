
/***************************************************************
* Calculadora.java
* Autor: Alejandro Gómez
* Universidad del Valle de Guatemala
*
* Fecha creacion: 29/01/21
* Ultima modificacion: 6/02/21
***************************************************************/

public class Operaciones implements calculadora{



    @Override
    /**
     * Devuelve la suma de dos números
     * @param x valor 1 que se suma 
     * @param y valor 2 que se suma
     * @return Resultado de suma x+y
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

    /** */
    
    @Override
    public int multiplicacion(int x, int y) {
        int retorno = x*y;
        return retorno;
        

    }
    /** */
    
    @Override
    public int division(int x, int y) {
        // TODO Auto-generated method stub
        int retorno = x/y;
        return retorno;
    }
    /** */
    
    @Override
    public int operar(stack x) {
        // TODO Auto-generated method stub
        //String oper1 = Stack.
        
        return 0;
    }
    /** */
    

    @Override
    public String decode(String a) {
        // TODO Auto-generated method stub
        return null;
    }
    
}