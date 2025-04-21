public class Samsung extends Phone{
    public Samsung(String brand, String model, double price, String colour, String batteryLife, String ram, String security) {
        super(brand, model, price, colour, batteryLife, ram, security);
    }
    public  void installApp(){
        System.out.println();
    }
    public  void scanQRCodes(){}
    public void useFingerPrint(){}
    public void useFaceUnlock(){}

    public Samsung() {
        super.makesCall();
        super.getBatteryPercentage();
    }
}

