package models;

import java.util.ArrayList;

public class Customers {
    private String name;
    private String cid;
    private String address;
    private Devices device;
    public ArrayList<Order> orders;

    public Customers(String name, String cid, String address) {
        this.name = name;
        this.cid = cid;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Devices getDevice() {
        return device;
    }

    public void setDevices(Devices device) {
        this.device = device;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", cid='" + cid + '\'' +
                ", address='" + address + '\'' +
                ", devices='" + device + '\'' +
                ", orders=" + orders +
                '}';
    }
}
