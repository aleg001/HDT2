/***************************************************************
* Calculadora.java
* Autor: UVG
* Universidad del Valle de Guatemala
*
* Fecha creacion: 29/01/21
* Ultima modificacion: 6/02/21
***************************************************************/
public interface calculadora 
{
    /*
    Pre: 2 ints
    Post: 1 int
    */
    public int suma(int x, int y);
      /*
    Pre:2 ints
    Post: 1 int
    */
    public int resta(int x, int y);
      /*
    Pre: 2 int
    Post: 1 int
    */
    public int multiplicacion(int x, int y);
      /*
    Pre: 2 int
    Post: 1 int
    */
    public int division(int x, int y);
  /*
    Pre: 1 stack
    Post: resultados de stack
    */
    public int operar(Stack x);//operar recibe un stack en formato postfix, y lo opera para devolver un entero que es igual al valor total de la operación
      /*
    Pre: 1 string
    Post: 1 string con operaciones
    */
    public String decode(String a);//función que se encarga de leer el archivo y decodificar cada línea para realizar las operaciones de cada una
}