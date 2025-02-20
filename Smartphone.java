
public class Smartphone extends Phone {
    private final String os; 
    private final int storage; 

    public Smartphone(String brand, String model, String os, int storage) {
        super(brand, model); 
        this.os = os;
        this.storage = storage;
    }


    public Smartphone(String brand, String model) {
        this(brand, model, "Unknown OS", 64); 
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + " using smartphone...");
    }

    public void browseInternet(String website) {
        System.out.println("Browsing website: " + website);
    }

   
    public void browseInternet(String website, boolean incognito) {
        if (incognito) {
            System.out.println("Browsing website in incognito mode: " + website);
        } else {
            browseInternet(website);
        }
    }


    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", os='" + os + '\'' +
                ", storage=" + storage +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Smartphone)) return false;
        if (!super.equals(obj)) return false;
        Smartphone that = (Smartphone) obj;
        return storage == that.storage && os.equals(that.os);
    }
}
