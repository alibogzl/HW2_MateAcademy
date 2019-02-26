package com.company.Task1;

public class Racket {
    private String shaft;
    private String balance;
    private String brand;
    private int price;

    public void setShaft(String shaft) {
        this.shaft = shaft;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Racket{" +
                "shaft='" + shaft + '\'' +
                ", balance='" + balance + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }


}
