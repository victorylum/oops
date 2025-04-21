public class Phone {
    public String brand;
    public String model;
    public double price;
    public String colour;
    public String batteryLife;
    public String ram;
    public String security;

    public Phone(String brand, String model, double price, String colour, String batteryLife, String ram, String security) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.batteryLife = batteryLife;
        this.ram = ram;
        this.security = security;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public void makesCall() {
    }

    public void getBatteryPercentage() {
    }


    public void receiveSms() {
    }

    public void receiveCall() {
    }


}