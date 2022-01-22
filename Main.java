// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
  public static void main(String[] args) {
     
     var list = new LinkedList();
     
     list.addLast(10);
     list.addLast(20);
     list.addLast(30);

     list.addFirst(9);
    //  System.out.println(list.contains(9));

    //  list.removeFirst();

    list.removeLast();
    // System.out.println(list.size());
    
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
  
  private int size = 0 ; 
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
      size++;
  } 
  
  
  public void addFirst(int item){
      var node = new Node(item);
      if(isEmpty())
        first = last = node ; 
      else{
          node.next = first;
          first = node ; 
      }

      size++;
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
  
  
  //remote first 
  public void removeFirst(){
    
    first = first.next ; 
    size--;
    
  }
  
  
  //remove last 
  public void removeLast(){
    
    int index = 0 ;
    var current  = first ;
    int lastIndex =  indexOf(last.value);
    
    while(current != null){
      
      if(index == (lastIndex-1)){
        last = current ; 
        last.next = null;
        break;
      }
      
      current = current.next; 
      index++;
      
    }    
    size--;
  }
  
  //contain
  public boolean contains(int item){
    return indexOf(item) != -1;
  }
  
  public int size(){
    return size;
  }


  //implementation detail
  private boolean isEmpty(){
      return first == null; 
  }



  public void reverse(){

  }
  
}