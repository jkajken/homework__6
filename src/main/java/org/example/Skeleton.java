package org.example;

public class Skeleton extends Boss {
    public Skeleton(int health, int damage, Weapon weapon, int arrow) {
        super(health, damage, weapon);

        this.arrow = arrow;
    }

    private int arrow;

    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    @Override
    public String printinfo() {
        return super.printinfo() + getArrow();
    }
}
