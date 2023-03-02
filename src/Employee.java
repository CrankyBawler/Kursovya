public class Employee {
    static int count = 1;
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

    public String getFio() {
        return this.fio;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return id + ". " + fio + ". Отдел: " + department + ". Заработная плата: " + salary + " руб.";
    }

    public static int sum(int arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
        // нужно сделат ьметод, который посчитает сумму всех зарплат, попробовать вытянуть из массива черерз getSalary зарплату и посчитать через цикл.

    }
}