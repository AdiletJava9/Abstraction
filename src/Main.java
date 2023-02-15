public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Adilet", "Men", 0);
        System.out.println(employee1);
        employee1.work();
        Employee employee = new Employee("Arzybek", "Men", 1);
        System.out.println(employee);
        employee.work();

    }
}