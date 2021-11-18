package mycom.domain.duck;

import java.awt.*;

public class RedDuck extends Duck{
    public RedDuck() {
        super();
    }

    public RedDuck(int x, int y) {
        super(x, y);
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(this.x,this.y,Duck.SIZE,Duck.SIZE);
    }

    public void fly(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString("날다",this.x-10,this.y+40);
    }
}
