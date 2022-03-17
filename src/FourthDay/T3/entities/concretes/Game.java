package FourthDay.T3.entities.concretes;

import FourthDay.T3.entities.abstracts.Entity;

public class Game extends Entity {
    private String name;
    private double unitPrice;

    public Game(int id) {
        super(id);
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

    public Game(int id, String name, double unitPrice) {
        super(id);
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public Game(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public Game() {
    }
}
