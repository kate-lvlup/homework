package products;

import java.sql.SQLOutput;

public class Product {
    protected int weight;
    protected int size;
    protected String color;
    protected boolean withBone;

    public Product(int weight, int size, String color, boolean withBone) {
        this.weight = weight;
        this.size = size;
        this.color = color;
        this.withBone = withBone;
    }

    public void growingPlace() {
        System.out.println("Product is grown on Earth");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
