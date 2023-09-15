package Kursovaya;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Хранилище с данными о сотрудниках
        Employee[] employees = new Employee[10]; {
            employees[0] = new Employee("Достоевский", "Федор", "Михайлович", 1, 65000);
            employees[1] = new Employee("Томпсон", "Хантер", "Стоктон", 2, 70000);
            employees[2] = new Employee("Буковски", "Чарльз", "Генри", 3, 75000);
            employees[3] = new Employee("Ницше", "Фридрих", "Вильгельм", 4, 66000);
            employees[4] = new Employee("Питерсон", "Джордан", "Бернт", 5, 69000);
            employees[5] = new Employee("Мартин", "Джордж", "Реймонд", 1, 74000);
            employees[6] = new Employee("Булгаков", "Михаил", "Афанасьевич", 2, 55000);
            employees[7] = new Employee("Паланик", "Чарльз", "Майкл", 3, 50000);
            employees[8] = new Employee("По", "Эдгар", "Аллан", 4, 57000);
            employees[9] = new Employee("Чехов", "Антон", "Павлович", 5, 77000);
        }

        Employee.delimiter();
        //Список сотрудников и их данных
        System.out.println("1.Список сотрудников и данные о них: \n" + Arrays.toString(employees));
        Employee.delimiter();
        //Сумма затрат на зарплаты сотрудников за месяц
        System.out.println("2.Сумма затрат на зарплаты за месяц: " + Employee.salarySum(employees));
        Employee.delimiter();
        //Сотрудник с минимальной зарплатой
        System.out.println("3.Сотрудник с минимальной зарплатой: " + Employee.salaryMin(employees));
        Employee.delimiter();
        //Сотрудник с максимальной зарплатой
        System.out.println("4.Сотрудник с минимальной зарплатой: " + Employee.salaryMax(employees));
        Employee.delimiter();
        //Среднее значение зарплат сотрудников
        System.out.println("5.Среднее значение зарплат за месяц: " + Employee.salaryAverage(employees));
        Employee.delimiter();
        //ФИО всех сотрудников:
        System.out.println("6.ФИО всех сотрудников: ");
        Employee.employeeNames(employees);
        Employee.delimiter();
    }
}