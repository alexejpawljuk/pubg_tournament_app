package org.alexej.demo.repository;

import jakarta.persistence.*;


@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;
    @Column(name = "title")
    private String title;
    private double price;
    private String avatarPath;
    private String description;

    public Product() {}

    public Product(String title, double price, String avatarPath, String description) {
        this.product_id = product_id;
        this.title = title;
        this.price = price;
        this.avatarPath = avatarPath;
        this.description = description;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", avatarPath='" + avatarPath + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}