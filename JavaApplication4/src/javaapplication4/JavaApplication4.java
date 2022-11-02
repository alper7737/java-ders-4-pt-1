/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JavaApplication4 {


    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout(FlowLayout.LEFT,30,30));
        JLabel la = new JLabel("Sen Kimsin?");
        JButton bu = new JButton("iptal");
        f.add(la);
        f.add(bu);
        f.setSize(800,500);
        f.setVisible(true);
    }
    
}
