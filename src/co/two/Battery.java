package co.two;

public class Battery {
    String name;
    String model;
    String type;
    String standard;
    public Battery(String name, String model, String type, String standard) {
        this.name = name;
        this.model = model;
        this.type = type;
        this.standard = standard;
    }

    public Battery() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
