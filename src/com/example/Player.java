package com.example;

public class Player {

    private String name;
    private double health;
    private double damage;
    private double mana;
    private String color;

    private Player(Builder builder) {
        this.name = builder.name;
        this.health = builder.health;
        this.damage = builder.damage;
        this.mana = builder.mana;
        this.color = builder.color;
    }

    public static class Builder {
        private final String name;
        private double health = 100;
        private double damage = 20;
        private double mana = 10;
        private String color = "Red";

        public Builder(String name) {
            this.name = name;
        }

        public Builder setHealth(double health) {
            this.health = health;
            return this;
        }

        public Builder setDamage(double damage) {
            this.damage = damage;
            return this;
        }

        public Builder setMana(double mana) {
            this.mana = mana;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", mana=" + mana +
                ", color='" + color + '\'' +
                '}';
    }
}
