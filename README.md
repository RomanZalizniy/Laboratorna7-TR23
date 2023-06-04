# Laboratorna7-TR23(For ukrainian and foreign users)
Опис надано українською, and for english users I translated it for English!(Scroll down to the bottom)

Код першої програми представляє собою програму для таксі яка рандомно вибирає машину та водія на виклик. Код до другої програми це телефонна книга яка приймає як ключі прізвища, а значення це номери телефону цих людей, також може по введенемоу прізвищу в консоль може видаляти запис з книги.

Для запуску першої програми потрібно виконати наступні кроки:

1)	Завантажте та встановіть JDK (Java Development Kit) на свій комп'ютер, якщо це ще не зроблено.
2)	Створіть новий проект в редакторі коду (наприклад, IntelliJ IDEA або Eclipse).
3)	Створіть два нових класи Car і Driver у цьому пакеті та скопіюйте відповідний код у відповідні файли з розширенням .java.

4)	Створіть третій клас Zavd1 і скопіюйте код запуску в цей клас.


Опис бібліотек:

java.util.ArrayList: Ця бібліотека надає клас ArrayList, який є динамічним масивом в мові Java. Він забезпечує можливість додавання, видалення та зміни елементів у списку. ArrayList автоматично збільшує свій розмір при додаванні нових елементів і зменшує його при видаленні. Це робить його зручним для роботи зі списками об'єктів, як у даному коді, де використовуються списки автомобілів та водіїв.

java.util.Random: Ця бібліотека містить клас Random, який дозволяє генерувати випадкові значення. Вона надає різноманітні методи для отримання випадкових чисел, включаючи цілі числа, числа з плаваючою точкою та булеві значення. У даному коді клас Random використовується для генерації випадкового індексу для вибору автомобіля зі списку cars.


Короткий опис коду:
Ця програма моделює деякі дії з автомобілями та водіями. У програмі створюються об'єкти класу Driver з різними характеристиками, такими як ім'я, вік та досвід. Також створюються об'єкти класу Car, які представляють автомобілі з різними характеристиками, такими як марка, потужність двигуна, водій, ціна та рік випуску.

Програма містить декілька операцій над об'єктами Car і Driver. Наприклад, заміна водіїв та ремонт двигуна. Крім того, здійснюється збільшення потужності та ціни деяких автомобілів. Також перевіряється досвід водіїв і, в разі відповідних умов, збільшується досвід.

На завершення, програма вибирає випадковий автомобіль зі списку та виводить повідомлення про те, який автомобіль з водієм виїхав за вами. Потім виводиться повідомлення про прибуття водія на місце.

Для запуску першої програми потрібно виконати наступні кроки:

1)	Створіть клас PhoneBook у попередньому проекті та скопіюйте відповідний код у відповідні файли з розширенням .java.

2)	Створіть другий клас Zavd2 і скопіюйте код запуску в цей клас.


Клас PhoneBook:

Бібліотеки:
java.util.HashMap: Використовується для створення об'єкту HashMap, який зберігає прізвища та номери телефонів.

java.util.Map: Використовується для роботи з колекцією Map, яка представляє собою асоціативний масив ключ-значення.

Опис: 
Клас PhoneBook містить метод main, який є точкою входу в програму. У цьому методі створюється об'єкт phoneBook типу HashMap, який використовується для зберігання прізвищ та номерів телефонів. Далі виконуються дії з книгою: додавання записів, отримання розміру книги, виведення всіх записів, пошук номера телефону за прізвищем, видалення запису, перевірка наявності значення в книзі.

Клас запуску Zavd2:

Бібліотеки:
java.util.HashMap: Використовується для створення об'єкту HashMap, який зберігає прізвища та номери телефонів.
java.util.Map: Використовується для роботи з колекцією Map, яка представляє собою асоціативний масив ключ-значення.
java.util.Scanner: Використовується для зчитування введення користувача з консолі.

Опис: 
Клас Zavd2 містить метод main, який є точкою входу в програму. У цьому методі створюється об'єкт phoneBook типу HashMap, який використовується для зберігання прізвищ та номерів телефонів. Далі виконуються дії з книгою: виведення всіх записів, введення прізвища для пошуку номеру телефону, пошук номера телефону за прізвищем, видалення запису, виведення кількості записів у книзі.
Обидва коди використовують бібліотеки java.util.HashMap та java.util.Map для роботи з колекціями HashMap, які забезпечують ефективне зберігання та доступ до даних у вигляді ключ-значення. Клас Zavd2 також використовує бібліотеку java.util.Scanner для зчитування введення з консолі.

__________________________________________________________________________________________________________________________________________________________________

# Laboratorna7-TR23(For ukrainian and foreign users)
The description is in Ukrainian, and for English users I translated it for English!

The code for the first program is a taxi program that randomly selects a car and a driver for a call. The code for the second program is a phone book that accepts surnames as keys, and the values are the phone numbers of these people, and can also delete an entry from the book by entering the name in the console.

To run the first program, you need to follow these steps:

1) Download and install the JDK (Java Development Kit) on your computer, if you haven't already.
2) Create a new project in a code editor (for example, IntelliJ IDEA or Eclipse).
3) Create two new Car and Driver classes in this package and copy the corresponding code to the appropriate files with the .java extension.

4) Create a third class, Zavd1, and copy the startup code into this class.


Description of the libraries:

java.util.ArrayList: This library provides the ArrayList class, which is a dynamic array in Java. It provides the ability to add, delete, and modify items in a list. ArrayList automatically increases its size when new items are added and decreases its size when deleted. This makes it convenient for working with lists of objects, as in this code, where lists of cars and drivers are used.

java.util.Random: This library contains the Random class, which allows you to generate random values. It provides a variety of methods for generating random numbers, including integers, floating point numbers, and Boolean values. In this code, the Random class is used to generate a random index to select a car from the cars list.


A brief description of the code:
This program simulates some actions with cars and drivers. The program creates objects of the Driver class with various characteristics, such as name, age, and experience. It also creates objects of class Car, which represent cars with different characteristics, such as brand, engine power, driver, price, and year of manufacture.

The program contains several operations on Car and Driver objects. For example, replacing drivers and repairing the engine. In addition, the power and price of some cars can be increased. The experience of drivers is also checked and, if appropriate, their experience is increased.

Finally, the program selects a random car from the list and displays a message about which car and driver has picked you up. Then a notification is displayed when the driver arrives at the location.

To run the first program, follow these steps:

1) Create the PhoneBook class in the previous project and copy the corresponding code to the appropriate files with the .java extension.

2) Create a second Zavd2 class and copy the launch code to this class.


PhoneBook class:

Libraries:
java.util.HashMap: Used to create a HashMap object that stores names and phone numbers.

java.util.Map: Used to work with the Map collection, which is an associative key-value array.

Description: 
The PhoneBook class contains the main method, which is the entry point to the program. This method creates a phoneBook object of type HashMap, which is used to store names and phone numbers. Next, actions are performed with the book: adding records, getting the size of the book, displaying all records, searching for a phone number by name, deleting a record, checking for a value in the book.

Zavd2 startup class:

Libraries:
java.util.HashMap: Used to create a HashMap object that stores names and phone numbers.
java.util.Map: Used to work with the Map collection, which is an associative key-value array.
java.util.Scanner: Used to read user input from the console.

Description: 
The Zavd2 class contains the main method, which is the entry point to the program. This method creates a phoneBook object of type HashMap, which is used to store names and phone numbers. Next, the following actions are performed with the book: displaying all records, entering a last name to search for a phone number, searching for a phone number by last name, deleting a record, and displaying the number of records in the book.
Both codes use the java.util.HashMap and java.util.Map libraries to work with HashMap collections, which provide efficient storage and access to data in the form of a key-value. The Zavd2 class also uses the java.util.Scanner library to read input from the console.
