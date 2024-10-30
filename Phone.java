// Абстрактний базовий клас "Телефон"
public abstract class Phone implements PhoneInterface {
    private final String brand; // Незмінний атрибут
    private final String model; // Незмінний атрибут

    // Конструктор з параметрами
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Гетери
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // Реалізація toString()
    @Override
    public String toString() {
        return "Phone{brand='" + brand + "', model='" + model + "'}";
    }

    // Реалізація equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Phone phone = (Phone) obj;
        return brand.equals(phone.brand) && model.equals(phone.model);
    }
}