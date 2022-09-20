
package mylinkedlist;

public class MyLinkedList {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
         System.out.println(l.search(4));
         System.out.println(l.get(1));
        l.insertBefore(1,0);
        l.insertAfter(2,5);
        l.remove(3);
         System.out.println(l.peekLast());
        l.reverse();

        l.print();
         System.out.println(l.pop());
    }
    
}
