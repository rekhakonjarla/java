import java.util.*;

public class Double_List {
    static class Node {
        int data;
        Node next, prev;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int option, list_size;
        Node head = null;
        do {
            System.out.println("\n\n** MAIN MENU **");
            System.out.println("Enter 1: To Create List");
            System.out.println("Enter 2: To Display List");
            System.out.println("Enter 3: To Insert At Beginning of List");
            System.out.println("Enter 4: To Insert At…");
            public static void display(Node head) {
        System.out.println("\n\nElements in Double LinkedList are: ");
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
}