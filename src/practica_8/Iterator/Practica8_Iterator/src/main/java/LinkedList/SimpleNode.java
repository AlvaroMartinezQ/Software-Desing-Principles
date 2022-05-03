package LinkedList;

public class SimpleNode <T>{
    
    private T element;
    private SimpleNode next;
    
    public SimpleNode (T element, SimpleNode next){
        this.element = element;
        this.next = next;
    }
    
    public T getElement(){
        return element;
    }
    
    public void setElement (T element){
        this.element = element;
    }
    
    public SimpleNode getNext(){
     return next;   
    }
    
    public void setNext (SimpleNode next){
        this.next=next;
    }
    
   
    
    
    
}