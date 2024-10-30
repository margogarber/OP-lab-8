// Клас-нащадок "Смартфон"
public class Smartphone extends Phone {
    private final String os; // Незмінний атрибут
    private final int storage; // Незмінний атрибут

    // Конструктор з параметрами
    public Smartphone(String brand, String model, String os, int storage) {
        super(brand, model); // Виклик конструктора базового класу
        this.os = os;
        this.storage = storage;
    }

    // Перевантаження конструктора
    public Smartphone(String brand, String model) {
        this(brand, model, "Unknown OS", 64); // Виклик іншого конструктора
    }

    // Перевантаження методу makeCall
    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " using smartphone...");
    }

    // Метод бізнес-логіки
    public void browseInternet(String website) {
        System.out.println("Browsing website: " + website);
    }

    // Перевантаження методу browseInternet (перевантаження)
    public void browseInternet(String website, boolean incognito) {
        if (incognito) {
            System.out.println("Browsing website in incognito mode: " + website);
        } else {
            browseInternet(website);
        }
    }

    // Реалізація toString()
    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", os='" + os + '\'' +
                ", storage=" + storage +
                '}';
    }

    // Реалізація equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Smartphone)) return false;
        if (!super.equals(obj)) return false;
        Smartphone that = (Smartphone) obj;
        return storage == that.storage && os.equals(that.os);
    }
}