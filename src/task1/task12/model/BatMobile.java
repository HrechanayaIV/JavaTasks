package task1.task12.model;

import task1.task11.model.CCar;
import task1.task12.dao.IFly;
import task1.task12.dao.IMove;
import task1.task12.dao.ISwim;

public class BatMobile extends CCar implements ISwim, IMove, IFly {
    public BatMobile(long coordinateX, long coordinateY, double price, double speed, double release) {
        super(coordinateX, coordinateY, price, speed, release);
    }

    @Override
    public void fly() {
        System.out.println("BatMobile fly");
    }

    @Override
    public void move() {
        System.out.println("BatMobile move");
    }

    @Override
    public void swim() {
        System.out.println("BatMobile swim");
    }

    @Override
    public String toString() {
        return "BatMobile{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", price=" + price +
                ", speed=" + speed +
                ", release=" + release +
                '}';
    }
}
