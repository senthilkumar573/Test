package com.project.work;

import org.junit.jupiter.api.Test;

public class LinkedList {
	
	Node head;  // head of list 
	   
    /* Linked list Node*/
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 

    public void segregateEvenOdd() { 
        
        Node evenStart = null; 
        Node evenEnd = null; 
        Node oddStart = null; 
        Node oddEnd = null; 
        Node currentNode = head; 
          
        while(currentNode != null) { 
            int element = currentNode.data; 
              
            if(element % 2 == 0) { 
                  
                if(evenStart == null) { 
                    evenStart = currentNode; 
                    evenEnd = evenStart; 
                } else { 
                    evenEnd.next = currentNode; 
                    evenEnd = evenEnd.next; 
                } 
                  
            } else { 
                  
                if(oddStart == null) { 
                    oddStart = currentNode; 
                    oddEnd = oddStart; 
                } else { 
                    oddEnd.next = currentNode; 
                    oddEnd = oddEnd.next; 
                } 
            } 
                        // Move head pointer one step in forward direction 
            currentNode = currentNode.next;     
        } 
          
          
        if(oddStart == null || evenStart == null) { 
            return; 
        } 
          
        evenEnd.next = oddStart; 
        oddEnd.next = null; 
        head=evenStart; 
    } 
      
 
    void push(int new_data) 
    { 
       
        Node new_node = new Node(new_data);      
        new_node.next = head; 
        head = new_node; 
    } 
   
    
    void printList() 
    { 
        Node temp = head; 
        while(temp != null) 
        { 
            System.out.print(temp.data+" "); 
            temp = temp.next; 
        } 
        System.out.println(); 
    } 
      
    
    
    public static void main(String args[]) 
    { 
        LinkedList llist = new LinkedList(); 
        llist.push(11); 
        llist.push(10); 
        llist.push(9); 
        llist.push(6); 
        llist.push(4); 
        llist.push(1); 
        llist.push(0); 
        System.out.println("Origional Linked List"); 
        llist.printList(); 
   
        llist.segregateEvenOdd(); 
   
        System.out.println("Modified Linked List"); 
        llist.printList(); 
    } 
    
    
    
    @Test
    public void checkLinkedListOddEven() {
    	LinkedList tester = new LinkedList(); // MyClass is tested

    	 LinkedList llist = new LinkedList(); 
         llist.push(11); 
         llist.push(10); 
         llist.push(9); 
         llist.push(6); 
         llist.push(4); 
         llist.push(1); 
         llist.push(0); 
         System.out.println("Origional Linked List"); 
         llist.printList(); 
    
         llist.segregateEvenOdd(); 
    
         System.out.println("Modified Linked List"); 
         llist.printList(); 
        
        
    }
    
}
