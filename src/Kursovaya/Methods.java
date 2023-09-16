package Kursovaya;
public class Methods {

    //Метод для индексирования зарплат:
    public static double salaryIndexing(Employee[] o) {
        double salaryIndexing = 0;
        double percent = 7.2;
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            salaryIndexing = element.getEmpSalary() + ((element.getEmpSalary() * percent) / 100 );
            System.out.println(salaryIndexing);
        }
        return salaryIndexing;
    }

    //Метод для получения отдела сотрудника с минимальной зарплатой:
    public static Employee minSalaryInDepartment(Employee[] o, int department) {
        Employee[] employees = (Employee[]) o;
        Employee salaryMin = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getEmpDepartment() == department && employees[i].getEmpSalary() > salaryMin.getEmpSalary()) {
                salaryMin = employees[i];
            }
        }
        return salaryMin;
    }

    //Метод для получения отдела сотрудника с максимальной зарплатой:
    public static Employee maxSalaryInDepartment(Employee[] o, int department) {
        Employee[] employees = (Employee[]) o;
        Employee salaryMax = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getEmpDepartment() == department && employees[i].getEmpSalary() < salaryMax.getEmpSalary()) {
                salaryMax = employees[i];
            }
        }
        return salaryMax;
    }

    //Метод для получения суммы затрат на зарплату по отделу
    public static double sumSalaryInDepartment(Employee[] o, int department) {
        Employee[] employees = (Employee[]) o;
        double salarySum = 0;
        for (Employee element : employees) {
            if (element.getEmpDepartment() == department) {
                salarySum += element.getEmpSalary();
            }
        }
        return salarySum;
    }

    //Метод для получения средней зарплаты в отделе
    public static double averageSalaryInDepartment(Employee[] o, int department) {
        Employee[] employees = (Employee[]) o;
        double salaryAverage1 = 0;
        double salaryAverage2 = 0;
        int counter = 0;

        for (Employee element : employees) {
            if (element.getEmpDepartment() == department) {
                counter++;
                salaryAverage1 = (salaryAverage1 + element.getEmpSalary());
                salaryAverage2 = salaryAverage1 / counter;
            }
        }
        return salaryAverage2;
    }

    //Метод для получения зарплаты сотрудников отдела с процентом
    public static void salaryIndexingInDepartment(Employee[] o, int department, double percent) {
        double salaryIndexing1 = 0;
        double salaryIndexing2 = 0;
        double salaryIndexing3 = 0;
        Employee[] employees = (Employee[]) o;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getEmpDepartment() == department) {
                salaryIndexing1 = employees[i].getEmpSalary() / 100;
                salaryIndexing2 = salaryIndexing1 * percent;
                salaryIndexing3 = employees[i].getEmpSalary() + salaryIndexing2;
                System.out.println(salaryIndexing3);
            }
        }
    }

    public static void allEmloInDepartment(Employee[] o, int department) {
        Employee[] employees = (Employee[]) o;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getEmpDepartment() == department) {
                System.out.println(employees[i].getId() + 1 + ". ФИО - " + employees[i].getEmployeeLastName() + " " + employees[i].getEmployeeFirstName() + " " + employees[i].getEmployeeMiddleName() + ", Зарплата - " + employees[i].getEmpSalary());
            }
        }
    }

    public static void salaryLessThan(Employee[] o, int anyNumber) {
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            if (element.getEmpSalary() < anyNumber) {
                System.out.println("id - " + element.getId() + ". ФИО - " + element.getEmployeeLastName() + " " + element.getEmployeeFirstName() + " " + element.getEmployeeMiddleName() + ", Зарплата - " + element.getEmpSalary());
            }
        }
    }

    public static void salaryMoreThan(Employee[] o, int anyNumber) {
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            if (element.getEmpSalary() > anyNumber) {
                System.out.println("id - " + element.getId() + ". ФИО - " + element.getEmployeeLastName() + " " + element.getEmployeeFirstName() + " " + element.getEmployeeMiddleName() + ", Зарплата - " + element.getEmpSalary());
            }
        }
    }
}

