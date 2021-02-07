/***************************************************************
* implementacionStack.java
* Autor: Alejandro Gómez
* Universidad del Valle de Guatemala
*
* Fecha creacion: 05/02/21
* Ultima modificacion: 6/02/21
***************************************************************/

import java.util.ArrayList;
import java.util.Vector;

public class ImplementacionStack<E> implements Stack<E> {

    private Vector<E> stackU;

    public ImplementacionStack (){
        this.stackU = new Vector<E>();
    }

    @Override
    /**
     * Método para saber tamanio de Vector
     * 
     * @param n/a
     * @return int
     * @author Alejandro Gomez
     **/
    public int size() {
        return stackU.size();
    }

    @Override
    /**
     * Método push
     * 
     * @param E item
     * @return n/a
     * @author Alejandro Gomez
     **/
    public void push(E item) {
        this.stackU.add(item);
    }

    @Override
        /**
     * Método peek
     * 
     * @param n/a
     * @return E
     * @author Alejandro Gomez
     **/
    public E peek() {
        return(stackU.get(stackU.size() - 1)); }
  
    @Override
    /**
     * Método pop
     * 
     * @param n/a
     * @return E
     * @author Alejandro Gomez
     **/
    public E pop() {
        return (stackU.remove(stackU.size() - 1));}
       
    @Override
    /**
     * Método empty
     * 
     * @param n/a
     * @return E
     * @author Alejandro Gomez
     **/
    public boolean empty() {
        return stackU.isEmpty();
    }

    
 
    } 
    
