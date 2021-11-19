package mycom.duck.ui;

import mycom.duck.manager.DuckManager;
import mycom.duck.manager.DuckManagerImple;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public static int FRAME_WIDTH=800;
    public static int FRAME_HEIGHT=600;
    DuckManager duckManager=new DuckManagerImple();
    public MyFrame(){
        this.setSize(MyFrame.FRAME_WIDTH,MyFrame.FRAME_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        duckManager.displayAllDucks(g);
        duckManager.swimAllDucks(g);
        duckManager.quackDucks(g);
        duckManager.flyDucks(g);
    }
}
