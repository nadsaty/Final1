package kursovaya;
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
    public static Employee minSalaryInDepartment(Employee[] departmentSalary, int department) {
        Employee salaryMin = departmentSalary[0];
        for (int i = 1; i < departmentSalary.length; i++) {
            if (departmentSalary[i].getEmpDepartment() == department && departmentSalary[i].getEmpSalary() > salaryMin.getEmpSalary()) {
                salaryMin = departmentSalary[i];
            }
        }
        return salaryMin;
    }

    //Метод для получения отдела сотрудника с максимальной зарплатой:
    public static Employee maxSalaryInDepartment(Employee[] departmentSalary, int department) {
        Employee salaryMax = departmentSalary[0];
        for (int i = 1; i < departmentSalary.length; i++) {
            if (departmentSalary[i].getEmpDepartment() == department && departmentSalary[i].getEmpSalary() < salaryMax.getEmpSalary()) {
                salaryMax = departmentSalary[i];
            }
        }
        return salaryMax;
    }

    //Метод для получения суммы затрат на зарплату по отделу
    public static double sumSalaryInDepartment(Employee[] departmentSalary, int department) {
        double salarySum = 0;
        for (Employee element : departmentSalary) {
            if (element.getEmpDepartment() == department) {
                salarySum += element.getEmpSalary();
            }
        }
        return salarySum;
    }

    //Метод для получения средней зарплаты в отделе
    public static double averageSalaryInDepartment(Employee[] departmentSalary, int department) {
        double salaryAverage1 = 0;
        double salaryAverage2 = 0;
        int counter = 0;

        for (Employee element : departmentSalary) {
            if (element.getEmpDepartment() == department) {
                counter++;
                salaryAverage1 = (salaryAverage1 + element.getEmpSalary());
                salaryAverage2 = salaryAverage1 / counter;
            }
        }
        return salaryAverage2;
    }

    //Метод для получения зарплаты сотрудников отдела с процентом
    public static void salaryIndexingInDepartment(Employee[] departmentSalary, int department, double percent) {
        double salaryIndexing1 = 0;
        double salaryIndexing2 = 0;
        double salaryIndexing3 = 0;
        for (int i = 0; i < departmentSalary.length; i++) {
            if (departmentSalary[i].getEmpDepartment() == department) {
                salaryIndexing1 = departmentSalary[i].getEmpSalary() / 100;
                salaryIndexing2 = salaryIndexing1 * percent;
                salaryIndexing3 = departmentSalary[i].getEmpSalary() + salaryIndexing2;
                System.out.println(salaryIndexing3);
            }
        }
    }

    //Все сотрудники отдела
    public static void allEmloInDepartment(Employee[] departmentSalary, int department) {
        for (int i = 0; i < departmentSalary.length; i++) {
            if (departmentSalary[i].getEmpDepartment() == department) {
                System.out.println(departmentSalary[i].getId() + 1 + ". ФИО - " + departmentSalary[i].getEmployeeLastName() + " " + departmentSalary[i].getEmployeeFirstName() + " " + departmentSalary[i].getEmployeeMiddleName() + ", Зарплата - " + departmentSalary[i].getEmpSalary());
            }
        }
    }

    //Сотрудники отдела с зарплатой меньше заданного числа
    public static void salaryLessThan(Employee[] departmentSalary, int anyNumber) {
        for (Employee element : departmentSalary) {
            if (element.getEmpSalary() < anyNumber) {
                System.out.println("id - " + element.getId() + ". ФИО - " + element.getEmployeeLastName() + " " + element.getEmployeeFirstName() + " " + element.getEmployeeMiddleName() + ", Зарплата - " + element.getEmpSalary());
            }
        }
    }

    //Сотрудники отдела с зарплатой больше заданного числа
    public static void salaryMoreThan(Employee[] departmentSalary, int anyNumber) {
        for (Employee element : departmentSalary) {
            if (element.getEmpSalary() > anyNumber) {
                System.out.println("id - " + element.getId() + ". ФИО - " + element.getEmployeeLastName() + " " + element.getEmployeeFirstName() + " " + element.getEmployeeMiddleName() + ", Зарплата - " + element.getEmpSalary());
            }
        }
    }
}

