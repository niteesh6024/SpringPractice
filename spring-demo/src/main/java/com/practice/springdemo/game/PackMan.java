package com.practice.springdemo.game;

public class PackMan implements GameConsole{
    public void up() {
        System.out.println("hit");
    }

    public void down() {
        System.out.println("shoot");
    }

    public void left() {
        System.out.println("say hi");
    }

    public void right() {
        System.out.println("punch");
    }
}
