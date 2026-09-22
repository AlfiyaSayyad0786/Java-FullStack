public class MobilePhone {

    private String brand;
    private String model;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        MobilePhone obj = new MobilePhone();

        obj.setBrand("Vivo");
        obj.setModel("Y16");
        obj.setPrice(35000);

        System.out.println("Brand: " + obj.getBrand());
        System.out.println("Model: " + obj.getModel());
        System.out.println("Price: " + obj.getPrice());
    }
} 
    


