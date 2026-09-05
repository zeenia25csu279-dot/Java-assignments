interface Payable {

    double calculatePayment();
}


abstract class Employee implements Payable {

    private String name;
    private String employeeId;

    Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    String getName() {
        return name;
    }

    String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Employee ID: " + employeeId;
    }
}


class SalariedEmployee extends Employee {

    private double monthlySalary;

    SalariedEmployee(String name, String employeeId, double monthlySalary) {
        super(name, employeeId);

        if (monthlySalary <= 0) {
            throw new IllegalArgumentException("Salary must be positive");
        }

        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePayment() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "Salaried Employee - "
                + super.toString()
                + ", Monthly Salary: " + monthlySalary
                + ", Payment: " + calculatePayment();
    }
}


class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double hourlyRate;

    HourlyEmployee(String name, String employeeId,
                   double hoursWorked, double hourlyRate) {

        super(name, employeeId);

        if (hoursWorked <= 0 || hourlyRate <= 0) {
            throw new IllegalArgumentException(
                    "Hours and hourly rate must be positive");
        }

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePayment() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return "Hourly Employee - "
                + super.toString()
                + ", Hours: " + hoursWorked
                + ", Rate: " + hourlyRate
                + ", Payment: " + calculatePayment();
    }
}


class Invoice implements Payable {

    private String invoiceId;
    private double amount;

    Invoice(String invoiceId, double amount) {

        this.invoiceId = invoiceId;

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Invoice amount must be positive");
        }

        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice - Invoice ID: " + invoiceId
                + ", Amount: " + amount
                + ", Payment: " + calculatePayment();
    }
}


class PayrollProcessor {

    private Payable[] payments;
    private int size;

    PayrollProcessor(int capacity) {
        payments = new Payable[capacity];
        size = 0;
    }


    // Add a Payable object when space is available
    void addPayment(Payable payment) {

        if (size < payments.length) {
            payments[size] = payment;
            size++;

            System.out.println("Payment object added.");
        } else {
            System.out.println("Payroll processor is full.");
        }
    }


    // Calculate total payment
    double calculateTotalPayment() {

        double total = 0;

        for (int i = 0; i < size; i++) {
            total = total + payments[i].calculatePayment();
        }

        return total;
    }


    // Feature 1: Find largest payment
    Payable findLargestPayment() {

        if (size == 0) {
            return null;
        }

        Payable largest = payments[0];

        for (int i = 1; i < size; i++) {

            if (payments[i].calculatePayment()
                    > largest.calculatePayment()) {

                largest = payments[i];
            }
        }

        return largest;
    }


    // Feature 2: Count Employees and non-Employees
    void countPaymentTypes() {

        int employeeCount = 0;
        int nonEmployeeCount = 0;

        for (int i = 0; i < size; i++) {

            // Safe instanceof check
            if (payments[i] instanceof Employee) {

                Employee employee = (Employee) payments[i];

                System.out.println(
                        "Employee: " + employee.getName()
                        + ", ID: " + employee.getEmployeeId());

                employeeCount++;

            } else {
                nonEmployeeCount++;
            }
        }

        System.out.println("Employee Payments: " + employeeCount);
        System.out.println("Non-Employee Payments: " + nonEmployeeCount);
    }


    // Display all payment objects
    void displayAllPayments() {

        System.out.println("\n--- All Payments ---");

        for (int i = 0; i < size; i++) {
            System.out.println(payments[i]);
        }
    }
}


public class PayrollManagementApp {

    public static void main(String[] args) {

        PayrollProcessor processor = new PayrollProcessor(6);


        // Create Employee objects
        SalariedEmployee employee1 =
                new SalariedEmployee(
                        "Rahul", "E101", 50000);

        SalariedEmployee employee2 =
                new SalariedEmployee(
                        "Priya", "E102", 60000);

        HourlyEmployee employee3 =
                new HourlyEmployee(
                        "Aman", "E103", 160, 250);


        // Create non-Employee Payable objects
        Invoice invoice1 =
                new Invoice("INV101", 15000);

        Invoice invoice2 =
                new Invoice("INV102", 25000);


        // Add mixed Payable objects
        processor.addPayment(employee1);
        processor.addPayment(employee2);
        processor.addPayment(employee3);
        processor.addPayment(invoice1);
        processor.addPayment(invoice2);


        // Display all payments
        processor.displayAllPayments();


        // Calculate total payment
        System.out.println("\n--- Total Payment ---");

        double total = processor.calculateTotalPayment();

        System.out.println("Total Payment: " + total);


        // Feature 1: Find largest payment
        System.out.println("\n--- Largest Payment ---");

        Payable largest = processor.findLargestPayment();

        if (largest != null) {
            System.out.println(largest);
        }


        // Feature 2: Count Employee and non-Employee
        System.out.println("\n--- Payment Type Count ---");

        processor.countPaymentTypes();
    }
}
