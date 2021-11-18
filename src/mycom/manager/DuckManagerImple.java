package mycom.manager;

import mycom.domain.duck.*;

import java.awt.*;
import java.util.Random;

public class DuckManagerImple implements DuckManager{
    private Duck[] ducks;

    public DuckManagerImple() {
        ducks=new Duck[10];
        this.makeRandomDucks();
    }
    public DuckManagerImple(int count){
        ducks=new Duck[count];
        this.makeRandomDucks();
    }
    @Override
    public void makeRandomDucks() {
        Random random=new Random();
        for (int i = 0; i < ducks.length; i++) {
            int type=random.nextInt(4);
            switch (type){
                case 0:
                    ducks[i]=new MallardDuck();
                    break;
                case 1:
                    ducks[i]=new RedDuck();
                    break;
                case 2:
                    ducks[i]=new DecoyDuck();
                    break;
                case 3:
                    ducks[i]=new RubberDuck();
                    break;
                default:
                    ducks[i]=new MallardDuck();
                    break;
            }
        }
    }

    @Override
    public void displayAllDucks(Graphics g) {
        for (Duck duck:ducks) {
            duck.display(g);
        }
    }

    @Override
    public void swimAllDucks(Graphics g) {
        for (Duck duck:ducks){
            duck.swim(g);
        }
    }

    @Override
    public void flyDucks(Graphics g) {
        for (Duck duck:ducks){
            if(duck instanceof MallardDuck){
                MallardDuck mduck=(MallardDuck) duck;
                mduck.fly(g);
            }else if(duck instanceof RedDuck){
                RedDuck rduck=(RedDuck) duck;
                rduck.fly(g);
            }
        }
    }

    @Override
    public void quackDucks(Graphics g) {
        for (Duck duck:ducks){
            duck.quack(g);
        }
    }
}
