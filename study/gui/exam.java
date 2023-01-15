package com.study.gui;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.*;

class Window1 extends JPanel {
    int x1=0;
    int y1=100;
    int a=400;
    int b=200;
    String text1;

    public void paint(Graphics gp){
        super.paint(gp);
        Graphics2D g2d= (Graphics2D) gp;
        g2d.setColor(Color.MAGENTA);
        setBackground(Color.LIGHT_GRAY);
        g2d.setFont(new Font("BOLD", BOLD, 50));

        g2d.drawString(this.text1, x1, y1);
        try {
            Thread.sleep(200);
            x1+=20;
            a-=20;

            if(x1 > getWidth())
            {x1=0;}
            if(a<0){
                a=500;
            }
            repaint();

        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    Window1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your firstname: ");
        this.text1 = scan.nextLine();
    }
}

class Window2 extends JPanel {
    int x2=0;
    int y2=100;
    int a=400;
    int b=200;
    String text2;

    public void paint(Graphics gp){
        super.paint(gp);
        Graphics2D g2d= (Graphics2D) gp;
        g2d.setColor(Color.CYAN);
        setBackground(Color.DARK_GRAY);
        g2d.setFont(new Font("BOLD", BOLD, 50));

        g2d.drawString(this.text2, x2, y2);
        try {
            Thread.sleep(200);
            x2+=20;
            a-=20;

            if(x2 > getWidth())
            {x2 = 0;}
            if(a<0){
                a=500;
            }
            repaint();

        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    Window2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your midname:");
        this.text2 = scan.nextLine();
    }
}

class Window3 extends JPanel {
    int x3=0;
    int y3=100;
    int a=400;
    int b=200;
    String text3;

    public void paint(Graphics gp){
        super.paint(gp);
        Graphics2D g2d= (Graphics2D) gp;
        g2d.setColor(Color.green);
        setBackground(Color.lightGray);
        g2d.setFont(new Font("BOLD", BOLD, 50));

        g2d.drawString(this.text3, x3, y3);
        try {
            Thread.sleep(200);
            x3+=20;
            a-=20;

            if(x3 > getWidth())
            {x3 = 0;}
            if(a<0){
                a=500;
            }
            repaint();

        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    Window3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your lastname:");
        this.text3 = scan.nextLine();
        scan.close();
    }
}

class Window4 extends JPanel {
    int x2=0;
    int y2=100;
    int a=400;
    int b=200;
    String text2;

    public void paint(Graphics gp){
        super.paint(gp);
        Graphics2D g2d= (Graphics2D) gp;
        g2d.setColor(Color.CYAN);
        setBackground(Color.DARK_GRAY);
        g2d.setFont(new Font("BOLD", BOLD, 50));

        g2d.drawString(this.text2, x2, y2);
        try {
            Thread.sleep(200);
            x2+=20;
            a-=20;

            if(x2 > getWidth())
            {x2 = 0;}
            if(a<0){
                a=500;
            }
            repaint();

        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    Window4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your midname:");
        this.text2 = scan.nextLine();
    }
}

public class exam {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new Window1());
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);

        JFrame xy = new JFrame();
        xy.setSize(300, 300);
        xy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        xy.add(new Window2());
        xy.setLocationRelativeTo(null);
        xy.setVisible(true);

        JFrame ab = new JFrame();
        ab.setSize(300, 300);
        ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ab.add(new Window3());
        ab.setLocationRelativeTo(null);
        ab.setVisible(true);

        JFrame qi = new JFrame();
        qi.setSize(300, 300);
        qi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        qi.add(new Window4());
        qi.setLocationRelativeTo(null);
        qi.setVisible(true);

    }}