package com.example.styleomegafashionstore.model;

public class Products {
    private String date, pid, time, pprice,pname, pdescription, pimage, pcategory ;

    public Products() {

    }

    public Products(String date, String pid, String time, String pprice, String pname, String pdescription, String pimage, String pcategory) {
        this.date = date;
        this.pid = pid;
        this.time = time;
        this.pprice = pprice;
        this.pname = pname;
        this.pdescription = pdescription;
        this.pimage = pimage;
        this.pcategory = pcategory;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPprice() {
        return pprice;
    }

    public void setPprice(String pprice) {
        this.pprice = pprice;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public String getPcategory() {
        return pcategory;
    }

    public void setPcategory(String pcategory) {
        this.pcategory = pcategory;
    }
}
