package com;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MainFrame extends JFrame {
    ImageIcon rainImage = new ImageIcon("C:\\Users\\dreed\\IdeaProjects\\Frame\\src\\resources\\Rain.jpg");
    ImageIcon campFire = new ImageIcon("C:\\Users\\dreed\\IdeaProjects\\Frame\\src\\resources\\campfire.jpg");
    ImageIcon fanPic = new ImageIcon("C:\\Users\\dreed\\IdeaProjects\\Frame\\src\\resources\\Fan.jpg");
    ImageIcon wavesPic = new ImageIcon("C:\\Users\\dreed\\IdeaProjects\\Frame\\src\\resources\\Waves.jpg");

    public MainFrame() {

        JLabel newLabel = new JLabel();
        newLabel.setSize(100,100);
        setLayout(new GridLayout(2,2));

        JButton rain = new JButton("Rain", rainImage);
        rain.setVerticalTextPosition(SwingConstants.BOTTOM);
        rain.setHorizontalTextPosition(SwingConstants.CENTER);
        rain.setBounds(200,200,700,700);
        setLayout(new FlowLayout());
        add(rain);
        setVisible(true);
        rain.setIcon(resizeIcon(rainImage, rain.getWidth(), rain.getHeight()));

        JButton fire = new JButton("Camp Fire", campFire);
        fire.setVerticalTextPosition(SwingConstants.BOTTOM);
        fire.setHorizontalTextPosition(SwingConstants.CENTER);
        fire.setBounds(200,200,700,700);
        setLayout(new FlowLayout());
        add(fire);
        setVisible(true);
        fire.setIcon(resizeIcon(campFire, rain.getWidth(), rain.getHeight()));


        JButton fan = new JButton("Fan", fanPic);
        fan.setVerticalTextPosition(SwingConstants.BOTTOM);
        fan.setHorizontalTextPosition(SwingConstants.CENTER);
        fan.setBounds(200,200,700,700);
        setLayout(new FlowLayout());
        add(fan);
        setVisible(true);
        fan.setIcon(resizeIcon(fanPic, rain.getWidth(), rain.getHeight()));


        JButton waves = new JButton("Waves", wavesPic);
        waves.setVerticalTextPosition(SwingConstants.BOTTOM);
        waves.setHorizontalTextPosition(SwingConstants.CENTER);
        waves.setBounds(200,200,700,700);
        setLayout(new FlowLayout());
        add(waves);
        setVisible(true);
        waves.setIcon(resizeIcon(wavesPic, rain.getWidth(), rain.getHeight()));


    }

    private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight){
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
}