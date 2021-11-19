package mycom.duck.domain;

import java.awt.*;

public class RubberDuck extends Duck{
    public RubberDuck() {
        super();
    }

    public RubberDuck(int x, int y) {
        super(x, y);
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(this.x,this.y, SIZE, SIZE);
    }

    @Override
    public void quack(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("삑삑",this.x+20,this.y);
    }
}
