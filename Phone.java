
public abstract class Phone implements PhoneInterface {
    private final String brand; 
    private final String model; 

    
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "Phone{brand='" + brand + "', model='" + model + "'}";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Phone phone = (Phone) obj;
        return brand.equals(phone.brand) && model.equals(phone.model);
    }
}
