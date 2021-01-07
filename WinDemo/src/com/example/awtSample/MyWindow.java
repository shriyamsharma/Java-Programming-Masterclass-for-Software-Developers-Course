package com.example.awtSample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sanSerifLarge = new Font("SanSerif", Font.BOLD, 18);
        Font sanSerifSmall = new Font("SanSerif", Font.BOLD, 12);
        g.setFont(sanSerifLarge);
        g.drawString("Future Java Developer ", 60, 60);
        g.setFont(sanSerifSmall);
        g.drawString("Shriyam Sharma", 60, 100);


    }
}
