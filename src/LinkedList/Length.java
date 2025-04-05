package LinkedList;

public class Length {
    public static void main(String[] args) {
   Node a = new Node(6);
   Node b = new Node(8);
   Node c = new Node(19);
   Node d = new Node(45);
   Node e = new Node(78);
   Node f = new Node( 120);

   a.next = b;
   b.next = c;
   c.next = d;
   d.next = e;
   e.next = f;

        System.out.println(length(a));

    }
    public static int length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
  public static class Node{
        int data;
        Node next;
        Node(int data){
          this.data = data;
        }
  }


}
