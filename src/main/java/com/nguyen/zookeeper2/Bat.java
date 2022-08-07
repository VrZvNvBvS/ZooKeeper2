package com.nguyen.zookeeper2;

public class Bat {
    public int energyLevel = 300;

        public void fly() {
            energyLevel -= 50;
            System.out.println("Screech Flap-itty Flapp Screech!");
            System.out.println("Bat energy levels are now at: " + energyLevel);
        }
        public void eatHumans() {
            energyLevel += 25;
            System.out.println("Delicious blood everywhere! Yummy!");
            System.out.println("Bat energy levels are now at: " + energyLevel);
        }
        public void attackTown() {
            energyLevel -= 100;
            System.out.println("Call the Fire Department, Bats are raising hell");
            System.out.println("Bat energy levels are now at: " + energyLevel);
        }
}
