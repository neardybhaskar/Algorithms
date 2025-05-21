class EmployeeTest1 {
    String name;
    double salary;

    EmployeeTest1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " has salary: " + salary);
    }

    public static void swapSalaries(double e1, double e2) {
        double temp = e1;
        e1 = e2;
        e2 = temp;
    }

    public static void swapSalaries2(EmployeeTest1 e1, EmployeeTest1 e2) {
        double temp = e1.salary;
        e1.salary = e2.salary;
        e2.salary = temp;
    }

    public static void main(String[] args) {
        EmployeeTest1 emp1 = new EmployeeTest1("Alice", 50000);
        EmployeeTest1 emp2 = new EmployeeTest1("Bob", 60000);

        System.out.println("Before swapping:");
        emp1.display();
        emp2.display();

        swapSalaries(emp1.salary, emp2.salary);
        //swapSalaries2(emp1, emp2);

        System.out.println("\nAfter swapping:");
        emp1.display();
        emp2.display();
    }
}