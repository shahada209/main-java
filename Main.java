import java.util.ArrayList;
import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private String studentID;

    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentID);
    }
}

class Teacher extends Person {
    private String employeeID;

    public Teacher(String name, int age, String employeeID) {
        super(name, age);
        this.employeeID = employeeID;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + employeeID);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        while (true) {
            System.out.println("Pilih jenis data yang ingin dimasukkan:");
            System.out.println("1. Student");
            System.out.println("2. Teacher");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1/2/3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            if (choice == 3) {
                break;
            }

            System.out.print("Masukkan nama: ");
            String name = scanner.nextLine();
            System.out.print("Masukkan umur: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            if (choice == 1) {
                System.out.print("Masukkan Student ID: ");
                String studentID = scanner.nextLine();
                persons.add(new Student(name, age, studentID));
            } else if (choice == 2) {
                System.out.print("Masukkan Employee ID: ");
                String employeeID = scanner.nextLine();
                persons.add(new Teacher(name, age, employeeID));
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        System.out.println("\nData yang telah dimasukkan:");
        for (Person person : persons) {
            person.display();
            System.out.println();
        }

        scanner.close();
    }
}
