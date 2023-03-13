import org.w3c.dom.ls.LSOutput;

import javax.naming.PartialResultException;
import java.sql.SQLOutput;

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Бобров Ефим Тимофеевич", 4, 26_136);
        employees[1] = new Employee("Гуляев Тихон Константинович", 4, 56_272);
        employees[2] = new Employee("Шашков Савелий Георгьевич", 1, 29_104);
        employees[3] = new Employee("Николаев Остап Пётрович", 3, 56_153);
        employees[4] = new Employee("Шаров Алексей Антонович", 3, 42_883);
        employees[5] = new Employee("Вишнякова Дарина Валентиновна", 1, 96_463);
        employees[6] = new Employee("Калашникова Астра Максовна", 2, 85_946);
        employees[7] = new Employee("Беспалова Роксана Еремеевна", 2, 44_277);
        employees[8] = new Employee("Лазарева Хильда Дмитрьевна", 5, 69_719);
        employees[9] = new Employee("Уварова Дана Евгеньевна", 5, 27_679);

        printEmployess();
        System.out.println();
        System.out.println("Общая сумма зарплат составила " + sum());
        System.out.println();
        System.out.println("Минимльная сумма зарплаты " + minSalary());
        System.out.println();
        System.out.println("Максимальная сумма зарплаты " + maxSalary());
        System.out.println();
        System.out.println("Средняя сумма зарплаты " + averageSalary());
        System.out.println();
        printFIO();
        System.out.println();
        indexSalary(5);
        System.out.println();
        System.out.println(minDepartmentSalary(4));
        System.out.println();
        System.out.println(maxDepartmentSalary(4));
        System.out.println();
        System.out.println(averageDepartmentSalary(4));
        System.out.println();
        indexDepartmentSalary(5, 4);
        System.out.println();
        printDepartment(4);
        System.out.println();
        printEmployessMinSalary(40000);
        System.out.println();
        printEmployessMaxSalary(40000);
    }

    static void printEmployess() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static int sum() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    static Employee minSalary() {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (min == null || employee.getSalary() < min.getSalary()) {
                    min = employee;
                }
            }
        }
        return min;
    }

    static Employee maxSalary() {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (max == null || employee.getSalary() > max.getSalary()) {
                    max = employee;
                }
            }
        }
        return max;
    }

    static double averageSalary() {
        return (double) sum() / employees.length;
    }

    static void printFIO() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFio());
            }
        }
    }

    static void indexSalary(int index) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary((employee.getSalary() + (employee.getSalary() * index) / 100));
                System.out.println("Заработная плата сотрубника " + employee.getFio() + " после индексации равна " + employee.getSalary());
            }
        }
    }

    static Employee minDepartmentSalary(int department) {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    if (min == null || employee.getSalary() < min.getSalary()) {
                        min = employee;
                    }
                }
            }
        }
        return min;
    }


    static Employee maxDepartmentSalary(int department) {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    if (max == null || employee.getSalary() > max.getSalary()) {
                        max = employee;
                    }
                }
            }
        }
        return max;
    }

    static int sumDepartment(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    sum += employee.getSalary();
                }
            }
        }
        return sum;
    }

    static double averageDepartmentSalary(int department) {
        int countDep = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    countDep++;
                }
            }
        }
        return (double) sumDepartment(department) / countDep;
    }

    static void indexDepartmentSalary(int index, int department) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    employee.setSalary((employee.getSalary() + (employee.getSalary() * index) / 100));
                    System.out.println("Заработная плата сотрубника " + employee.getFio() + " после индексации равна " + employee.getSalary());
                }
            }
        }
    }

    static void printDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    System.out.println(employee.getId() + " " + employee.getFio() + " " + employee.getSalary());
                }
            }
        }
    }

    static void printEmployessMinSalary(int salary) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < salary) {
                    System.out.println(employee);
                }
            }
        }
    }

    static void printEmployessMaxSalary(int salary) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= salary) {
                    System.out.println(employee);
                }
            }
        }
    }
}
