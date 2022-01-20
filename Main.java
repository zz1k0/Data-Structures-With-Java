// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
  public static void main(String[] args) {
     
     var list = new LinkedList();
     
     list.addLast(10);
     list.addLast(20);
     list.addLast(30);
     
    System.out.println(list.indexOf(20));
    
  }
}


class LinkedList{
  
  private class Node{
      private int value  ;
      private Node next; 
      
      public Node(int value){
          this.value = value  ;
      }
  }
  
  
  private Node first ; 
  private Node last ; 
  
  //addLast  
  
  public void addLast(int item){
      var node  = new Node(item);
      
      if(isEmpty())
       first = last = node ; 
      else {
      last.next = node ; 
      last = node ; 
      }

  } 
  
  
  public void addFirst(int item){
      var node = new Node(item);
      if(isEmpty())
        first = last = node ; 
      else{
          node.next = first;
          first = node ; 
      }
  }
  
  public int indexOf(int item){
      int index=  0 ;
      var current  = first ; 
      while(current != null){
          if(current.value == item) return index; 
          current = current.next; 
          index++;
      }
      return -1 ;
  }
  
  private boolean isEmpty(){
      return first == null; 
  }
  
}