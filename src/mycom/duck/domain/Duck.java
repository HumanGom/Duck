package mycom.duck.domain;

import mycom.duck.ui.MyFrame;

import java.awt.*;
import java.util.Random;

public abstract class Duck {
    protected int x;
    protected int y;
    public static final int SIZE=30;

    public Duck() {
        Random random=new Random();
        this.x=random.nextInt(MyFrame.FRAME_WIDTH-100)+50;
        this.y=random.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
    }

    public Duck(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void display(Graphics g);

    public final void swim(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString("수영",this.x-10,this.y);
    }

    public abstract void quack(Graphics g);
}
