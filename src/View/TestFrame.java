/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import pokemonproto.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author romul
 */
public class TestFrame extends javax.swing.JFrame{
    private Color bgColor;
    private Color fgColor;
    private javax.swing.JPanel background;
    private javax.swing.JButton iniciar;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    public TestFrame(Treinador t1, Treinador t2){
        bgColor=new Color(0,0,255);
        fgColor=new Color(255,255,255);
        background=new JPanel();
        background.setBackground(bgColor);
        background.setSize(600, 400);
        label1=new JLabel();
        label1.setText("Nome do treinador 1:");
        label1.setForeground(fgColor);
        label1.setLocation(100, 100);
        label1.setVisible(true);
        
        label2=new JLabel();
        label2.setText("Nome do treinador 2:");
        label2.setForeground(fgColor);
        label2.setVisible(true);
        
        campo1=new JTextField();
        campo1.setText("Ash");
        campo1.setSize(250, 30);
        campo1.setVisible(true);
        
        campo2=new JTextField();
        campo2.setText("Gary");
        campo2.setSize(250, 30);
        campo2.setVisible(true);
        
        iniciar=new JButton();
        iniciar.setText("Iniciar!");
        iniciar.setVisible(true);
        iniciar.setSize(100,100);
        
        this.setSize(600, 400);
        this.setVisible(true);
        this.add(background, BorderLayout.CENTER);
        background.add(label1, BorderLayout.CENTER);
        background.add(campo1, BorderLayout.CENTER);
        background.add(label2, BorderLayout.CENTER);
        background.add(campo2, BorderLayout.CENTER);
        background.add(iniciar);
        
    }   
}
