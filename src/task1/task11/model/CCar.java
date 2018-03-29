package task1.task11.model;

import java.util.Arrays;

public class CCar extends CVehicle {
    private Engine engine;

    public CCar(long coordinateX, long coordinateY, double price, double speed, double release) {
        super(coordinateX, coordinateY, price, speed, release);
    }

    private class Engine {
        private double volume;
        private int power;
        private double fuelConsumption;

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public double getFuelConsumption() {
            return fuelConsumption;
        }

        public void setFuelConsumption(double fuelConsumption) {
            this.fuelConsumption = fuelConsumption;
        }

        @Override
        public String toString() {
            return "Engine starting{" +
                    "volume=" + volume +
                    ", power=" + power +
                    ", fuelConsumption=" + fuelConsumption +
                    '}';
        }

    }

    public static class RadioCassetteRecorder {
        private String manufacturer;
        private int price;
        private String[] options;

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String[] getOptions() {
            return options;
        }

        public void setOptions(String[] options) {
            this.options = options;
        }

        public void play() {
            System.out.println("Play music!");
        }

        @Override
        public String toString() {
            return "RadioCassetteRecorder{" +
                    "manufacturer='" + manufacturer + '\'' +
                    ", price=" + price +
                    ", options=" + Arrays.toString(options) +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CCar{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", price=" + price +
                ", speed=" + speed +
                ", release=" + release +
                ";\n " + engine +
                '}';
    }
}
