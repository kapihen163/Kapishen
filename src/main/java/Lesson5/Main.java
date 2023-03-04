package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Ivan", "Intern", "ivivan@mailbox.com", "892312312", 30000, 30);
        Employee employee2 = new Employee("Petrov Ivan", "Engineer", "iv@mailbox.com", "892311235", 40000, 43);
        Employee employee3 = new Employee("Ivanov Dima", "Konstruktor", "ivi@mailbox.com", "892315872", 50000, 45);
        Employee employee4 = new Employee("Ivi Van", "Engineer", "van@mailbox.com", "858712312", 32000, 36);
        Employee employee5 = new Employee("Von Chen", "Иetrayer", "von@mailbox.com", "892318912", 40000, 38);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
//            employee.printInfo();
        }


//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].getAge() > 40) {
//                employees[i].print();
//            }
//        }
//        employee1.printInfo();
//        employee2.printInfo();
//        employee3.printInfo();
//        employee4.printInfo();
//        employee5.printInfo();

    }


}
