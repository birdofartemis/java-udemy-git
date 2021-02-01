package com.company.poo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    SimpleDateFormat sdf = new SimpleDateFormat("(dd/MM/yyyy)");
    private String name;
    private String email;
    private Date birth;

    public Client(String name, String email, Date birth) {
        this.name = name;
        this.email = email;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String toString(){
        return getName() + " " + sdf.format(getBirth()) + " - " + getEmail();
    }
}
