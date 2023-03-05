public class Employee {
    private String fio;
    private int department;
    private int salary;
    private static int idCount = 1;
    private int id;

    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.id = idCount;
        idCount++;
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
    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setDepartment(int fio) {
        this.department = department;
    }
    public void setSalary(int Salary) {
        this.salary = salary;
    }
    public String toString() {
        return id + ". " + fio + ". Отдел: " + department + ". Заработная плата: " + salary + " руб.";
    }

      public static Employee[] toPrint(Employee [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        return a;
    }
    public static Employee[] toPrintFio(Employee [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].getFio());
        }
        return a;
    }



    public static int sum (Employee[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].getSalary();
            sum = sum + a;
        }
        return sum;
    }
    public static int toPrintSum (Employee[]arr) {
        Employee.sum(arr);
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + Employee.sum(arr) + " рублей.");
        return Employee.sum(arr);
    }
    public static int min (Employee[] arr) {
        int a = 200_000;
        String b = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary()<= a){
                a = arr[i].getSalary();
                b = arr[i].getFio();
            }
        }
        System.out.println("Минимальная заработная плата составляет " + a + " рублей, у сторудника " + b);
        return a;
    }
        public static int max (Employee[] arr) {
        int a = 0;
        String b = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary()>= a) {
                a = arr[i].getSalary();
                b = arr[i].getFio();
            }
        }
        System.out.println("Максимальная заработная плата составляет " + a + " рублей, у сторудника " + b);
        return a;
    }
    public static float middle (Employee[] arr) {
        Employee.sum(arr);
        int a = arr.length;
        float middle = (float) Employee.sum(arr) / a;
        System.out.println("Средняя сумма заработной платы составила " + middle);
        return middle;
    }

}



