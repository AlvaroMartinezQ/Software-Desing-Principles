package LinkedList;

public interface List_1<T>{
     
    
/** añade un elemento al principio de la lista. */
public void addFirst (T element);
/** añade un elemento al final de la lista. */
public void addLast (T element);
/** añade un elemento en la posicion que marca el indice. Desplaza el resto */
public void add(T element, int index) throws Exception;
/** elimina el primer elemento */
public void removeFirst() throws Exception;
/** elimina el ultimo elemento */
public void removeLast() throws Exception;
/** Elimina el elemento indicado */
public T remove(T element) throws Exception; 
/** Elimina todos los elementos de la lista (la vacia) */
public void clean();
/** comprueba si la lista esta vacia */
public boolean isEmpty();
/** devuelve el indice del elemento dado*/
public int getIndex (T element) throws Exception;
/** devuelve el elemento asociado al indice dado*/
public T get (int index) throws Exception; 
/** devuelve el elemento dado */
public T find (T element) throws Exception;
/** comprueba si existe el elemento dado*/
public boolean contains (T element) throws Exception;
/** devuelve el tamaño de la lista*/
public int getSize ();


}