package task1.task12.model;

import task1.task11.model.CCar;
import task1.task12.dao.IMove;
import task1.task12.dao.ISwim;

public class Amphibian extends CCar implements IMove, ISwim {
    public Amphibian(long coordinateX, long coordinateY, double price, double speed, double release) {
        super(coordinateX, coordinateY, price, speed, release);
    }

    @Override
    public void move() {
        System.out.println("Amphibian move");
    }

    @Override
    public void swim() {
        System.out.println("Amphibian swim");
    }

    @Override
    public String toString() {
        return "Amphibian{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", price=" + price +
                ", speed=" + speed +
                ", release=" + release +
                '}';
    }
}
