package com.example;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        Car blackOctavia = factory.createBlackOctavia("4A2 3020");
        Car blueOctavia = factory.createBlueOctavia("1P3 4747");
        Car redOctavia = factory.createRedOctavia("2B3 1111");

        /*
        Car blackOctavia = Factory.createBlackOctavia("4A2 3020");
        Car blueOctavia = Factory.createBlueOctavia("1P3 4747");
        Car redOctavia = Factory.createRedOctavia("2B3 2376");
        */
        System.out.println(blackOctavia);
        System.out.println(blueOctavia);
        System.out.println(redOctavia);

        Player player = new Player.Builder("negr")
                .setHealth(120)
                .setDamage(30)
                .build();

        System.out.println(player);
    }
}