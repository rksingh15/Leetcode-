/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    // Function to remove a loop in the linked list.
    
   public static  void removeCycle(Node head , Node meetfast)
    {
        Node slow = head;
        Node fast = meetfast;
        
        
        while(slow!=fast)
        {
            
            slow=slow.next;
            fast=fast.next;
            
            
        }
        
       while(slow.next!=fast)
       {
           slow = slow.next;
       }
       slow.next=null;
    }
    public static void removeLoop(Node head) {
         Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
            {
               
                removeCycle(head,fast);
             
                
            }
            
         
        }
      
        
    }
}