package Lesson5;

//        1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//        2. Конструктор класса должен заполнять эти поля при создании объекта.
//        3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//        4. Создать массив из 5 сотрудников.
//        Пример:
//        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        потом для каждой ячейки массива задаем объект
//        persArray[1] = new Person(...);
//        ...
//        persArray[4] = new Person(...);
//
//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
public class Employee {
    private String fio;
    private String position;
    private String email;
    private String telephone;
    private int money;
    private int age;

//   public Employee(String fio, String position, String email, int telephone, int money, int age){
//       this.fio = fio;
//       this.position = position;
//       this.email = email;
//       this.telephone = telephone;
//       this.money = money;
//       this.age = age;
//   }

   public Employee(String fio, String position, String email, String telephone, int money, int age) {
      this.fio = fio.toUpperCase();
      this.position = position;
      this.email = email;
      this.telephone = telephone;
      this.money = money;
      this.age = age;
   }

   public void printInfo() {
       System.out.println(String.format("Сотрудник %s имеет: должность %s, email %s, телефон %s, зарплату %s, возраст %s", fio, position,email,telephone,money,age));
    }

   public int getAge() {
      if (age > 40) {
         System.out.println();

      }
      return age;
   }
}
