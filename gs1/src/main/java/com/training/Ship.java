package com.training;

public class Ship {

    String name;
    Wood wood;

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", wood=" + wood +
                '}';
    }

    public Ship(String name, Wood wood) {
        this.name = name;
        this.wood = wood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wood getWood() {
        return wood;
    }

    public void setWood(Wood wood) {
        this.wood = wood;
    }
}
