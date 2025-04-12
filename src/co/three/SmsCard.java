package co.three;

public class SmsCard {
    String name;
    int num;

    public SmsCard(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public SmsCard() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
