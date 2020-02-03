package com.example.styleomegafashionstore.model;

public class Cart {
    private String pid, pname, pprice, quantity, time;

    public Cart() {
    }

    public Cart(String pid, String pname, String pprice, String quantity, String time) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
        this.quantity = quantity;
        this.time = time;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPprice() {
        return pprice;
    }

    public void setPprice(String pprice) {
        this.pprice = pprice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
