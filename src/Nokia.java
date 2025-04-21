public class Nokia extends Phone {
    public Nokia() {
        super.makesCall();
        System.out.println("yes");
    }

    public Nokia (String brand, String model, double price, String colour, String batteryLife, String ram, String security) {

        super(brand,model,price,colour,batteryLife,ram,security);

    }
    public void useBluetooth(){}
    public void useRadio(){}

}
