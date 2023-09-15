package Kursovaya;
public class Employee {


    //Объявление полей:
    private String employeeLastName;
    private String employeeFirstName;
    private String employeeMiddleName;
    private int empDepartment;
    private double empSalary;
    private static int counter = 0;
    private int id;
    private double salarySum;


    //Данные сотрудника:
    public Employee (String employeeLastName, String employeeFirstName,  String employeeMiddleName, int empDepartment, double empSalary) {
        this.employeeLastName = employeeLastName;
        this.employeeFirstName = employeeFirstName;
        this.employeeMiddleName = employeeMiddleName;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
        this.id = counter++;
    }

    //Геттеры сотрудника:
    public String getEmployeeFirstName() {return employeeFirstName;}
    public String getEmployeeLastName() {return employeeLastName;}
    public String getEmployeeMiddleName() {return employeeMiddleName;}
    public int getEmpDepartment() {return empDepartment;}
    public double getEmpSalary() {return empSalary;}
    public double getSalarySum() {return salarySum;}


    //Сеттеры отдела и зарплаты:
    public void setEmpDepartment() {
        this.empDepartment = empDepartment;
    }
    public void setEmpSalary() {
        this.empSalary = empSalary;
    }

    public static void delimiter() {
        System.out.println("\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx \n");
    }


    //Статические методы для взаимодействия с массивом

    //1.Получить список сотрудников и данных по ним:
    public String toString() {
        return id + 1 + ". ФИО - " + employeeLastName + " " + employeeFirstName + " " + employeeMiddleName + ", Отдел - " + empDepartment + ", Зарплата - " + empSalary + "\n";
    }

    //2.Получить сумму затрат на зарплаты за месяц:
    public static double salarySum(Employee[] o) {
        double salarySum = 0;
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            salarySum += element.empSalary;
        }
        return salarySum;
    }

    //3.Получить сотрудника с минимальной зарплатой:
    public static Employee salaryMin(Employee[] o) {
        Employee[] employees = (Employee[]) o;
        Employee salaryMin = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getEmpSalary() < salaryMin.empSalary) {
                salaryMin = employees[i];
            }
        }
        return salaryMin;
    }

    //4.Получить сотрудника с максимальной зарплатой:
    public static Employee salaryMax(Employee[] o) {
        Employee[] employees = (Employee[]) o;
        Employee salaryMax = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getEmpSalary() > salaryMax.empSalary) {
                salaryMax = employees[i];
            }
        }
        return salaryMax;
    }

    //5.Получить среднее значение зарплат за месяц:
    public static double salaryAverage(Employee[] o) {
        double salaryAverage = 0;
        double averageSalary = 0;
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            averageSalary = (salaryAverage += element.empSalary) / employees.length;
        }
        return averageSalary;
    }

    //6.Получить ФИО всех сотрудников:
    public static void employeeNames(Employee[] o) {
        String employeeNames = null;
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            employeeNames = element.employeeLastName + " " + element.employeeFirstName + " " + element.employeeMiddleName + " ";
            System.out.println(employeeNames);
        }
    }
}