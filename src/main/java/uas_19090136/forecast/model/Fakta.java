package uas_19090136.forecast.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fakta {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private int sk_employee;
    private int  amount;
    private int sk_product;
    private int sk_customer;
    private int sk_waktu;

    public Fakta(){

    }
    public Fakta(int id, int sk_employee, int amount, int sk_product, int sk_customer, int sk_waktu) {
        this.id = id;
        this.sk_employee = sk_employee;
        this.amount = amount;
        this.sk_product= sk_product;
        this.sk_customer= sk_customer;
        this.sk_waktu=sk_waktu;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSk_employee() {
        return sk_employee;
    }
    public void setSk_employee(int sk_employee) {
        this.sk_employee = sk_employee;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getsk_product() {
        return sk_product;
    }
    public void setsk_product(int sk_product) {
        this.sk_product = sk_product;
    }
    public int getsk_customer() {
        return sk_customer;
    }
    public void setsk_customer(int sk_customer) {
        this.sk_customer = sk_customer;
    }

    public int getsk_waktu() {
        return sk_waktu;
    }
    public void setsk_waktu(int sk_waktu) {
        this.sk_waktu = sk_waktu;
    }

}
