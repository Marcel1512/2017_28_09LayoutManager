package com.sabel;



import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame {

    private JPanel JPanelNorth;
    private JPanel JPanelSouth;
    private JPanel JPanelEast;
    private JPanel JPanelWest;
    private JPanel JPanelCenter;


    private JLabel JLabelNorth;
    private JLabel JLabelSouth;
    private JLabel JLabelEast;
    private JLabel JLabelWest;
    private JLabel JLabelCenter;


    public Fenster() {
        super("BorderLayout");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.initComponents();
        this.setSize(300,300);
        this.setVisible(true);


    }

    private void initComponents() {

        JPanelSouth = new JPanel();
        JPanelWest = new JPanel();
        JPanelEast = new JPanel();
        JPanelNorth = new JPanel();
        JPanelCenter = new JPanel();



        JLabelSouth = new JLabel();
        JLabelWest = new JLabel();
        JLabelEast = new JLabel();
        JLabelNorth = new JLabel();
        JLabelCenter = new JLabel();
        JLabelCenter.setText("Center");
        JLabelNorth.setText("North");
        JLabelEast.setText("East");
        JLabelWest.setText("West");
        JLabelSouth.setText("South");
        JPanelSouth.setBackground(Color.cyan);
        JPanelWest.setBackground(Color.BLACK);
        JPanelNorth.setBackground(Color.green);
        JPanelCenter.setBackground(Color.red);
        JPanelEast.setBackground(Color.MAGENTA);
        JPanelCenter.setBorder(BorderFactory.createDashedBorder(Color.black));
        JPanelWest.setBorder(BorderFactory.createDashedBorder(Color.black));
        JPanelSouth.setBorder(BorderFactory.createDashedBorder(Color.black));
        JPanelNorth.setBorder(BorderFactory.createDashedBorder(Color.black));
        JPanelEast.setBorder(BorderFactory.createDashedBorder(Color.black));

        JPanelCenter.add(JLabelCenter);
        JPanelEast.add(JLabelEast);
        JPanelNorth.add(JLabelNorth);
        JPanelSouth.add(JLabelSouth);
        JPanelWest.add(JLabelWest);

        this.add(JPanelCenter, BorderLayout.CENTER);
        this.add(JPanelEast ,  BorderLayout.EAST);
        this.add(JPanelWest, BorderLayout.WEST);
        this.add(JPanelNorth, BorderLayout.NORTH);
        this.add(JPanelSouth, BorderLayout.SOUTH);
//        this.getContentPane().add(JPanelNorth);
//        this.getContentPane().add(JPanelEast);
//        this.getContentPane().add(JPanelCenter);
//        this.getContentPane().add(JPanelWest);
//        this.getContentPane().add(JPanelSouth);



    }


}


