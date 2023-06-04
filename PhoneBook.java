import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        // Створення об'єкту HashMap для зберігання прізвищ та номерів телефонів
        Map<String, String> phoneBook = new HashMap<>();

        // Додавання елементів до книги
        phoneBook.put("Петров", "123456789");
        phoneBook.put("Іванов", "987654321");
        phoneBook.put("Сидоров", "555555555");
        phoneBook.put("Ковальчук", "111111111");
        phoneBook.put("Семенов", "999999999");
        phoneBook.put("Мельник", "777777777");
        phoneBook.put("Коваленко", "222222222");
        phoneBook.put("Бондаренко", "888888888");
        phoneBook.put("Шевченко", "444444444");
        phoneBook.put("Богданов", "666666666");

        // Отримання розміру книги
        int size = phoneBook.size();
        System.out.println("Кількість записів у книзі: " + size);

        // Виведення всіх записів з книги
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String lastName = entry.getKey();
            String phoneNumber = entry.getValue();
            System.out.println(lastName + ": " + phoneNumber);
        }

        // Пошук номера телефону за прізвищем
        String searchLastName = "Іванов";
        if (phoneBook.containsKey(searchLastName)) {
            String phoneNumber = phoneBook.get(searchLastName);
            System.out.println("Номер телефону для прізвища " + searchLastName + ": " + phoneNumber);
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        // Видалення довільного запису з книги
        String removeLastName = "Коваленко";
        phoneBook.remove(removeLastName);
        System.out.println("Запис для прізвища " + removeLastName + " був видалений");

        // Перевірка наявності значення в книзі
        String searchPhoneNumber = "444444444";
        boolean containsValue = phoneBook.containsValue(searchPhoneNumber);
        System.out.println("Чи є в книзі номер телефону " + searchPhoneNumber + ": " + containsValue);
    }
}
