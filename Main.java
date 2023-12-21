public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe");
        Employee employee2 = new Employee("Jessie", "James", 25);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());

        employee1.setAge(30);
        employee1.setSalary(2500.0);
        employee2.setAge(30);
        employee2.setSalary(3000.0);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}