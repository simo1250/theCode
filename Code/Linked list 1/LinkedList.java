public class LinkedList {
  public class Node {
    int data;
    Node next;

    public Node(int d) {
      super();
      this.data = d;
      this.next = null;
    }
  }

  Node head;
  
  public LinkedList() {
    super();
    head = null;
  }
  
  //
  // inserts a new node to the front of the linked list
  //
  public void insert(int d) {
    // first, we create the new node
    Node newNode = new Node(d);

    // now check if the has been started yet
    if (this.head == null) {
      // this is the first element in the list,
      // set the head node
      this.head = newNode;
    } else {
      // list already exists, so move the head to new node and link
      // the new node's next to the current head
      newNode.next = this.head;
      this.head = newNode;
    }
  }

  //
  // traverse the linked list and output the data
  //
  public void debugPrint() {
    Node curNode = this.head;

    while (curNode != null) {
      System.out.println(curNode.data);
      curNode = curNode.next;
    }

    System.out.println("Done");
  }

  public void sort() {
    if (head == null) return;

    boolean swapped;
    do {
      swapped = false;
      Node curNode = head;
      while (curNode.next != null) {
        if (curNode.data > curNode.next.data) {
          int temp = curNode.data;
          curNode.data = curNode.next.data;
          curNode.next.data = temp;
          swapped = true;
        }
        curNode = curNode.next;
      }
    } while (swapped);
  }
}