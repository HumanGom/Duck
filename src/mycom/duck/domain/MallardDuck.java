package mycom.duck.domain;

import java.awt.*;

public class MallardDuck extends Duck implements Flyable{
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
    @Override
    public void quack(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("꽥꽥",this.x+20,this.y);
    }
    public void fly(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString("날다",this.x-10,this.y+40);
    }
}
