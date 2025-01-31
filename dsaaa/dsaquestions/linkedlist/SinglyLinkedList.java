class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    // Add a new node to the end of the list
    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    // Function to reverse the linked list without modifying the original list
    public SinglyLinkedList reverse() {
        SinglyLinkedList reversedList = new SinglyLinkedList();
        Node current = head;

        while (current != null) {
            Node newNode = new Node(current.data);
            newNode.next = reversedList.head;
            reversedList.head = newNode;
            current = current.next;
        }

        return reversedList;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Test Case 1
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.print("Original List: ");
        list1.printList();
        SinglyLinkedList reversedList1 = list1.reverse();
        System.out.print("Reversed List: ");
        reversedList1.printList();

        // Test Case 2
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.add(5);
        list2.add(10);
        list2.add(15);
        list2.add(20);
        System.out.print("\nOriginal List: ");
        list2.printList();
        SinglyLinkedList reversedList2 = list2.reverse();
        System.out.print("Reversed List: ");
        reversedList2.printList();

        // Test Case 3 (Edge Case: empty list)
        SinglyLinkedList list3 = new SinglyLinkedList();
        System.out.print("\nOriginal List: ");
        list3.printList();
        SinglyLinkedList reversedList3 = list3.reverse();
        System.out.print("Reversed List: ");
        reversedList3.printList();
    }
}
