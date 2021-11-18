package mycom.domain.duck;

import mycom.ui.MyFrame;

import java.awt.*;
import java.util.Random;

public class Duck {
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

    public void display(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(this.x,this.y,Duck.SIZE,Duck.SIZE);
    }

    public final void swim(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString("수영",this.x-10,this.y);
    }

    public void quack(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString("꽥꽥",this.x+20,this.y);
    }
}
