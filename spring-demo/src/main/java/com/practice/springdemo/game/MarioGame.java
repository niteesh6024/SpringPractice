package com.practice.springdemo.game;

public class MarioGame implements GameConsole{
    public void up(){
        System.out.println("jump up");
    }
    public void left(){
        System.out.println("move back");
    }
    public void right(){
        System.out.println("move front");
    }
    public void down(){
        System.out.println("jump down");
    }
}
