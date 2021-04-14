package com;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class Main {
    public static void main(String[] args){

        MainFrame mFrame = new MainFrame();
        mFrame.setLocationRelativeTo(null);
        JFrame.setDefaultLookAndFeelDecorated(true);
        mFrame.setSize(500,500);
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}