class DoublyNode {
    int data;
    DoublyNode prev;
    DoublyNode next;

    // Constructor
    DoublyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    DoublyNode head;

    // Add a node to the end of the list
    public void add(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            DoublyNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Print the doubly linked list
    public void printList() {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " ⇔ " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    // Remove a node from the list
    public void removeNode(DoublyNode node) {
        if (node == null) {
            return;
        }
        if (node == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            if (node.next != null) {
                node.next.prev = node.prev;
            }
            if (node.prev != null) {
                node.prev.next = node.next;
            }
        }
        node.next = null;
        node.prev = null;
    }

    // Find a node with a specific value
    public DoublyNode findNode(int value) {
        DoublyNode temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Test Case 1
        DoublyLinkedList list1 = new DoublyLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.print("Original List: ");
        list1.printList();
        DoublyNode nodeToRemove1 = list1.findNode(3);
        list1.removeNode(nodeToRemove1);
        System.out.print("List After Removing Node 3: ");
        list1.printList();

        // Test Case 2
        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.add(10);
        System.out.print("\nOriginal List: ");
        list2.printList();
        DoublyNode nodeToRemove2 = list2.findNode(10);
        list2.removeNode(nodeToRemove2);
        System.out.print("List After Removing Node 10: ");
        list2.printList();
    }
}
