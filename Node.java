class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StudentLinkedList {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    
    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 6. Delete a specified value
    public void delete(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
 public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        
        list.append(101);
        list.append(102);
        list.append(103);
        list.append(104);
        list.append(105);

        // 3. Display initial values
        System.out.print("Initial:\n");
        list.display();
        System.out.println();

        System.out.println("Insert 100:");
        list.insertAtBeginning(100);
        list.display();
        System.out.println();

        int searchValue = 103;
        if (list.search(searchValue)) {
            System.out.println("Search " + searchValue + ": Found");
        } else {
            System.out.println("Search " + searchValue + ": Not Found");
        }
        System.out.println();

        
        System.out.println("Delete 103:");
        list.delete(103);

        // 7. Display final linked list
        list.display();
    }
}
