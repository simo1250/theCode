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

  public LinkedList() {
    head = null;
  }

  //
  // inserts a new node to the front of the circular linked list
  //
  public void insert(int d) {
    Node newNode = new Node(d);

    if (head == null) {
      // Only node in the list, points to itself
      head = newNode;
      newNode.next = head;
    } else {
      Node temp = head;

      // Traverse to the last node (the one pointing to head)
      while (temp.next != head) {
        temp = temp.next;
      }

      // Insert new node at the front
      newNode.next = head;
      temp.next = newNode;
      head = newNode;
    }
  }

  //
  // Traverse the circular linked list and print each node's data twice
  //
  public void debugPrint() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    Node curNode = head;
    int count = 0;

    do {
      System.out.println(curNode.data);
      curNode = curNode.next;

      // increase count if we looped back to the head
      if (curNode == head) {
        count++;
      }
    } while (count < 2);

    System.out.println("Done");
  }
}