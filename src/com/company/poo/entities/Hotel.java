package com.company.poo.entities;

public class Hotel {
    private int room;
    private String name;
    private String email;

    public Hotel(int room, String name, String email) {
        this.room = room;
        this.name = name;
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return  room +": " +
                name +", " +
                email;
    }
}
