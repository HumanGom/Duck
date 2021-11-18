package mycom.domain.duck;

import java.awt.*;

public class MallardDuck extends Duck{
    public MallardDuck() {
        super();
    }

    public MallardDuck(int x, int y) {
        super(x, y);
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(this.x,this.y,Duck.SIZE,Duck.SIZE);
    }
    public void fly(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString("날다",this.x-10,this.y+40);
    }
}
