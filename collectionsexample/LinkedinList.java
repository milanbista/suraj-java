package collectionsexample;


class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class LinkedinList {

    public static void main(String[] args) {

      Node head = new Node(10);
      head.next = new Node(20);

      //head.next.next = new Node(30);
        Node temp = head.next;
        temp.next = new Node(30);


        Node a = head;

        while(a != null){
            System.out.println(a.data);
            a = a.next;
        }



    }

}
