package kursovaya;
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
        this.id = ++counter;
    }

    //Геттеры сотрудника:
    public String getEmployeeFirstName() {return employeeFirstName;}
    public String getEmployeeLastName() {return employeeLastName;}
    public String getEmployeeMiddleName() {return employeeMiddleName;}
    public int getEmpDepartment() {return empDepartment;}
    public double getEmpSalary() {return empSalary;}
    public double getSalarySum() {return salarySum;}
    public int getId() {return id;}


    //Сеттеры отдела и зарплаты:
    public void setEmpDepartment() {
        this.empDepartment = empDepartment;
    }
    public void setEmpSalary() {
        this.empSalary = empSalary;
    }

    //Разделитель текста
    public static void delimiter() {
        System.out.println("\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx \n");
    }


    //Статические методы для взаимодействия с массивом

    //1.Получить список сотрудников и данных по ним:
    public String toString() {
        return id + 1 + ". ФИО - " + employeeLastName + " " + employeeFirstName + " " + employeeMiddleName + ", Отдел - " + empDepartment + ", Зарплата - " + empSalary + "\n";
    }

    //2.Получить сумму затрат на зарплаты за месяц:
    public static double salarySum(Employee[] salary) {
        double salarySum = 0;
        for (Employee element : salary) {
            salarySum += element.empSalary;
        }
        return salarySum;
    }

    //3.Получить сотрудника с минимальной зарплатой:
    public static Employee salaryMin(Employee[] salary) {
        Employee salaryMin = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (salary[i].getEmpSalary() < salaryMin.empSalary) {
                salaryMin = salary[i];
            }
        }
        return salaryMin;
    }

    //4.Получить сотрудника с максимальной зарплатой:
    public static Employee salaryMax(Employee[] salary) {
        Employee salaryMax = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (salary[i].getEmpSalary() > salaryMax.empSalary) {
                salaryMax = salary[i];
            }
        }
        return salaryMax;
    }

    //5.Получить среднее значение зарплат за месяц:
    public static double salaryAverage(Employee[] salary) {
        double salaryAverage = 0;
        double averageSalary = 0;
        for (Employee element : salary) {
            averageSalary = (salaryAverage += element.empSalary) / salary.length;
        }
        return averageSalary;
    }

    //6.Получить ФИО всех сотрудников:
    public static void employeeNames(Employee[] salary) {
        String employeeNames = null;
        for (Employee element : salary) {
            employeeNames = element.employeeLastName + " " + element.employeeFirstName + " " + element.employeeMiddleName + " ";
            System.out.println(employeeNames);
        }
    }
}