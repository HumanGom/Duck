package mycom.duck.domain;

import java.awt.*;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        super();
    }

    public DecoyDuck(int x, int y) {
        super(x, y);
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(this.x,this.y, SIZE, SIZE);
    }

    @Override
    public void quack(Graphics g) {

    }
}
