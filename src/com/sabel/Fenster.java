package com.sabel;

import javax.swing.*;

public class Fenster extends JFrame {

    private JPanel jpContainer;
    private JButton jbtnHallo;


    public Fenster() {


        this.setTitle("Mein erstes Fenster");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initComponents();

        this.setSize(300, 300);
        this.setVisible(true);

    }

    public void initComponents() {
        jpContainer = new JPanel();
        jbtnHallo = new JButton("Hello");
        jpContainer.add(jbtnHallo);
        this.add(jpContainer);




    }


}
