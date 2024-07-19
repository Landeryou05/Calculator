package com.calculator;

import javax.swing.JFrame;

public class Frame extends JFrame{
    public Frame(){
        super("Calculator");
        this.setVisible(true);
        this.setSize(300,500);
        this.setResizable(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
}
