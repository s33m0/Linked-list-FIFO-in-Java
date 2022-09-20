package mylinkedlist;
public class LinkedList<T> {
    
   private Node head,tail;
  private int i=0; // for the size.
    
  //here the add is like Queue "first in , first out" (FIFO).
     public void add(T data)
    {
        // Create a new node
        Node newNode = new Node(data);
  
        // Checks if the list is empty
        if (head == null) {
  
            // If list is empty, both head and tail will
            // point to new node
            head = newNode;
            tail = newNode;
        }
        else {
  
            // newNode will be added after tail such that
            // tail's next will point to newNode
            tail.next = newNode;
  
            // newNode will become new tail of the list
            tail = newNode;
        }
        i++;
    }

     //Retrieves, but does not remove, the head (first element) of this list.
    public T peek(){
         if(head!=null){
          return (T) head.value; 
          }
         return null;
       }
    
    //Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.

    public T peekLast(){
          if(tail!=null)
          { return (T) tail.value; }
             
           return null;
    }
   
   // insert before the element that you selected it...
    public void insertBefore(T item,T value){
        if(isExist(item)){
        Node n=new Node(value);
         Node temp=head;
           if(head.value==item){
            n.next=head;
                head=n;
                i++;
         }
         else{
        while(temp!=null&&temp.next.value!=item)
        { temp=temp.next; }
               n.next=temp.next;
                temp.next=n;
                i++;
           }}
        else{
            System.out.println("the element not found!");
        }
           
     }
    
    // insert after the element that you selected it...
     public void insertAfter(T item,T value){
         if(isExist(item)){
        Node newNode=new Node(value);
         Node temp=head;
           if(tail.value==item){
             tail.next = newNode;
             tail = newNode;
             i++;
         }
         else{
        while(temp!=null&&temp.next.value!=item)
        { temp=temp.next; }
               newNode.next=temp.next;
                temp.next=newNode;
             i++;
            }
         }
         else{
             System.out.println("the element not found!");
         }
     }
     
     //finding the element if found it return true, else false.
   public boolean isExist(T value){
        boolean f=false;
         Node temp=head;
        while(temp!=null){
            if(temp.value==value)
            {f=true; break;}
            
            temp=temp.next;
        }
        return f;
    }
        int size(){
        return i;
    }
        
        // this method return the index of the element...
    public int search(T value){
         
       int counter=0;
       
        if(isExist(value)){
          
         Node temp=head;
        while(temp!=null){
            if(temp.value==value){
                break;
            }
             counter++;
            temp=temp.next;
        }}
        else{
            return -1;
        }
        return  counter;
    }
     
     //Returns the element at the specified position in this list.
     public T get(int index){
         int counter=0;
         T element=null;
        if(size()>0){
         Node temp=head;
         
        while(temp!=null&&counter<=index){
            if(counter==index){
              element=(T) temp.value;
              break;
            }
            
            temp=temp.next;
             counter++;
        }}

        return  element;

     }
     
     //Retrieves and removes the head (first element) of this list.
     public T pop(){
           if(size()>0){
         Node temp=head;
          head=head.next;
          i--;
          return (T) temp.value;
           }
           else {
               return null;
           }
          
     }
     
     
    //delete the element that you know index it...
   public void remove(T item){
    
    if(isExist(item)){
         Node delete=head,pre=null;
         if(head.value==item){
         head=head.next;
         }
         else{
        while(delete!=null&&delete.value!=item){
            pre=delete;
            delete=delete.next;
            
        }
            pre.next=delete.next;
            
           if(i>0)   // if the size greater than zero , decr i--;
            i--;
         }}
     else
      {  System.out.println("the element not found!"); }
    
       }  
   
   // remove all the elements...
     public void clear(){
       if(head==null) 
           return;
       
        while(head!=null){
            head=head.next;
        }
        i=0;
      }
       public void reverse(){
       Node pre=null,next,cur;
       cur=head;
        while(cur!=null){

            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        tail=head;
        head=pre;
       
   }
   public void print(){
        Node n=head;
        System.out.print("[ ");
        while(n!=null){
            System.out.print(n.value+" ");
            n=n.next;
        }
        System.out.println("]");
    }
}
