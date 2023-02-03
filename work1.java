// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package HW5;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class work1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        Scanner console = new Scanner(System.in);
        System.out.print("Введите фамилию: ");
        String surname = console.next();
        findInPhoneBook(surname);
    }

    public static void addInPhoneBook() {
        phoneBook.put("Иванов", List.of("+7(111)111-11-11", "+7(222)222-22-22"));
        phoneBook.put("Петров", List.of("+7(333)333-33-33", "+7(444)444-44-44"));
        phoneBook.put("Сидоров", List.of("+7(555)555-55-55", "+7(666)666-66-66"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
