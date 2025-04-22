public class LinkedList {
  public class Node {
    int data;
    Node next;

    public Node(int d) {
      this.data = d;
      this.next = null;
    }
  }

  Node head;
  Node tail; // add a tail pointer

  public LinkedList() {
    head = null;
    tail = null; // initialize tail
  }

  //
  // Inserts a new node to the front of the linked list
  //
  public void insert(int d) {
    Node newNode = new Node(d);

    if (head == null) {
      head = newNode;
      tail = newNode; // first node is both head and tail
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  //
  // Appends a new node to the end of the linked list
  //
  public void append(int d) {
    Node newNode = new Node(d);

    if (head == null) {
      head = newNode;
      tail = newNode; // first node is both head and tail
    } else {
      tail.next = newNode; // link current tail to new node
      tail = newNode; // update tail to the new node
    }
  }

  //
  // Traverse the linked list and output the data
  //
  public void debugPrint() {
    Node curNode = this.head;

    while (curNode != null) {
      System.out.println(curNode.data);
      curNode = curNode.next;
    }

    System.out.println("Done");
  }
}