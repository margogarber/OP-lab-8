public class Main {
    public static void main(String[] args) {

        Smartphone phone1 = new Smartphone("Apple", "iPhone 16", "iOS", 512);
        Smartphone phone2 = new Smartphone("Samsung", "Galaxy S21", "Android", 256);


        System.out.println(phone1); 
        phone1.makeCall("123456789");
        phone1.browseInternet("example.com");
        phone1.browseInternet("example.com", true);


        System.out.println("Phones are equal: " + phone1.equals(phone2));

  
        System.out.println(phone2); 
        phone2.makeCall("123456789");
        phone2.browseInternet("example.com");
        phone2.browseInternet("example.com", true);


        System.out.println("Phones are equal: " + phone2.equals(phone1));
    }
}
