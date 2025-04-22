public class LinkedList {
  public class Node {
    int data;
    Node next;
    Node prev; // new: pointer to the previous node

    public Node(int d) {
      this.data = d;
      this.next = null;
      this.prev = null;
    }
  }

  Node head;

  public LinkedList() {
    head = null;
  }

  //
  // inserts a new node to the front of the doubly linked list
  //
  public void insert(int d) {
    Node newNode = new Node(d);

    if (head == null) {
      // first node
      head = newNode;
    } else {
      // insert at the front
      newNode.next = head;
      head.prev = newNode; // set the current head's previous to new node
      head = newNode;      // update head to new node
    }
  }

  //
  // traverse the doubly linked list and output the data
  //
  public void debugPrint() {
    Node curNode = head;

    while (curNode != null) {
      System.out.println(curNode.data);
      curNode = curNode.next;
    }

    System.out.println("Done");
  }
}