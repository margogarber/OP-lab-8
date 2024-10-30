public class Main {
    public static void main(String[] args) {
        // Створення об'єкта класу-нащадка
        Smartphone phone1 = new Smartphone("Apple", "iPhone 13", "iOS", 128);
        Smartphone phone2 = new Smartphone("Samsung", "Galaxy S21");

        // Демонстрація використання this, super, перевантаження методів та конструкторів
        System.out.println(phone1); // Виклик toString()
        phone1.makeCall("123456789");
        phone1.browseInternet("example.com");
        phone1.browseInternet("example.com", true);

        // Порівняння об'єктів
        System.out.println("Phones are equal: " + phone1.equals(phone2));

        // Демонстрація використання this, super, перевантаження методів та конструкторів
        System.out.println(phone2); // Виклик toString()
        phone2.makeCall("123456789");
        phone2.browseInternet("example.com");
        phone2.browseInternet("example.com", true);

        // Порівняння об'єктів
        System.out.println("Phones are equal: " + phone2.equals(phone1));
    }
}