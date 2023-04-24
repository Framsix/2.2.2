package web.model;

public class Car {
    private String model;
    private int yearFactory;
    private int price;

    public Car() {
    }

    public Car(String model, int yearFactory, int price) {
        this.model = model;
        this.yearFactory = yearFactory;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearFactory() {
        return yearFactory;
    }

    public void setYearFactory(int yearFactory) {
        this.yearFactory = yearFactory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearFactory=" + yearFactory +
                ", price=" + price +
                '}';
    }
}
