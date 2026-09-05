
abstract class Person {

    private String name;
    private String id;

    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    String getName() {
        return name;
    }

    String getId() {
        return id;
    }

    abstract String getRole();

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}


class Student extends Person {

    private int[] marks;

    Student(String name, String id, int[] marks) {
        super(name, id);

        this.marks = marks;
    }

    int[] getMarks() {
        return marks;
    }

    int highestMark() {

        int highest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }

        return highest;
    }

    @Override
    String getRole() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student - " + super.toString()
                + ", Highest Mark: " + highestMark();
    }
}


class Instructor extends Person {

    private String subject;

    Instructor(String name, String id, String subject) {
        super(name, id);

        this.subject = subject;
    }

    @Override
    String getRole() {
        return "Instructor";
    }

    @Override
    public String toString() {
        return "Instructor - " + super.toString()
                + ", Subject: " + subject;
    }
}


class CampusRegistry {

    private Person[] people;
    private int size;

    CampusRegistry(int capacity) {
        people = new Person[capacity];
        size = 0;
    }


    // Add a person when space is available
    void addPerson(Person person) {

        if (size < people.length) {
            people[size] = person;
            size++;

            System.out.println(person.getName() + " added to registry.");
        } else {
            System.out.println("Registry is full.");
        }
    }


    // Feature 1: Search for a person using name
    Person searchByName(String name) {

        for (int i = 0; i < size; i++) {

            if (people[i].getName().equalsIgnoreCase(name)) {
                return people[i];
            }
        }

        return null;
    }


    // Feature 2: Find Student with highest result
    Student findTopStudent() {

        Student topStudent = null;

        for (int i = 0; i < size; i++) {

            // Safe instanceof check and downcast
            if (people[i] instanceof Student) {

                Student student = (Student) people[i];

                if (topStudent == null
                        || student.highestMark() > topStudent.highestMark()) {

                    topStudent = student;
                }
            }
        }

        return topStudent;
    }


    // Display all people using Person references
    void displayAll() {

        System.out.println("\n--- Campus Registry ---");

        for (int i = 0; i < size; i++) {

            // Runtime polymorphism
            System.out.println(people[i]);
            System.out.println("Role: " + people[i].getRole());
            System.out.println();
        }
    }
}


public class CampusManagementApp {

    public static void main(String[] args) {

        CampusRegistry registry = new CampusRegistry(6);


        // Student objects
        int[] marks1 = {85, 90, 78};
        int[] marks2 = {92, 88, 95};
        int[] marks3 = {75, 80, 72};


        Student student1 =
                new Student("Rahul", "S101", marks1);

        Student student2 =
                new Student("Priya", "S102", marks2);

        Student student3 =
                new Student("Aman", "S103", marks3);


        // Instructor objects
        Instructor instructor1 =
                new Instructor("Dr. Sharma", "I101", "Java");

        Instructor instructor2 =
                new Instructor("Dr. Mehta", "I102", "Database");


        // Add mixed Person objects to registry
        registry.addPerson(student1);
        registry.addPerson(student2);
        registry.addPerson(student3);
        registry.addPerson(instructor1);
        registry.addPerson(instructor2);


        // Display all people
        registry.displayAll();


        // Feature 1: Search by name
        System.out.println("--- Search Result ---");

        Person found = registry.searchByName("Priya");

        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Person not found.");
        }


        // Feature 2: Find student with highest result
        System.out.println("\n--- Top Student ---");

        Student topStudent = registry.findTopStudent();

        if (topStudent != null) {
            System.out.println(topStudent);
        } else {
            System.out.println("No students found.");
        }
    }
}
