public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    // insert 1, 3, 6, 9
    list.insert(1);
    list.insert(9);
    list.insert(6);
    list.insert(3);

    list.debugPrint();
  }
}