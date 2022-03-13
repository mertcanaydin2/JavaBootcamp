package ThirdDay;

public class Product {
    int id;
    String name;
    double unitPrice;
    String detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Product() {
    }

    public Product(int id, String name, double unitPrice, String detail) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }
}
