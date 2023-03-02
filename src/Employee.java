public class Employee {
    static int count = 0;
    String fio;
    int department;
    int salary;
    int id;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = count;
        count++;
    }





}