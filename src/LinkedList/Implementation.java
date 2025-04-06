package LinkedList;

public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size()){
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            }
            for(int i = 1; i <= idx -1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
         int getAt(int idx){
            if(idx < 0 || idx > size()){
                System.out.println("Wrong Indez");
                return -1;
            }
            Node temp = head;
            for(int i = 0; i < idx -1; i++){
                temp = temp.next;
            }
            return temp.data;
         }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
              temp =  temp.next;
            }
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count ++;
                temp = temp.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(9);
        ll.insertAtEnd(8);
        ll.insertAtHead(13);
//        ll.display();
        ll.insertAt(2, 15);
        ll.display();
        System.out.println(ll.getAt(2));
        System.out.println();
        System.out.println(ll.size());
    }
}
