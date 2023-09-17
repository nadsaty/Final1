package kursovaya;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //БАЗОВАЯ СЛОЖНОСТЬ

        //Хранилище с данными о сотрудниках
        Employee[] employees = new Employee[10];
            employees[0] = new Employee("Достоевский", "Федор", "Михайлович", 1, 65000);
            employees[1] = new Employee("Томпсон", "Хантер", "Стоктон", 2, 70000);
            employees[2] = new Employee("Буковски", "Чарльз", "Генри", 3, 75000);
            employees[3] = new Employee("Ницше", "Фридрих", "Вильгельм", 4, 66000);
            employees[4] = new Employee("Питерсон", "Джордан", "Бернт", 5, 69000);
            employees[5] = new Employee("Мартин", "Джордж", "Реймонд", 1, 74000);
            employees[6] = new Employee("Булгаков", "Михаил", "Афанасьевич", 2, 55000);
            employees[7] = new Employee("Паланик", "Чарльз", "Майкл", 3, 50000);
            employees[8] = new Employee("По", "Эдгар", "Аллан", 4, 87000);
            employees[9] = new Employee("Чехов", "Антон", "Павлович", 5, 77000);

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
        System.out.println("4.Сотрудник с максимальной зарплатой: " + Employee.salaryMax(employees));
        Employee.delimiter();
        //Среднее значение зарплат сотрудников
        System.out.println("5.Среднее значение зарплат за месяц: " + Employee.salaryAverage(employees));
        Employee.delimiter();
        //ФИО всех сотрудников:
        System.out.println("6.ФИО всех сотрудников: ");
        Employee.employeeNames(employees);
        Employee.delimiter();

        //ПОВЫШЕНААЯ СЛОЖНОСТЬ

        //1. Индексирование зарплат:
        System.out.println(Methods.salaryIndexing(employees));
        Employee.delimiter();

        //2. Получить номер отдела сотрудника и найти:
        //а) отдел сотрудника с минимальной зарплатой
        System.out.println("Отдел сотрудника с минимальной зарплатой - " + Methods.minSalaryInDepartment(employees, 4));
        Employee.delimiter();

        //b) отдел сотрудника с максимальной зарплатой
        System.out.println("Отдел сотрудника с максимальной зарплатой - " + Methods.maxSalaryInDepartment(employees, 2));
        Employee.delimiter();

        //c) сумму затрат на зарплату по отделу
        System.out.println("Сумма затрат на зарплату по отделу - " + Methods.sumSalaryInDepartment(employees, 1));
        Employee.delimiter();

        //d) среднюю зарплату по отделу
        System.out.println("Средняя зарплата по отделу - " + Methods.averageSalaryInDepartment(employees, 3));
        Employee.delimiter();

        //e) проиндексировать зарплату сотрудников отдела на процент, который приходит в качестве параметра
        System.out.println("Зарплаты сотрудников отдела с заданным процентом:");
        Methods.salaryIndexingInDepartment(employees, 2, 1);
        Employee.delimiter();

        //f) напечатать всех сотрудников отдела
        System.out.println("Все сотрудники отдела:");
        Methods.allEmloInDepartment(employees, 2);
        Employee.delimiter();

        //3. Получить в качестве параметра число и найти:
        //a) Сотрудники с зарплатой меньше заданного числа
        System.out.println("Сотрудники с зарплатой меньше заданного числа:");
        Methods.salaryLessThan(employees, 66000);
        Employee.delimiter();

        //b) Сотрудники с зарплатой больше заданного числа
        System.out.println("Сотрудники с зарплатой больше заданного числа:");
        Methods.salaryMoreThan(employees, 52000);
        Employee.delimiter();
    }
}