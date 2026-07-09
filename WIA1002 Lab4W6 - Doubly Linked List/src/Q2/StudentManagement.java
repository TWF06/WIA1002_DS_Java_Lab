package Q2;

import java.util.Scanner;

public class StudentManagement<E> {
    // Inner Node Class
    private static class Node<E> {
        E element;
        Node<E> next;
        Node(E e) { this.element = e; }
    }

    private Node<E> head;
    private int size = 0;

    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void removeElement(E e) {
        if (head == null) return;
        if (head.element.equals(e)) {
            head = head.next;
            size--;
            return;
        }
        Node<E> current = head;
        while (current.next != null) {
            if (current.next.element.equals(e)) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public void replace(E e, E newE) {
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) {
                current.element = newE;
                return;
            }
            current = current.next;
        }
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.element + (current.next != null ? ", " : "."));
            current = current.next;
        }
        System.out.println();
    }

    public int getSize() { return size; }
}



class TestStudentList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManagement<String> studentList = new StudentManagement<>();

        // 1. Input Section: Admin enters names 
        System.out.println("Enter your student name list. Enter 'n' to end....");
        while (true) {
            String name = input.nextLine();
            if (name.equalsIgnoreCase("n")) break;
            studentList.add(name);
        }

        // 2. Display initial list and size
        System.out.println("\nYou have entered the following students' name:");
        studentList.printList(); 
        System.out.println("The number of students entered is: " + studentList.getSize()); 

        // 3. Rename Section 
        System.out.println("\nAll the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        String choice = input.nextLine();
        
        if (choice.equalsIgnoreCase("r")) {
            System.out.println("Enter the existing student name that u want to rename:");
            String oldName = input.nextLine();
            System.out.println("Enter the new name:");
            String newName = input.nextLine();
            
            studentList.replace(oldName, newName); 
            System.out.println("The new student list is:");
            studentList.printList();
        }

        // 4. Remove Section
        System.out.println("\nDo you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        choice = input.nextLine();
        
        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter a student name to remove:");
            String toRemove = input.nextLine();
            
            studentList.removeElement(toRemove);
            System.out.println("The number of updated student is " + studentList.getSize());
            System.out.println("The updated students list is:");
            studentList.printList();
        }

        System.out.println("All student data captured complete. Thank you!");
        input.close();
    }
}