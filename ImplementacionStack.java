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
    public int size() {
        return stackU.size();
    }

    @Override
    public void push(E item) {
        this.stackU.add(item);
    }

    @Override
    public E peek() {
        return(stackU.get(stackU.size() - 1)); }
  
    @Override
    public E pop() {
        return (stackU.remove(stackU.size() - 1));}
       
    @Override
    public boolean empty() {
        return stackU.isEmpty();
    }

    
 
    } 
    
