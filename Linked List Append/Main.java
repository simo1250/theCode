public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    // Insert 2 numbers at the front
    list.insert(10);  // List: 10
    list.insert(20);  // List: 20 -> 10

    // Append 2 numbers at the end
    list.append(30);  // List: 20 -> 10 -> 30
    list.append(40);  // List: 20 -> 10 -> 30 -> 40

    // Print the final list
    list.debugPrint();  // Should print: 20 10 30 40
  }
}